package com.example.maven.calculator.classes;
import com.example.maven.calculator_interfaces.AdvancedOperations;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{
	
	public double square(double number) {
		return number * number;
		//3^2 = 9
	}

	public double cube(double number) {
		return number * number * number;
		//4^3 = 64
	}
	public double squareroot(double number) {
		return Math.sqrt(number);
		//√25 = 5
	}

	public double log(double number) {
		return Math.log10(number);
		//base 10 log, log100 = 2, log1000 = 3.
	}
	public double ln(double number) {
		return Math.log(number);
		//natural log, which is in base e i think :), ln e = 1, ln 100 =4,6052.
	}
}
