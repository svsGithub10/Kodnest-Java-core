package com.kodnest.controlstatement3;
//non static class for PolygonApp
public class Polygon {
	void Identify(int s) {	//method to identify polygon type
		switch(s) {	//validating the sides
		case 3: System.out.println("Triangle");	//for 3 sides
		break;
		case 4: System.out.println("Quadrilateral");	//for 4 sides
		break;
		case 5: System.out.println("Pentagon");	//for 5 sides
		break;
		case 6: System.out.println("Hexagon");	//for 6 sides
		break;
		case 7: System.out.println("Heptagon");	//for 7 sides
		break;
		case 8: System.out.println("Octagon");	//for 8 sides
		break;
		case 9: System.out.println("Nanogon"); //for 9 sides
		break;
		case 10: System.out.println("Decagon");	//for 10 sides
		break;
		default : System.out.println("Invalid input");	//for invalid input
		break;
		}
	}
}
