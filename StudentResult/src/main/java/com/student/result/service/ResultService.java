package com.student.result.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.result.dao.ResultDao;
import com.student.result.entity.MarkSheet;
import com.student.result.entity.Results;

@Service
public class ResultService {
	@Autowired
	ResultDao resdao;

	public String insert(Results r) {
		return resdao.insert(r);
	}

	public Results getResults(int id) {
		return resdao.getResults(id);
	}

	public String updateResults(Results r) {
		return resdao.updateResults(r);
	}

	public String delete(int id) {
		return resdao.delete(id);
	}

	public List<Results> getTable() {
		return resdao.getTable();
	}

	public List<Results> getlist() {
		return resdao.getlist();
	}

	public Results topper() {
		List<Results> kk = resdao.getlist();
		return kk.stream().max(Comparator.comparing(Results::getTotalMarks)).get();
	}

	public List<Results> topthree() {
		List<Results> k = resdao.getlist();
		List<Results> a = k.stream().sorted(Comparator.comparing(Results::getTotalMarks).reversed()).limit(3)
				.collect(Collectors.toList());
		return a;
	}

	public String addfivemarkpost(List<Results> result) {
		return resdao.addfivemarkpost(result);
	}
}
