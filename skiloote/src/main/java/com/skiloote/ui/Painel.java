package com.skiloote.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

import com.skiloote.util.Level;

public class Painel extends JPanel {


	private final int LINHAS = 4;
	private final int COLUNAS = 4;
	private List<Carta> cartas = new ArrayList<Carta>();


	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;


	public Painel(Level level) {
		setName("painel-princiapl");
		setBackground(Color.WHITE);
		setLayout(new GridLayout(LINHAS, COLUNAS));
		componentes(level);
		embaralhar();
	}
	
	
	public void esconder() {
		cartas.forEach(Carta::esconder);
	}
	
	public void embaralhar() {
		List<Carta> cartas = new ArrayList<Carta>();
		
		for (Component component : getComponents()) {
			if (component instanceof Carta) {
				cartas.add((Carta) component);
				remove(component);
			}
		}
		
		Collections.reverse(cartas);
		Collections.shuffle(cartas);
		Collections.reverse(cartas);
		Collections.shuffle(cartas);
		
		for (Carta carta : cartas) {
			add(carta);
		}
	}


	/**
	 * Componentes
	 */
	private void componentes(Level level) {
		for (int i = 0; i < level.getQtdTotalPares(); i++) {
			add(new Carta(Icone.get(i), Icone.NAO_MOSTRAR));
			add(new Carta(Icone.get(i), Icone.NAO_MOSTRAR));
		}
	}
	
}
