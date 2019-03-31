package com.skiloote.ui;

import javax.swing.JFrame;

import com.skiloote.util.Level;

public class Tabuleiro extends JFrame {

	// TODO: Retirar o hardcode da seleção de Level
	public static final Level level = Level.MEDIO;
	
	private final int ALTURA = 800;
	private final int LARGURA = 800;
	

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public Tabuleiro() {
		super("Skilloote");
		setVisible(Boolean.TRUE);
		setSize(LARGURA, ALTURA);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		componentes();
	}

	/**
	 * Componentes
	 */
	private void componentes() {
		add(new Painel(level));
	}
	
}
