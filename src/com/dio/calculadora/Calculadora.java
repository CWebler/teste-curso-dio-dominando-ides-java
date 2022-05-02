package com.dio.calculadora;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Digite o primeiro valor:");
		a = scan.nextInt();
		 System.out.println("Digite o segundo valor:");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		float divisão = divisão((float)a,(float)b);
		int multipicacao = multipicacao(a,b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisão);
		System.out.println(multipicacao);

		
	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	
	public static int subtracao(int a, int b) {
		return a - b;
}
	public static float divisão (float a, float b) {
		return a / b;
	}
	
	public static int multipicacao(int a, int b) {
		return a * b;
	}
}
		
		
		

