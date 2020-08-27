package com.deepsingh44;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="stdtpc")
public class Student extends Person {
	private int roll;
	private float marks;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

}
