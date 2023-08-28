package com.project.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.gst.entity.Gst;
import com.project.gst.repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gstRepository;

	public String uploadGstValue(Gst g) {
		gstRepository.save(g);
		return "gst value saved";
	}

	public String uploadGstValueList(@RequestBody List<Gst> g) {
		gstRepository.saveAll(g);
		return "Gst list for all product saved";
	}

	public Gst getGst(@PathVariable int hsn) {
		return gstRepository.findById(hsn).get();
	}

	public List<Gst> getAllGstValue() {
		return gstRepository.findAll();
	}

	public String gstUpdate(Gst g) {
		gstRepository.save(g);
		return "Gst value updated succesfully";
	}

	public String deletegst(@PathVariable int id) {
		gstRepository.deleteById(id);
		return "gst value deleted successfully";
	}

	public int getPriceByHsn(int hsn) {
		return gstRepository.getPriceByHsn(hsn);
	}
	public int getPercentageByHsn(int hsn) {
		return gstRepository.getPercentageByHsn(hsn);
	}
}
