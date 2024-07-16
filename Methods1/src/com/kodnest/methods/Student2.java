package com.kodnest.methods;

public class Student2 {
	String name;
	int roll_no;
	int age;
	String gender;
	float percentage;
	public Student2(String a,int b, int c, String d, float e) {
		name=a;
		roll_no=b;
		age=c;
		gender=d;
		percentage=e;
	}
	void study() {
		System.out.println(name+" is studying");
		System.out.println("Roll no :"+roll_no);
		System.out.println("Age :"+age);
		System.out.println("Gender :"+gender);
		System.out.println("Percentage :"+percentage);
		System.out.println();
	}
}
class StudentApp{
	public static void main(String args[]) {
		Student2 S1=new Student2("SVS",120,22,"Male",87.32f);
		S1.study();
		new Student2("Guru",150,22,"Male",85.22f).study();
	}
}