package com.project.gst.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gst_details")
public class Gst {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int percentage;
	private int hsn;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public int getHsn() {
		return hsn;
	}

	public void setHsn(int hsn) {
		this.hsn = hsn;
	}
}
