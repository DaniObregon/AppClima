package appClima;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Clima extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clima frame = new Clima();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Clima() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		
		JLabel lblNewLabel_21 = new JLabel("Diciembre, 26");
		lblNewLabel_21.setBounds(242, 570, 73, 14);
		lblNewLabel_21.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_21.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_20 = new JLabel("Diciembre, 27");
		lblNewLabel_20.setBounds(242, 656, 86, 14);
		lblNewLabel_20.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_20.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_19 = new JLabel("Diciembre, 25");
		lblNewLabel_19.setBounds(242, 485, 73, 14);
		lblNewLabel_19.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_19.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_18 = new JLabel("Domingo");
		lblNewLabel_18.setBounds(242, 625, 73, 14);
		lblNewLabel_18.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_18.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_17 = new JLabel("S\u00E1bado");
		lblNewLabel_17.setBounds(242, 541, 73, 14);
		lblNewLabel_17.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_17.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_16 = new JLabel("Viernes");
		lblNewLabel_16.setBounds(242, 453, 73, 14);
		lblNewLabel_16.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_16.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_15 = new JLabel("27\u00B0C");
		lblNewLabel_15.setBounds(26, 641, 46, 17);
		lblNewLabel_15.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_15.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_14 = new JLabel("30\u00B0C");
		lblNewLabel_14.setBounds(26, 556, 46, 17);
		lblNewLabel_14.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_14.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13 = new JLabel("29\u00B0C");
		lblNewLabel_13.setBounds(26, 466, 46, 17);
		lblNewLabel_13.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_13.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_12 = new JLabel("X");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(407, 11, 33, 25);
		lblNewLabel_12.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_12.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_11 = new JLabel("Viento 6Km/h.");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(164, 360, 128, 25);
		lblNewLabel_11.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_11.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_10 = new JLabel("Sensaci\u00F3n t\u00E9rmica 30\u00B0C");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(126, 338, 202, 25);
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel_10.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Hoy");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(126, 265, 202, 69);
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.PLAIN, 22));
		lblNewLabel_9.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("Soleado");
		lblNewLabel_8.setBounds(26, 99, 73, 20);
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_8.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("Francisco Alvarez, Buenos Aires");
		lblNewLabel_7.setBounds(26, 77, 255, 20);
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel_7.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("27\u00B0C");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(26, 38, 73, 37);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Clima.class.getResource("/Resources/Banner.png")));
		lblNewLabel.setBounds(0, 0, 456, 415);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Clima.class.getResource("/Resources/Rect\u00E1ngulo 1.png")));
		lblNewLabel_1.setBounds(0, 422, 440, 126);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Clima.class.getResource("/Resources/Rect\u00E1ngulo 2.png")));
		lblNewLabel_2.setBounds(0, 521, 450, 109);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Clima.class.getResource("/Resources/Rect\u00E1ngulo 3.png")));
		lblNewLabel_3.setBounds(0, 608, 440, 102);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Clima.class.getResource("/Resources/Graficas.png")));
		lblNewLabel_4.setBounds(10, 360, 120, 69);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Clima.class.getResource("/Resources/Mapa.png")));
		lblNewLabel_5.setBounds(359, 360, 81, 66);
		contentPane.add(lblNewLabel_5);
	}
}
