package com.skiloote.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class Log extends Logger {

	/**
	 * Log
	 * @param name
	 * @param resourceBundleName
	 */
	private Log(String name, String resourceBundleName) {
		super(name, resourceBundleName);
	}

	
	/**
	 * Info
	 * @param mensagem
	 */
	public static void i(String mensagem) {
		Logger.getGlobal().log(Level.INFO, mensagem);
	}
	
	/**
	 * Error
	 * @param mensagem
	 */
	public static void e(String mensagem) {
		Logger.getGlobal().log(Level.SEVERE, mensagem);
	}
	
	/**
	 * Warning
	 * @param mensagem
	 */
	public static void w(String mensagem) {
		Logger.getGlobal().log(Level.WARNING, mensagem);
	}

}
