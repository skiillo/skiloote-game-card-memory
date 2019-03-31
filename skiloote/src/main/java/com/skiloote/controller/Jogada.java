package com.skiloote.controller;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import com.skiloote.ui.Carta;
import com.skiloote.ui.Tabuleiro;

public class Jogada {

	private static Carta cartaPrimeiraJogada = null;
	private static Carta cartaSegundaJogada = null;
	private static final int TEMPO_DE_ESPERA_MOSTRAR_CARTA = 500;
	private static int QUANTIDADE_CARTAS_PARES = Tabuleiro.level.getQtdTotalPares();


	/**
	 * Jogar
	 * 
	 * @param carta
	 */
	public static void jogar(Carta carta) {

		if (carta.podeClicar()) {

			if (cartaPrimeiraJogada == null) {
				cartaPrimeiraJogada = carta;
				cartaPrimeiraJogada.mostrar();
			}

			else if (cartaSegundaJogada == null) {
				cartaSegundaJogada = carta;
				cartaSegundaJogada.mostrar();
			}

			if (cartaPrimeiraJogada != null && cartaSegundaJogada != null) {

				new Timer().schedule(new TimerTask() {
					@Override
					public void run() {
						validarJogada(cartaPrimeiraJogada, cartaSegundaJogada);
						cartaPrimeiraJogada = null;
						cartaSegundaJogada = null;
					}
				},
						TEMPO_DE_ESPERA_MOSTRAR_CARTA);
			}
		}

	}

	/**
	 * Validar Jogada
	 * 
	 * @param cartaUm
	 * @param cartaDois
	 */
	private static void validarJogada(Carta cartaUm, Carta cartaDois) {
		if (cartaUm.equals(cartaDois)) {
			cartaUm.setEnabled(false);
			cartaDois.setEnabled(false);
			validaJogoFinalizado();
		}
		else {
			cartaUm.esconder();
			cartaDois.esconder();
		}
	}
	
	private static void validaJogoFinalizado() {
		QUANTIDADE_CARTAS_PARES--;
		
		if (QUANTIDADE_CARTAS_PARES == 0) {
			JOptionPane.showMessageDialog(null, "Acabooouuuuu \nVocê venceu Skiloote !!!");
		}
	}

}
