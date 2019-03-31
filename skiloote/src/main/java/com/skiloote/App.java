package com.skiloote;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingUtilities;

import com.skiloote.ui.Tabuleiro;

public class App {

	private static final Logger logger = Logger.getLogger(App.class.getName());

	/**
	 * Main
	 * 
	 * @param args
	 * @throws InterruptedException
	 * @throws InvocationTargetException
	 */
	public static void main(String[] args) {

		try {

			SwingUtilities.invokeAndWait(() -> new Tabuleiro());

		} catch (InvocationTargetException | InterruptedException e) {
			logger.log(Level.SEVERE, "Error ao inciiar o app : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
