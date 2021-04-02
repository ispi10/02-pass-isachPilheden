package com.example.maven.calculator.Main;
import com.example.maven.calculator.classes.AdvancedCalculator;
import com.example.maven.calculator.classes.BasicCalculator;

public class Main {

	public static void main(String[] args) {
		BasicCalculator basicCalculator = new BasicCalculator();
		System.out.println(basicCalculator.addition(2, 9));
		System.out.println(basicCalculator.subtraction(27, 17));
		System.out.println(basicCalculator.multiplication(3.3, 4.5));
		System.out.println(basicCalculator.division(16, 2));
		System.out.println(basicCalculator.division(9, 0));

		
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println(advancedCalculator.square(10.0));
		System.out.println(advancedCalculator.cube(2));
		System.out.println(advancedCalculator.squareroot(81));
		System.out.println(advancedCalculator.log(1000));
		System.out.println(advancedCalculator.ln(Math.E));

		System.out.println(advancedCalculator.addition(2.5, 3.3));



	}

}
