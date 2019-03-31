package com.skiloote;

public class FuncaoExponencial {

	public static void main(String[] args) {
		
		double[] valoresInciais = new double[] { -3, -2, -1, 0, 1, 2, 3 };
		
		FuncaoExponencial exponencial = new FuncaoExponencial();
		exponencial.gerarTabelaDoGrafico(
				valoresInciais, 
				exponencial.calcularValorDeY(valoresInciais)
		);

	}
	
	public double[] calcularValorDeY(double[] valoresX) { 
		double[] valoresY = new double[valoresX.length];
		
		for (int i = 0; i < valoresX.length; i++) {
			valoresY[i] = Math.pow(2.0, valoresX[i]);
		}
		
		return valoresY;
	}
	
	public void gerarTabelaDoGrafico(double[] valoresX, double[] valoresY) {
		
		boolean vetoresMesmoTamanho = valoresX.length == valoresY.length;
		int tamanhoVetor = vetoresMesmoTamanho ? valoresX.length : 0;
		
		double[][] resultado = new double[tamanhoVetor][2];
		
		if (vetoresMesmoTamanho) {
			for (int i = 0; i < resultado.length; i++) {
				resultado[i][0] = valoresX[i];
				resultado[i][1] = valoresY[i];
			}
		}
		
		for (int i = 0; i < resultado.length; i++) {
			System.out.printf("| %.2f | %.2f |\n", resultado[i][0], resultado[i][1]);
		}

	}

}
