package com.student.result.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.result.entity.MarkSheet;
import com.student.result.entity.Results;
import com.student.result.repository.ResultRepository;

@Repository
public class ResultDao {
	@Autowired
	ResultRepository resrepo;

	public String insert(Results r) {
		resrepo.save(r);
		return "result details saved sucessfully";
	}

	public Results getResults(int id) {
		return resrepo.findById(id).get();
	}

	public String updateResults(Results r) {
		resrepo.save(r);
		return "results updated";
	}

	public String delete(int id) {
		resrepo.deleteById(id);
		return "result deleted succesfully";
	}

	public List<Results> getTable() {
		return resrepo.findAll();
	}

	public List<Results> getlist() {
		return resrepo.findAll();
	}
	public String addfivemarkpost(List<Results> result) {
		resrepo.saveAll(result);
		return "List saved saved successfully";
	}
}
