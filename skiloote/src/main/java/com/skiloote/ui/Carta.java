package com.skiloote.ui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.skiloote.controller.Jogada;

public class Carta extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	private final JLabel iconeMostrar = new JLabel();
	private final JLabel iconeNaoMostrar = new JLabel();
	private final Cursor cursor = new Cursor(Cursor.HAND_CURSOR);


	/**
	 * Carta
	 */
	public Carta() {
		this(null, null);
	}


	/**
	 * Carta
	 * 
	 * @param icone
	 */
	public Carta(ImageIcon icone, ImageIcon naoMostrar) {
		componentes();
		configuracao(icone, naoMostrar);
		eventos();
	}
	
	private void componentes() {
		add(iconeMostrar);
		add(iconeNaoMostrar);
	}


	/**
	 * Configuracao
	 */
	private void configuracao(ImageIcon icone, ImageIcon naoMostrar) {
		setBackground(Color.WHITE);

		iconeMostrar.setIcon(icone);
		iconeNaoMostrar.setIcon(naoMostrar);

		iconeMostrar.setCursor(cursor);
		iconeNaoMostrar.setCursor(cursor);
		
		iconeMostrar.setVisible(Boolean.FALSE);
		iconeNaoMostrar.setVisible(Boolean.TRUE);
	}


	/**
	 * Eventos
	 */
	private void eventos() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Jogada.jogar((Carta) e.getComponent());
			}
		});
	}
	
	public void mostrar() {
		iconeMostrar.setVisible(true);
		iconeNaoMostrar.setVisible(false);
	}
	
	public void esconder() {
		iconeMostrar.setVisible(false);
		iconeNaoMostrar.setVisible(true);
	}
	
	@Override
	public boolean equals(Object obj) {
		Carta outro = (Carta) obj;
		return getIconeMostrar().getIcon().equals(outro.getIconeMostrar().getIcon())
				&& getIconeNaoMostrar().getIcon().equals(outro.getIconeNaoMostrar().getIcon());
	}
	
	public boolean podeClicar() {
		return isEnabled() && getIconeNaoMostrar().isVisible();
	}
	
	public JLabel getIconeMostrar() {
		return iconeMostrar;
	}
	
	public JLabel getIconeNaoMostrar() {
		return iconeNaoMostrar;
	}
	
}
