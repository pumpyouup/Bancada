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
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewButton = new JButton("Entrar");
	private JPasswordField passwordField;
	private String usuario, bancada;
	private LImodel lImodel;

	public String getUsuario() {
		return usuario;
	}

	public String getBancada() {
		return bancada;
	}

	public LogIn() {
		lImodel = new LImodel();
		setTitle("Login");
		setResizable(false);
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
		
		JComboBox comboBoxBancada = new JComboBox();
		comboBoxBancada.setBounds(217, 5, 212, 45);
		comboBoxBancada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxBancada.setModel(new DefaultComboBoxModel(new String[] {"Bancada 01", "Bancada 02", "Bancada 03"}));
		contentPane.add(comboBoxBancada);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		lblUsurio.setBounds(5, 50, 212, 45);
		lblUsurio.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsurio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(lblUsurio);
		
		JComboBox comboBoxUsuario = new JComboBox();
		comboBoxUsuario.setBounds(217, 50, 212, 45);
		comboBoxUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxUsuario.setModel(new DefaultComboBoxModel(new String[] {"Bruno", "Francisco", "Matheus", "Marcos", "Hugo"}));
		contentPane.add(comboBoxUsuario);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					bancada = comboBoxBancada.getSelectedItem().toString();
					usuario = comboBoxUsuario.getSelectedItem().toString();
					lImodel.BotaoEntrar();
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
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, lblLogIn, comboBoxBancada, lblUsurio, comboBoxUsuario, btnNewButton, lblSenha, passwordField}));
	}
}
