package com.movieapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Screen {

	@Id
	@GeneratedValue(generator = "screen_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "screen_gen",sequenceName = "screen_sequence",initialValue = 1,allocationSize = 1)
	private Integer screenId;
	@Column(length = 20)
	private Type type;
	private double size;
	@Column(length = 20)
	private Specialization specialization;
	public Screen() {
		super();
	}
	public Screen(Type type, double size, Specialization specialization) {
		super();
		this.type = type;
		this.size = size;
		this.specialization = specialization;
	}
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", type=" + type + ", size=" + size + ", specialization="
				+ specialization + "]";
	}
	
	
}
