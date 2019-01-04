import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.AbstractListModel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.JToolBar;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class PaginaPrincipal extends JFrame {

	/////////////////////////////////////////
	public String nome, bancada;
	
	public JPanel panel_4 = new JPanel();
	public JPanel panel_5 = new JPanel();
	
	
	/////////////////////////////////////////
	
	public JPanel contentPane;

	public PaginaPrincipal() {
		setEnabled(false);
		setBackground(Color.WHITE);
		//setTitle(bancada + " - " + nome);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 986, 652);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenu mnMenu_1 = new JMenu("Edit");
		menuBar.add(mnMenu_1);
		
		JButton button = new JButton("opc0");
		button.setContentAreaFilled(false);
		mnMenu_1.add(button);
		
		JButton button_1 = new JButton("opc1");
		button_1.setContentAreaFilled(false);
		mnMenu_1.add(button_1);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[150px,grow,fill]", "[50px:n,grow,fill][150px:300px,grow,fill][50px:n,grow,fill]"));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		contentPane.add(scrollPane, "cell 0 0,grow");
		
		JLabel lblAvisosImportantesusado = new JLabel("Avisos Importantes (usado apenas por ADM)");
		lblAvisosImportantesusado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAvisosImportantesusado.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane.setColumnHeaderView(lblAvisosImportantesusado);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout("", "[grow,fill]", "[][][][][]"));
		
		JButton btndescrioDeAviso = new JButton("Descri\u00E7\u00E3o de aviso");
		btndescrioDeAviso.setBackground(Color.WHITE);
		panel.add(btndescrioDeAviso, "cell 0 0");
		
		JButton btnNewButton = new JButton("Computadores CEAEC dever\u00E3o seguir o padr\u00E3o CEAEC contido na BinW");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.WHITE);
		panel.add(btnNewButton, "cell 0 1");
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setEnabled(false);
		panel.add(btnNewButton_1, "cell 0 2");
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setEnabled(false);
		panel.add(btnNewButton_2, "cell 0 3");
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBorderPainted(false);
		panel.add(btnNewButton_3, "cell 0 4");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1, "cell 0 1,grow");
		
		JLabel lblBancadaDoLogin = new JLabel("Bancada do LogIn - Vermelho - Amarelo - Verde");
		lblBancadaDoLogin.setToolTipText("");
		lblBancadaDoLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBancadaDoLogin.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPane_1.setColumnHeaderView(lblBancadaDoLogin);
		
		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);
		panel_2.setLayout(new MigLayout("", "[100px,grow,fill][100px,grow,fill][100px,grow,fill][100px,grow,fill]", "[20px:n:20px,grow,fill][grow,fill]"));
		
		JButton btnNewButton_5 = new JButton("BANCADA");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.GRAY);
		panel_2.add(btnNewButton_5, "cell 0 0");
		
		JButton btnNewButton_6 = new JButton("VERMELHO");
		btnNewButton_6.setForeground(Color.RED);
		btnNewButton_6.setBackground(Color.GRAY);
		panel_2.add(btnNewButton_6, "cell 1 0");
		
		JButton btnNewButton_7 = new JButton("AMARELO");
		btnNewButton_7.setForeground(Color.YELLOW);
		btnNewButton_7.setBackground(Color.GRAY);
		panel_2.add(btnNewButton_7, "cell 2 0");
		
		JButton btnNewButton_8 = new JButton("VERDE");
		btnNewButton_8.setForeground(Color.GREEN);
		btnNewButton_8.setBackground(Color.GRAY);
		panel_2.add(btnNewButton_8, "cell 3 0");
		
		JScrollPane scrollPane_6 = new JScrollPane();
		panel_2.add(scrollPane_6, "cell 0 1,grow");
		
		JPanel panel_3 = new JPanel();
		scrollPane_6.setViewportView(panel_3);
		panel_3.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_3.setLayout(new MigLayout("", "[grow,fill]", "[][][][][][][][][]"));
		
		JButton btnPosio_5 = new JButton("POSI\u00C7\u00C3O 00");
		btnPosio_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPosio_5.setVisible(false);
		btnPosio_5.setContentAreaFilled(false);
		btnPosio_5.setEnabled(false);
		panel_3.add(btnPosio_5, "cell 0 0");
		
		JButton btnPosio = new JButton("POSI\u00C7\u00C3O 01");
		btnPosio.setVisible(false);
		btnPosio.setContentAreaFilled(false);
		btnPosio.setEnabled(false);
		panel_3.add(btnPosio, "cell 0 1");
		
		JButton btnPosio_1 = new JButton("POSI\u00C7\u00C3O 02");
		btnPosio_1.setVisible(false);
		btnPosio_1.setContentAreaFilled(false);
		btnPosio_1.setEnabled(false);
		panel_3.add(btnPosio_1, "cell 0 2");
		
		JButton btnPosio_2 = new JButton("POSI\u00C7\u00C3O 03");
		btnPosio_2.setVisible(false);
		btnPosio_2.setContentAreaFilled(false);
		btnPosio_2.setEnabled(false);
		panel_3.add(btnPosio_2, "cell 0 3");
		
		JButton btnPosio_3 = new JButton("POSI\u00C7\u00C3O 04");
		btnPosio_3.setVisible(false);
		btnPosio_3.setContentAreaFilled(false);
		btnPosio_3.setEnabled(false);
		panel_3.add(btnPosio_3, "cell 0 4");
		
		JButton btnPosio_4 = new JButton("POSI\u00C7\u00C3O 05");
		btnPosio_4.setVisible(false);
		btnPosio_4.setContentAreaFilled(false);
		btnPosio_4.setEnabled(false);
		panel_3.add(btnPosio_4, "cell 0 5");
		
		JScrollPane scrollPane_5 = new JScrollPane();
		panel_2.add(scrollPane_5, "cell 1 1,grow");
		
		scrollPane_5.setViewportView(panel_4);
		panel_4.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_4.setLayout(new MigLayout("", "[grow,fill]", "[][][][][][][][][]"));
		
		JButton btnNewButton_9 = new JButton("New button");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnNewButton_9, "cell 0 0");
		
		JScrollPane scrollPane_4 = new JScrollPane();
		panel_2.add(scrollPane_4, "cell 2 1,grow");
		

		scrollPane_4.setViewportView(panel_5);
		panel_5.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_5.setLayout(new MigLayout("", "[grow,fill]", "[][][][][][][][][]"));
		
		JButton btnPosio_9 = new JButton("POSI\u00C7\u00C3O 00");
		btnPosio_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPosio_9.setVisible(false);
		btnPosio_9.setContentAreaFilled(false);
		btnPosio_9.setEnabled(false);
		panel_5.add(btnPosio_9, "cell 0 0");
		
		JButton button_6 = new JButton("POSI\u00C7\u00C3O 01");
		button_6.setVisible(false);
		button_6.setContentAreaFilled(false);
		button_6.setEnabled(false);
		panel_5.add(button_6, "cell 0 1");
		
		JButton button_4 = new JButton("POSI\u00C7\u00C3O 02");
		button_4.setVisible(false);
		button_4.setContentAreaFilled(false);
		button_4.setEnabled(false);
		panel_5.add(button_4, "cell 0 2");
		
		JButton button_9 = new JButton("POSI\u00C7\u00C3O 03");
		button_9.setVisible(false);
		button_9.setContentAreaFilled(false);
		button_9.setEnabled(false);
		panel_5.add(button_9, "cell 0 3");
		
		JButton button_12 = new JButton("POSI\u00C7\u00C3O 04");
		button_12.setVisible(false);
		button_12.setContentAreaFilled(false);
		button_12.setEnabled(false);
		panel_5.add(button_12, "cell 0 4");
		
		JButton button_15 = new JButton("POSI\u00C7\u00C3O 05");
		button_15.setVisible(false);
		button_15.setContentAreaFilled(false);
		button_15.setEnabled(false);
		panel_5.add(button_15, "cell 0 5");
		
		JButton button_18 = new JButton("POSI\u00C7\u00C3O 06");
		button_18.setVisible(false);
		button_18.setContentAreaFilled(false);
		button_18.setEnabled(false);
		panel_5.add(button_18, "cell 0 6");
		
		JButton button_20 = new JButton("POSI\u00C7\u00C3O 07");
		button_20.setVisible(false);
		button_20.setContentAreaFilled(false);
		button_20.setEnabled(false);
		panel_5.add(button_20, "cell 0 7");
		
		JButton button_22 = new JButton("POSI\u00C7\u00C3O 08");
		button_22.setVisible(false);
		button_22.setContentAreaFilled(false);
		button_22.setEnabled(false);
		panel_5.add(button_22, "cell 0 8");
		
		JScrollPane scrollPane_3 = new JScrollPane();
		panel_2.add(scrollPane_3, "cell 3 1,grow");
		
		JPanel panel_6 = new JPanel();
		scrollPane_3.setViewportView(panel_6);
		panel_6.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_6.setLayout(new MigLayout("", "[grow,fill]", "[][][][][][][][][]"));
		
		JButton btnPosio_10 = new JButton("POSI\u00C7\u00C3O 00");
		btnPosio_10.setContentAreaFilled(false);
		btnPosio_10.setVisible(false);
		btnPosio_10.setEnabled(false);
		panel_6.add(btnPosio_10, "cell 0 0");
		
		JButton button_7 = new JButton("POSI\u00C7\u00C3O 01");
		button_7.setContentAreaFilled(false);
		button_7.setVisible(false);
		button_7.setEnabled(false);
		panel_6.add(button_7, "cell 0 1");
		
		JButton button_5 = new JButton("POSI\u00C7\u00C3O 02");
		button_5.setContentAreaFilled(false);
		button_5.setVisible(false);
		button_5.setEnabled(false);
		panel_6.add(button_5, "cell 0 2");
		
		JButton button_10 = new JButton("POSI\u00C7\u00C3O 03");
		button_10.setContentAreaFilled(false);
		button_10.setVisible(false);
		button_10.setEnabled(false);
		panel_6.add(button_10, "cell 0 3");
		
		JButton button_13 = new JButton("POSI\u00C7\u00C3O 04");
		button_13.setContentAreaFilled(false);
		button_13.setVisible(false);
		button_13.setEnabled(false);
		panel_6.add(button_13, "cell 0 4");
		
		JButton button_16 = new JButton("POSI\u00C7\u00C3O 05");
		button_16.setContentAreaFilled(false);
		button_16.setVisible(false);
		button_16.setEnabled(false);
		panel_6.add(button_16, "cell 0 5");
		
		JButton button_19 = new JButton("POSI\u00C7\u00C3O 06");
		button_19.setContentAreaFilled(false);
		button_19.setVisible(false);
		button_19.setEnabled(false);
		panel_6.add(button_19, "cell 0 6");
		
		JButton button_21 = new JButton("POSI\u00C7\u00C3O 07");
		button_21.setContentAreaFilled(false);
		button_21.setVisible(false);
		button_21.setEnabled(false);
		panel_6.add(button_21, "cell 0 7");
		
		JButton button_23 = new JButton("POSI\u00C7\u00C3O 08");
		button_23.setContentAreaFilled(false);
		button_23.setVisible(false);
		button_23.setEnabled(false);
		panel_6.add(button_23, "cell 0 8");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		contentPane.add(scrollPane_2, "cell 0 2,grow");
		
		JLabel lblAvisosDeUsuarios = new JLabel("Avisos de usuarios de bancadas (qualquer pessoa pode colocar um aviso aqui)");
		lblAvisosDeUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvisosDeUsuarios.setFont(new Font("Tahoma", Font.BOLD, 14));
		scrollPane_2.setColumnHeaderView(lblAvisosDeUsuarios);
		
		JPanel panel_1 = new JPanel();
		scrollPane_2.setViewportView(panel_1);
		panel_1.setLayout(new MigLayout("", "[150px,left][grow,fill][100px,right]", ""));
		
		JLabel lblNewLabel = new JLabel("Bancada - Usuario");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, "cell 0 0,alignx center");
		
		JButton btnNewButton_4 = new JButton("Descri\u00E7\u00E3o do aviso\r\n");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_4, "cell 1 0");
		
		JLabel lblData = new JLabel("DATA");
		panel_1.add(lblData, "cell 2 0,alignx center");
		
		JLabel lblBancada = new JLabel("Bancada 03 - Matheus");
		lblBancada.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblBancada, "cell 0 1,alignx center");
		
		JButton btnFelizNatal = new JButton("Feliz natal!");
		panel_1.add(btnFelizNatal, "cell 1 1");
		
		JLabel label_1 = new JLabel("25/12/18");
		panel_1.add(label_1, "cell 2 1,alignx center");
		
		JButton btnOpc_1 = new JButton("Adicionar maquina no vermelho");
		btnOpc_1.setContentAreaFilled(false);
		btnOpc_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mnMenu.add(btnOpc_1);
		
		JButton btnAdicionarMaquinaNo = new JButton("Adicionar maquina no amarelo");
		btnAdicionarMaquinaNo.setContentAreaFilled(false);
		mnMenu.add(btnAdicionarMaquinaNo);
		
		JButton btnAdicionarMaquinaNo_1 = new JButton("Adicionar maquina no verde");
		btnAdicionarMaquinaNo_1.setContentAreaFilled(false);
		mnMenu.add(btnAdicionarMaquinaNo_1);
		
		JButton btnAdicionarMaquinaNa = new JButton("Adicionar maquina na Bancada");
		btnAdicionarMaquinaNa.setContentAreaFilled(false);
		mnMenu.add(btnAdicionarMaquinaNa);
		
		JList list = new JList();	
		
	}
	


}
