package com.kodnest.methods2;

class HeightConverter {

	double inches;
	double convertInchesToFeet(double inches) {
		return inches/12.0;
	}

}
class HeightConverterApp{
	public static void main(String[] args) {
		HeightConverter converter=new HeightConverter();
		double feet=converter.convertInchesToFeet(72.0);
		System.out.println(feet);
	}
}
