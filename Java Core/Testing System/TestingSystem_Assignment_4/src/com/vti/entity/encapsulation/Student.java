package com.vti.entity.encapsulation;

public class Student {
	private int student_Id;
	private String student_Name;
	private String hometown;
	private float score;
	
	public Student() {}
	
	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Student(String name, String home){
		student_Name = name;
		hometown=home;
		score = 0;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	public void PlusScote(float a) {
		score += a;
	}
	@Override
	public String toString() {
		String string;
		if (score<4) {
			
			string ="Yếu";
		}
		else if (score<6) {
			
			string ="TB";
		}
		else if (score<8) {
			
			string ="Khá";
		}
		else {
			
			string ="Giỏi";
		}
		return ("Name: " + student_Name + " ,Xếp loại: " + string);
	}

}
