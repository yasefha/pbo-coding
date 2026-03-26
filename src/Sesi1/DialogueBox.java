package Sesi1;
import javax.swing.JOptionPane;

public class DialogueBox {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Anda sedang belajar apa?");
		
		if (input != null) {
			String answer = input.toLowerCase();
		
			if (answer.equals("pemrograman web")) {
				JOptionPane.showMessageDialog(null, "Belajar Pemrograman Web sangat mudah");
			} else {
				JOptionPane.showMessageDialog(null, "Anda belajar: " + input);
			}
		}
	}
}
