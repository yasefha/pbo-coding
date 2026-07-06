package sesi12.app;

import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			FormBiodata form = new FormBiodata();
			form.setVisible(true);
		});
	}
}
