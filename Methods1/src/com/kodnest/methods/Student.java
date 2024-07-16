package com.kodnest.methods;

public class Student {
		String name;
		int roll_no;
		int age;
		String gender;
		float percentage;
		void study() {
			System.out.println(name+" is studying");
			System.out.println("Roll no :"+roll_no);
			System.out.println("Age :"+age);
			System.out.println("Gender :"+gender);
			System.out.println("Percentage :"+percentage);
			System.out.println();
		}
	
class StudentApp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1=new Student();
		S1.name="SVS";
		S1.roll_no=128;
		S1.age=22;
		S1.gender="Male";
		S1.percentage=90;
		S1.study();
		Student S2=new Student();
		S2.name="Guru";
		S2.roll_no=158;
		S2.age=22;
		S2.gender="Male";
		S2.percentage=70;
		S2.study();
		
		}
	}
}
