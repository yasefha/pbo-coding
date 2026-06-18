package materi;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyForm2 extends JFrame{
	JButton b1 = new JButton("Tombol 1");
	JButton b2 = new JButton("Tombol 2");
	JButton b3 = new JButton("Tombol 3");
	JButton b4 = new JButton("Tombol 4");
	JButton b5 = new JButton("Tombol 5");
	
	public MyForm2() {
		// TODO Auto-generated constructor stub
		super("Belajar GUI");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.GRAY);
		setLocationRelativeTo(null);
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		setLayout(f1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyForm2 form = new MyForm2();
	}
}
