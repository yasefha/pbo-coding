package materi;

import java.awt.Color;

import javax.swing.JFrame;

public class MyForm extends JFrame{
	public MyForm() {
		super("Belajar GUI");
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.GREEN);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MyForm form = new MyForm();

	}

}
