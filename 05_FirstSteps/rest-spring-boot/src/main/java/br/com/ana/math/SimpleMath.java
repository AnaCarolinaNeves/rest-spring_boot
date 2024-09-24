package br.com.ana.math;

public class SimpleMath {

	public Double sum(Double numberOne,Double numberTwo) {
		return numberOne + numberTwo;
	}

	public Double sub( Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
	
	public Double multi(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public Double divi(Double numberOne, Double numberTwo) {
		return (numberOne) / (numberTwo);
	}
	
	public Double med(Double numberOne, Double numberTwo) {
		return (numberOne + numberTwo) / 2;
	}
	
	public Double sqRoot(Double number) {
		return Math.sqrt(number);
	}
}
