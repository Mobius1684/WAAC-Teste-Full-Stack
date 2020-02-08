package br.com.systemUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Panel;
import java.awt.Color;

public class MainUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAutoRequestFocus(false);
		frame.setBounds(10, 10, 800, 600);
		SpringLayout layout = new SpringLayout();
		frame.getContentPane().setLayout(layout);
		
		JLabel LabelTitulo = new JLabel("N\u00FAmeros para o tri\u00E2ngulo ");
		LabelTitulo.setName("LabelTitulo");
		LabelTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		layout.putConstraint(SpringLayout.NORTH, LabelTitulo, 10, SpringLayout.NORTH, frame.getContentPane());
		layout.putConstraint(SpringLayout.WEST, LabelTitulo, 258, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(LabelTitulo);
		
		JLabel lblPrimeiraLinha = new JLabel("Primeira Linha");
		lblPrimeiraLinha.setName("lblPrimeiraLinha");
		layout.putConstraint(SpringLayout.NORTH, lblPrimeiraLinha, 55, SpringLayout.NORTH, frame.getContentPane());
		layout.putConstraint(SpringLayout.WEST, lblPrimeiraLinha, 10, SpringLayout.WEST, frame.getContentPane());
		lblPrimeiraLinha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblPrimeiraLinha);
		
		JLabel lblSegundaLinha = new JLabel("Segunda Linha");
		lblSegundaLinha.setName("lblSegundaLinha");
		layout.putConstraint(SpringLayout.NORTH, lblSegundaLinha, 0, SpringLayout.NORTH, lblPrimeiraLinha);
		layout.putConstraint(SpringLayout.WEST, lblSegundaLinha, 77, SpringLayout.EAST, lblPrimeiraLinha);
		lblSegundaLinha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblSegundaLinha);
		
		JLabel lblTerceiraLinha = new JLabel("Terceira Linha");
		lblTerceiraLinha.setName("lblTerceiraLinha");
		layout.putConstraint(SpringLayout.NORTH, lblTerceiraLinha, 0, SpringLayout.NORTH, lblPrimeiraLinha);
		layout.putConstraint(SpringLayout.EAST, lblTerceiraLinha, 0, SpringLayout.EAST, LabelTitulo);
		lblTerceiraLinha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblTerceiraLinha);
		
		JComboBox comboBox1Linha1 = new JComboBox();
		comboBox1Linha1.setName("comboBox1Linha1");
		comboBox1Linha1.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox1Linha1.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox1Linha1, 27, SpringLayout.SOUTH, lblPrimeiraLinha);
		layout.putConstraint(SpringLayout.WEST, comboBox1Linha1, 0, SpringLayout.WEST, lblPrimeiraLinha);
		frame.getContentPane().add(comboBox1Linha1);
		
		JComboBox comboBox1Linha2 = new JComboBox();
		comboBox1Linha2.setName("comboBox1Linha2");
		comboBox1Linha2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox1Linha2.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox1Linha2, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox1Linha2, 0, SpringLayout.WEST, lblSegundaLinha);
		frame.getContentPane().add(comboBox1Linha2);
		
		JComboBox comboBox1Linha3 = new JComboBox();
		comboBox1Linha3.setName("comboBox1Linha3");
		comboBox1Linha3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox1Linha3.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox1Linha3, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.EAST, comboBox1Linha3, -342, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(comboBox1Linha3);
		
		JLabel lblQuartaLinha = new JLabel("Quarta Linha");
		lblQuartaLinha.setName("lblQuartaLinha");
		layout.putConstraint(SpringLayout.NORTH, lblQuartaLinha, 0, SpringLayout.NORTH, lblPrimeiraLinha);
		layout.putConstraint(SpringLayout.EAST, lblQuartaLinha, -63, SpringLayout.EAST, frame.getContentPane());
		lblQuartaLinha.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblQuartaLinha);
		
		JComboBox comboBox2Linha2 = new JComboBox();
		comboBox2Linha2.setName("comboBox2Linha2");
		comboBox2Linha2.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox2Linha2.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox2Linha2, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox2Linha2, 6, SpringLayout.EAST, comboBox1Linha2);
		frame.getContentPane().add(comboBox2Linha2);
		
		JComboBox comboBox2Linha3 = new JComboBox();
		comboBox2Linha3.setName("comboBox2Linha3");
		comboBox2Linha3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox2Linha3.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox2Linha3, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox2Linha3, 9, SpringLayout.EAST, comboBox1Linha3);
		frame.getContentPane().add(comboBox2Linha3);
		
		JComboBox comboBox3Linha3 = new JComboBox();
		comboBox3Linha3.setName("comboBox3Linha3");
		comboBox3Linha3.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox3Linha3.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox3Linha3, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox3Linha3, 6, SpringLayout.EAST, comboBox2Linha3);
		frame.getContentPane().add(comboBox3Linha3);
		
		JComboBox comboBox1Linha4 = new JComboBox();
		comboBox1Linha4.setName("comboBox1Linha4");
		comboBox1Linha4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox1Linha4.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox1Linha4, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox1Linha4, 0, SpringLayout.WEST, lblQuartaLinha);
		frame.getContentPane().add(comboBox1Linha4);
		
		JComboBox comboBox2Linha4 = new JComboBox();
		comboBox2Linha4.setName("comboBox2Linha4");
		comboBox2Linha4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox2Linha4.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox2Linha4, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox2Linha4, 6, SpringLayout.EAST, comboBox1Linha4);
		frame.getContentPane().add(comboBox2Linha4);
		
		JComboBox comboBox3Linha4 = new JComboBox();
		comboBox3Linha4.setName("comboBox3Linha4");
		comboBox3Linha4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox3Linha4.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox3Linha4, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox3Linha4, 6, SpringLayout.EAST, comboBox2Linha4);
		frame.getContentPane().add(comboBox3Linha4);
		
		JComboBox comboBox4Linha4 = new JComboBox();
		comboBox4Linha4.setName("comboBox4Linha4");
		comboBox4Linha4.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		comboBox4Linha4.setMaximumRowCount(10);
		layout.putConstraint(SpringLayout.NORTH, comboBox4Linha4, 0, SpringLayout.NORTH, comboBox1Linha1);
		layout.putConstraint(SpringLayout.WEST, comboBox4Linha4, 6, SpringLayout.EAST, comboBox3Linha4);
		frame.getContentPane().add(comboBox4Linha4);
		
		JButton BotaoAplicar = new JButton("Aplicar");
		BotaoAplicar.setName("BotaoAplicar");
		layout.putConstraint(SpringLayout.WEST, BotaoAplicar, 0, SpringLayout.WEST, comboBox3Linha4);
		frame.getContentPane().add(BotaoAplicar);
		
		JLabel lblX1_1 = new JLabel("XX");
		lblX1_1.setName("lblX1_1");
		layout.putConstraint(SpringLayout.WEST, lblX1_1, 256, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblX1_1);
		
		JLabel lblX2_1 = new JLabel("XX");
		lblX2_1.setName("lblX2_1");
		layout.putConstraint(SpringLayout.NORTH, lblX2_1, 180, SpringLayout.SOUTH, comboBox1Linha2);
		layout.putConstraint(SpringLayout.WEST, lblX2_1, 197, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblX2_1);
		
		JLabel lblX2_2 = new JLabel("XX");
		lblX2_2.setName("lblX2_2");
		layout.putConstraint(SpringLayout.NORTH, lblX2_2, -2, SpringLayout.NORTH, lblX2_1);
		layout.putConstraint(SpringLayout.WEST, lblX2_2, 298, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblX2_2);
		
		JLabel lblX3_1 = new JLabel("XX");
		lblX3_1.setName("lblX3_1");
		layout.putConstraint(SpringLayout.WEST, lblX3_1, 160, SpringLayout.WEST, frame.getContentPane());
		layout.putConstraint(SpringLayout.EAST, lblX3_1, -606, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblX3_1);
		
		JLabel lblX3_2 = new JLabel("XX");
		lblX3_2.setName("lblX3_2");
		layout.putConstraint(SpringLayout.WEST, lblX3_2, 258, SpringLayout.WEST, frame.getContentPane());
		layout.putConstraint(SpringLayout.SOUTH, lblX1_1, -53, SpringLayout.NORTH, lblX3_2);
		layout.putConstraint(SpringLayout.NORTH, lblX3_2, 0, SpringLayout.NORTH, lblX3_1);
		frame.getContentPane().add(lblX3_2);
		
		JLabel lblX3_3 = new JLabel("XX");
		lblX3_3.setName("lblX3_3");
		layout.putConstraint(SpringLayout.WEST, lblX3_3, 340, SpringLayout.WEST, frame.getContentPane());
		layout.putConstraint(SpringLayout.EAST, lblX3_3, -426, SpringLayout.EAST, frame.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblX3_1, 0, SpringLayout.NORTH, lblX3_3);
		frame.getContentPane().add(lblX3_3);
		
		JLabel lblX4_1 = new JLabel("XX");
		lblX4_1.setName("lblX4_1");
		layout.putConstraint(SpringLayout.NORTH, BotaoAplicar, -4, SpringLayout.NORTH, lblX4_1);
		layout.putConstraint(SpringLayout.WEST, lblX4_1, 119, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(lblX4_1);
		
		JLabel lblX4_2 = new JLabel("XX");
		lblX4_2.setName("lblX4_2");
		layout.putConstraint(SpringLayout.SOUTH, lblX3_1, -25, SpringLayout.NORTH, lblX4_2);
		layout.putConstraint(SpringLayout.SOUTH, lblX3_2, -25, SpringLayout.NORTH, lblX4_2);
		layout.putConstraint(SpringLayout.SOUTH, lblX3_3, -25, SpringLayout.NORTH, lblX4_2);
		layout.putConstraint(SpringLayout.SOUTH, lblX2_2, -63, SpringLayout.NORTH, lblX4_2);
		layout.putConstraint(SpringLayout.SOUTH, lblX2_1, -64, SpringLayout.NORTH, lblX4_2);
		layout.putConstraint(SpringLayout.WEST, lblX4_2, 197, SpringLayout.WEST, frame.getContentPane());
		layout.putConstraint(SpringLayout.NORTH, lblX4_1, 0, SpringLayout.NORTH, lblX4_2);
		layout.putConstraint(SpringLayout.EAST, lblX4_1, -62, SpringLayout.WEST, lblX4_2);
		frame.getContentPane().add(lblX4_2);
		
		JLabel lblX4_3 = new JLabel("XX");
		lblX4_3.setName("lblX4_3");
		layout.putConstraint(SpringLayout.NORTH, lblX4_3, 383, SpringLayout.NORTH, frame.getContentPane());
		layout.putConstraint(SpringLayout.WEST, lblX4_3, 91, SpringLayout.EAST, lblX4_2);
		layout.putConstraint(SpringLayout.NORTH, lblX4_2, 0, SpringLayout.NORTH, lblX4_3);
		frame.getContentPane().add(lblX4_3);
		
		JLabel lblX4_4 = new JLabel("XX");
		lblX4_4.setName("lblX4_4");
		layout.putConstraint(SpringLayout.NORTH, lblX4_4, 0, SpringLayout.NORTH, lblX4_3);
		layout.putConstraint(SpringLayout.WEST, lblX4_4, 64, SpringLayout.EAST, lblX4_3);
		frame.getContentPane().add(lblX4_4);
		
		JLabel lblSomaFormada = new JLabel("A soma formada entre os maiores n\u00FAmeros \u00E9:");
		layout.putConstraint(SpringLayout.WEST, lblSomaFormada, 0, SpringLayout.WEST, lblX4_1);
		layout.putConstraint(SpringLayout.EAST, lblSomaFormada, 0, SpringLayout.EAST, BotaoAplicar);
		lblSomaFormada.setName("lblSomaFormada");
		layout.putConstraint(SpringLayout.SOUTH, lblSomaFormada, -49, SpringLayout.SOUTH, frame.getContentPane());
		lblSomaFormada.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblSomaFormada);
		
		Panel panel1_1 = new Panel();
		panel1_1.setName("panel1_1");
		panel1_1.setBackground(Color.LIGHT_GRAY);
		layout.putConstraint(SpringLayout.NORTH, panel1_1, 160, SpringLayout.SOUTH, comboBox1Linha2);
		layout.putConstraint(SpringLayout.WEST, panel1_1, -44, SpringLayout.WEST, lblX1_1);
		layout.putConstraint(SpringLayout.SOUTH, panel1_1, 176, SpringLayout.SOUTH, comboBox1Linha2);
		layout.putConstraint(SpringLayout.EAST, panel1_1, -6, SpringLayout.WEST, lblX1_1);
		frame.getContentPane().add(panel1_1);
		
		
		Panel panel1_2 = new Panel();
		panel1_2.setName("panel1_2");
		layout.putConstraint(SpringLayout.NORTH, panel1_2, 0, SpringLayout.NORTH, panel1_1);
		layout.putConstraint(SpringLayout.WEST, panel1_2, 6, SpringLayout.EAST, lblX1_1);
		layout.putConstraint(SpringLayout.SOUTH, panel1_2, 0, SpringLayout.SOUTH, panel1_1);
		layout.putConstraint(SpringLayout.EAST, panel1_2, 0, SpringLayout.EAST, lblSegundaLinha);
		panel1_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel1_2);
		
		Panel panel2_1 = new Panel();
		panel2_1.setName("panel2_1");
		layout.putConstraint(SpringLayout.NORTH, panel2_1, 6, SpringLayout.SOUTH, lblX2_1);
		layout.putConstraint(SpringLayout.WEST, panel2_1, 0, SpringLayout.WEST, lblX3_1);
		layout.putConstraint(SpringLayout.SOUTH, panel2_1, -1, SpringLayout.NORTH, lblX3_1);
		layout.putConstraint(SpringLayout.EAST, panel2_1, -15, SpringLayout.EAST, lblX2_1);
		panel2_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel2_1);
		
		Panel panel2_2 = new Panel();
		layout.putConstraint(SpringLayout.NORTH, panel2_2, 6, SpringLayout.SOUTH, lblX2_1);
		panel2_2.setName("panel2_2");
		layout.putConstraint(SpringLayout.WEST, panel2_2, 0, SpringLayout.WEST, panel1_1);
		layout.putConstraint(SpringLayout.EAST, panel2_2, 0, SpringLayout.EAST, panel1_1);
		panel2_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel2_2);
		
		Panel panel2_3 = new Panel();
		panel2_3.setName("panel2_3");
		layout.putConstraint(SpringLayout.NORTH, panel2_3, 6, SpringLayout.SOUTH, lblX2_2);
		layout.putConstraint(SpringLayout.WEST, panel2_3, -4, SpringLayout.WEST, panel1_2);
		layout.putConstraint(SpringLayout.SOUTH, panel2_3, 1, SpringLayout.SOUTH, panel2_1);
		panel2_3.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel2_3);
		
		Panel panel2_4 = new Panel();
		panel2_4.setName("panel2_4");
		layout.putConstraint(SpringLayout.NORTH, panel2_4, 0, SpringLayout.NORTH, panel2_1);
		layout.putConstraint(SpringLayout.WEST, panel2_4, 8, SpringLayout.EAST, panel2_3);
		layout.putConstraint(SpringLayout.SOUTH, panel2_4, 0, SpringLayout.SOUTH, panel2_1);
		layout.putConstraint(SpringLayout.EAST, panel2_4, -426, SpringLayout.EAST, frame.getContentPane());
		panel2_4.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel2_4);
		
		Panel panel3_1 = new Panel();
		panel3_1.setName("panel3_1");
		layout.putConstraint(SpringLayout.NORTH, panel3_1, 6, SpringLayout.SOUTH, lblX3_1);
		layout.putConstraint(SpringLayout.WEST, panel3_1, 0, SpringLayout.WEST, lblX4_1);
		layout.putConstraint(SpringLayout.SOUTH, panel3_1, 22, SpringLayout.SOUTH, lblX3_1);
		layout.putConstraint(SpringLayout.EAST, panel3_1, 38, SpringLayout.WEST, lblX4_1);
		panel3_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel3_1);
		
		Panel panel3_2 = new Panel();
		layout.putConstraint(SpringLayout.SOUTH, panel2_2, -23, SpringLayout.NORTH, panel3_2);
		panel3_2.setName("panel3_2");
		layout.putConstraint(SpringLayout.NORTH, panel3_2, 6, SpringLayout.SOUTH, lblX3_1);
		layout.putConstraint(SpringLayout.WEST, panel3_2, -34, SpringLayout.EAST, lblX2_1);
		layout.putConstraint(SpringLayout.SOUTH, panel3_2, 0, SpringLayout.SOUTH, panel3_1);
		layout.putConstraint(SpringLayout.EAST, panel3_2, 0, SpringLayout.EAST, lblX2_1);
		panel3_2.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel3_2);
		
		Panel panel3_3 = new Panel();
		panel3_3.setName("panel3_3");
		layout.putConstraint(SpringLayout.NORTH, panel3_3, 6, SpringLayout.SOUTH, lblX3_2);
		layout.putConstraint(SpringLayout.WEST, panel3_3, 18, SpringLayout.EAST, panel3_2);
		layout.putConstraint(SpringLayout.SOUTH, panel3_3, 0, SpringLayout.SOUTH, panel3_1);
		panel3_3.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel3_3);
		
		Panel panel3_4 = new Panel();
		panel3_4.setName("panel3_4");
		layout.putConstraint(SpringLayout.EAST, panel2_3, 0, SpringLayout.EAST, panel3_4);
		layout.putConstraint(SpringLayout.EAST, panel3_3, -13, SpringLayout.WEST, panel3_4);
		layout.putConstraint(SpringLayout.NORTH, panel3_4, 0, SpringLayout.NORTH, panel3_1);
		layout.putConstraint(SpringLayout.WEST, panel3_4, 0, SpringLayout.WEST, panel1_2);
		layout.putConstraint(SpringLayout.SOUTH, panel3_4, 0, SpringLayout.SOUTH, panel3_1);
		layout.putConstraint(SpringLayout.EAST, panel3_4, -8, SpringLayout.EAST, lblX4_3);
		panel3_4.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel3_4);
		
		Panel panel3_5 = new Panel();
		panel3_5.setName("panel3_5");
		layout.putConstraint(SpringLayout.NORTH, panel3_5, 6, SpringLayout.SOUTH, lblX3_3);
		layout.putConstraint(SpringLayout.WEST, panel3_5, 13, SpringLayout.EAST, panel3_4);
		layout.putConstraint(SpringLayout.SOUTH, panel3_5, 0, SpringLayout.SOUTH, panel3_1);
		panel3_5.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel3_5);
		
		Panel panel3_6 = new Panel();
		panel3_6.setName("panel3_6");
		layout.putConstraint(SpringLayout.EAST, panel3_5, -10, SpringLayout.WEST, panel3_6);
		layout.putConstraint(SpringLayout.SOUTH, panel3_6, 0, SpringLayout.SOUTH, panel3_1);
		layout.putConstraint(SpringLayout.EAST, panel3_6, 7, SpringLayout.EAST, lblX4_4);
		layout.putConstraint(SpringLayout.NORTH, panel3_6, 0, SpringLayout.NORTH, panel3_1);
		layout.putConstraint(SpringLayout.WEST, panel3_6, -27, SpringLayout.EAST, lblX4_4);
		panel3_6.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel3_6);
		BotaoAplicar.addActionListener(new Listener (frame.getContentPane()));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
