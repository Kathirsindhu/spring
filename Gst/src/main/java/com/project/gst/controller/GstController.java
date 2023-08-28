package com.project.gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.gst.entity.Gst;
import com.project.gst.service.GstService;

@RestController
@RequestMapping(value = "/gst")
public class GstController {
	@Autowired
	GstService gstService;

	@PostMapping(value = "/uploadgstvalue")
	public String uploadGstValue(@RequestBody Gst g) {
		return gstService.uploadGstValue(g);
	}

	@PostMapping(value = "/uploadGstValueForAllProducts")
	public String uploadGstValueList(@RequestBody List<Gst> g) {
		return gstService.uploadGstValueList(g);
	}

	@GetMapping(value = "/getgstvalue/{hsn}")
	public Gst getGst(@PathVariable int hsn) {
		return gstService.getGst(hsn);
	}

	@GetMapping(value = "/getallgstvalue")
	public List<Gst> getAllGstValue() {
		return gstService.getAllGstValue();
	}

	@PutMapping(value = "/updategst")
	public String gstUpdate(@RequestBody Gst g) {
		return gstService.gstUpdate(g);
	}

	@DeleteMapping(value = "/deletegstvalue/{id}")
	public String deletegst(@PathVariable int id) {
		return gstService.deletegst(id);
	}

	@GetMapping(value = "/getpricebyhsn/{hsn}")
	public int getPriceByHsn(@PathVariable int hsn) {
		return gstService.getPriceByHsn(hsn);
	}

	@GetMapping(value = "/getpercentagebyhsn/{hsn}")
	public int getPercentageByHsn(@PathVariable int hsn) {
		return gstService.getPercentageByHsn(hsn);
	}
}
