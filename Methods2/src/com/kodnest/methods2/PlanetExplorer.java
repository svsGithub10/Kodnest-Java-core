package com.kodnest.methods2;

class PlanetExplorer {
	double  radius;
	double calculateSurfaceArea(double radius) {
		return 4.0*3.14*radius*radius;
	}
}
 class PlanetExplorerApp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlanetExplorer explorer=new PlanetExplorer();
		double area=explorer.calculateSurfaceArea(3.0);
		System.out.println(area);
	}
 }


