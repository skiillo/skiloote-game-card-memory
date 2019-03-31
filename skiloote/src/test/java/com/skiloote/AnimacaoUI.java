package com.skiloote;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class AnimacaoUI extends JPanel implements ActionListener, KeyListener {

	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;
	
	private int X = 10;
	private int Y = 10;
	// private int velocidadeX = 2;
	// private int velocidadeY = 2;
	
	private final Timer timer = new Timer(10, this);
	
	public AnimacaoUI() {
		timer.start();
		setFocusable(true);
		addKeyListener(this);
		setFocusTraversalKeysEnabled(false);
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;


	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {
			final AnimacaoUI ui = new AnimacaoUI();

			final JFrame frame = new JFrame("AnimacaoUI");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBackground(Color.WHITE);
			frame.setSize(WIDTH, HEIGHT);
			frame.setResizable(false);
			frame.setVisible(true);
			frame.add(ui);

		});

	}
	
	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		graphics.setColor(new Color(142, 68, 173));
		graphics.fillRect(X, Y, 20, 20);
		timer.start();
	}


	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) X = X + 5;
		if (e.getKeyCode() == KeyEvent.VK_LEFT) X = X - 5;
		if (e.getKeyCode() == KeyEvent.VK_UP) Y = Y - 7;
		if (e.getKeyCode() == KeyEvent.VK_DOWN) Y = Y + 8;
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//if (X > (WIDTH - 40)) X = 10;
		//X = X + velocidadeX;
		//Y = Y + velocidadeY;
		repaint();
	}
}
