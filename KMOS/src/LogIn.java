import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Entrar");
	private JPasswordField passwordField;
	private String nome, bancada;
	public PPmodel ppmodel;

	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogIn = new JLabel("Logon:");
		lblLogIn.setBounds(5, 5, 212, 45);
		lblLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblLogIn);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(217, 5, 212, 45);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Bancada 01", "Bancada 02", "Bancada 03"}));
		contentPane.add(comboBox);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(5, 50, 212, 45);
		lblUsurio.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblUsurio);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(217, 50, 212, 45);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Bruno", "Francisco", "Matheus", "Marcos", "Hugo"}));
		contentPane.add(comboBox_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					nome = comboBox_1.getSelectedItem().toString();
					bancada = comboBox.getSelectedItem().toString();
					ppmodel.TelaPaginaPrincipal(nome, bancada);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(109, 160, 212, 45);
		contentPane.add(btnNewButton);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSenha.setBounds(5, 95, 212, 45);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(217, 95, 212, 45);
		contentPane.add(passwordField);
	}
}
