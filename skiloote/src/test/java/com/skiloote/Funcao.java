package com.skiloote;

public class Funcao {
	
	public static void main(String[] args) {
		
		Funcao funcao = new Funcao();
		
		int x = 0;
		int x1 = 1;
		
		double resultadoX = funcao.f(x) + 1;
		double resultadoX1 = funcao.f(x1) - 1;
		
		System.out.println(" f(x) + 1 = " + resultadoX);
		System.out.println(" f(x) - 1 = " + resultadoX1);
		
	}
	
	public double f(int x) {
		return 3 * x + 1;
	}

}
