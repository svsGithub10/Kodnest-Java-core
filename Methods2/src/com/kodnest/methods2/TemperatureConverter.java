package com.kodnest.methods2;

class TemperatureConverter {
	double F,C;
	double convertFahrenheitToCelcius(Double F) {
		C=(F-32)*(5.0/9.0);
		return C;
	}
}

class TemperatureConverterApp{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureConverter T=new TemperatureConverter();
		System.out.println(T.convertFahrenheitToCelcius(68.0));
	}

}
