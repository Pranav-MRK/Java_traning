package Assigment.Ques6;

public class ComplexNumber {
	private double real;
	private double imaginary;

	public ComplexNumber() {
		this.real = 0.0;
		this.imaginary = 0.0;
		System.out.println("Called the default constructor...");
	}

	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	public void display() {
		System.out.println("Complex Number: " + real +" "+ imaginary + "i");
	}
}
