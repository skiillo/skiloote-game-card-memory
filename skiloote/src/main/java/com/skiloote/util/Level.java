package com.skiloote.util;

public class Level {

	public static final Level FACIL = new Level(12, "FÁCIL");
	public static final Level MEDIO = new Level(24, "MÉDIO");
	public static final Level DIFICIL = new Level(48, "DIFÍCIL");
	
	private final int qtdTotalCartas;
	private final int qtdTotalPares;
	private final String descricao;
	
	/**
	 * Level
	 * @param qtdTotalCartas
	 * @param qtdTotalPares
	 * @param descricao
	 */
	private Level(int qtdTotalCartas, String descricao) {
		this.qtdTotalCartas = qtdTotalCartas;
		this.qtdTotalPares = qtdTotalCartas / 2;
		this.descricao = descricao;
	}

	public int getQtdTotalCartas() {
		return qtdTotalCartas;
	}

	public int getQtdTotalPares() {
		return qtdTotalPares;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
