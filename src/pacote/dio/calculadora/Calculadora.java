package pacote.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double a,b;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		
		double soma = soma(a,b);
		double sub = sub(a,b);
		double mult = mult(a,b);
		double div = div(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);
		
		
		scanner.close();
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	public static double sub(double a, double b) {
		return a - b;
	}
	public static double mult(double a, double b) {
		return a * b;
	}
	public static double div(double a, double b) {
		return a / b;
	}
}
