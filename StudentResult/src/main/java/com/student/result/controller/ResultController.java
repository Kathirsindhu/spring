package com.student.result.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.student.result.entity.MarkSheet;
import com.student.result.entity.Results;
import com.student.result.entity.Student;
import com.student.result.service.ResultService;

@RestController
@RequestMapping("/results")
public class ResultController {
	@Autowired
	ResultService resser;

	@PostMapping("/insert")
	public String insert(@RequestBody Results r) {
		return resser.insert(r);
	}

	@GetMapping("/getresults")
	public Results getResults(@PathVariable int id) {
		return resser.getResults(id);
	}

	@GetMapping("/getallaslist")
	public List<Results> getlist() {
		return resser.getlist();
	}

	@PutMapping("/update")
	public String updateResults(@RequestBody Results r) {
		return resser.updateResults(r);
	}

	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return resser.delete(id);

	}

	@GetMapping("/getoveralltotal")
	public List<Results> getTable() {
		return resser.getTable();
	}

	@GetMapping("/topper")
	public Results topper() {
		return resser.topper();
	}

	@GetMapping("/topperthree")
	public List<Results> topthree() {
		return resser.topthree();
	}

	RestTemplate rest = new RestTemplate();

	@PostMapping("/addfivemarkpost")
	public String addfivemarkpost() {
		String url1 = "http://localhost:8080/student/getallaslist";
		ResponseEntity<List<Student>> studentResponse = rest.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		List<Student> student1 = studentResponse.getBody();
		List<Results> res = new ArrayList<>();

		for (Student x : student1) {
			String url2 = "http://localhost:8081/marksheet/getmarks/";
			ResponseEntity<MarkSheet> markResponse = rest.exchange(url2 + x.getId(), HttpMethod.GET, null,
					new ParameterizedTypeReference<MarkSheet>() {
					});
			MarkSheet marksheet = markResponse.getBody();
			int total = (marksheet.getSem1Total() + marksheet.getSem2Total()) / 2;
			int percentage = total * 100 / 100;

			Results r = new Results();
			if (x.getAttendance() > 90) {
				total = total + 5;
				percentage = total;
				if (total > 100) {
					total = 100;
				}
			}
			r.setRollNumber(x.getRollNumber());
			r.setName(x.getName());
			r.setTotalMarks((marksheet.getSem1Total() + marksheet.getSem2Total()) / 2);
			r.setPercentage(r.getTotalMarks() * 100 / 100);
			res.add(r);
		}
		return resser.addfivemarkpost(res);
	}

	@GetMapping("/rangeofmark")
	public List<Results> rangeofmark() {
//		String url = "http://localhost:8082/marksheet/getalllist";
//		ResponseEntity<Results> res = rest.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<Results>() { 
//		
//			});
		List<Results> mm = resser.getTable();
		List<Results> kk = mm.stream().filter(x -> x.getTotalMarks() >= 70 && x.getTotalMarks() <= 90)
				.collect(Collectors.toList());
		return kk;
	}
}
