package com.project.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.gst.dao.GstDao;
import com.project.gst.entity.Gst;

@Service
public class GstService {
	@Autowired
	GstDao gstDao;

	public String uploadGstValue(Gst g) {
		return gstDao.uploadGstValue(g);
	}

	public String uploadGstValueList(List<Gst> g) {
		return gstDao.uploadGstValueList(g);
	}

	public Gst getGst(int hsn) {
		return gstDao.getGst(hsn);
	}
	public List<Gst> getAllGstValue() {
		return gstDao.getAllGstValue();
	}
	public String gstUpdate(Gst g) {
		return gstDao.gstUpdate(g);
	}
	public String deletegst(@PathVariable int id) {
		return gstDao.deletegst(id);
	}
	public int getPriceByHsn(int hsn) {
		return gstDao.getPriceByHsn(hsn);
	}
	public int getPercentageByHsn(int hsn) {
		return gstDao.getPercentageByHsn(hsn);
	}
}
