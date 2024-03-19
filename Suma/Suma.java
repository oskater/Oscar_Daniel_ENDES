package Suma;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Suma {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suma window = new Suma();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Suma() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 450, 300);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero 1: ");
		lblNewLabel.setBounds(29, 23, 59, 13);
		getFrame().getContentPane().add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2: ");
		lblNumero.setBounds(29, 46, 59, 13);
		getFrame().getContentPane().add(lblNumero);
		
		txt1 = new JTextField();
		txt1.setBounds(145, 20, 96, 19);
		txt1.setColumns(10);
		getFrame().getContentPane().add(txt1);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(145, 43, 96, 19);
		getFrame().getContentPane().add(txt2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 103, 416, 150);
		getFrame().getContentPane().add(panel);
		
		JLabel lblSalida = new JLabel("Resultado");
		lblSalida.setFont(new Font("Tahoma", Font.PLAIN, 24));
		panel.add(lblSalida);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1=Integer.parseInt(txt1.getText());
				int n2=Integer.parseInt(txt2.getText());
				
				int suma=n1+n2;
				
				lblSalida.setText(String.format("%d+%d=%d", n1, n2, suma));
			}
		});
		btnNewButton.setBounds(145, 72, 96, 21);
		getFrame().getContentPane().add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSalida.setText("Resultado");
			}
		});
		btnLimpiar.setBounds(39, 72, 96, 21);
		getFrame().getContentPane().add(btnLimpiar);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}