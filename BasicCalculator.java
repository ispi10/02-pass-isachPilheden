package com.example.maven.calculator.classes;
import com.example.maven.calculator_interfaces.BasicOperations;

public class BasicCalculator {
	
	public double addition(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	public double subtraction(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		if (Double.isInfinite(result)) {
			System.out.println("Impossible");
			return -0.125;
		}
		else {
			return result;
		}
	}

	

}
