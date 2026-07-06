package sesi12.app;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;

public class FormBiodata extends JFrame{
	private JTextField txtNim;
	private JTextField txtNama;
	private JTextField txtProdi;
	
	private JButton btnTampil;
	private JButton btnReset;
	
	private JTextArea txtOutput;
	
	public FormBiodata() {
		setTitle("Aplikasi Biodata Mahasiswa");
		setSize(500, 420);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		buatKomponen();
		buatEvent();
	}
	
	private void buatKomponen() {
		JPanel panelInput = new JPanel();
		panelInput.setBorder(new TitledBorder("Input Data"));
		panelInput.setLayout(null);
		panelInput.setBounds(10, 10, 465, 160);
		
		add(panelInput);
		
		JLabel lblNim = new JLabel("NIM");
		lblNim.setBounds(20, 30, 100, 25);
		panelInput.add(lblNim);
		
		txtNim = new JTextField();
		txtNim.setBounds(130, 30, 300, 25);
		panelInput.add(txtNim);
		
		JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(20, 65, 100, 25);
        panelInput.add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(130, 65, 300, 25);
        panelInput.add(txtNama);

        JLabel lblProdi = new JLabel("Program Studi");
        lblProdi.setBounds(20, 100, 100, 25);
        panelInput.add(lblProdi);

        txtProdi = new JTextField();
        txtProdi.setBounds(130, 100, 300, 25);
        panelInput.add(txtProdi);

        btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(130, 130, 100, 25);
        panelInput.add(btnTampil);

        btnReset = new JButton("Reset");
        btnReset.setBounds(240, 130, 80, 25);
        panelInput.add(btnReset);

        JPanel panelOutput = new JPanel();
        panelOutput.setBorder(new TitledBorder("Output"));
        panelOutput.setLayout(null);
        panelOutput.setBounds(10, 180, 465, 190);

        add(panelOutput);

        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scroll = new JScrollPane(txtOutput);
        scroll.setBounds(10, 20, 445, 160);

        panelOutput.add(scroll);
	}
	
	private void buatEvent() {

	    // Tombol Tampilkan
	    btnTampil.addActionListener(e -> {

	        String nim = txtNim.getText();
	        String nama = txtNama.getText();
	        String prodi = txtProdi.getText();

	        // Validasi
	        if (nim.isEmpty() || nama.isEmpty() || prodi.isEmpty()) {

	            JOptionPane.showMessageDialog(
	                    this,
	                    "Semua data harus diisi!",
	                    "Peringatan",
	                    JOptionPane.WARNING_MESSAGE);

	            return;

	        }

	        StringBuilder hasil = new StringBuilder();

	        hasil.append("=========== BIODATA MAHASISWA ===========\n\n");

	        hasil.append("NIM            : ").append(nim).append("\n");
	        hasil.append("Nama           : ").append(nama).append("\n");
	        hasil.append("Program Studi  : ").append(prodi);

	        txtOutput.setText(hasil.toString());

	    });

	    // Tombol Reset
	    btnReset.addActionListener(e -> {

	        txtNim.setText("");
	        txtNama.setText("");
	        txtProdi.setText("");
	        txtOutput.setText("");

	        txtNim.requestFocus();

	    });

	}
}
