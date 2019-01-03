import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdicionaMaquina extends PaginaPrincipal {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	public PPmodel PPmodel = new PPmodel();	
	
	public AdicionaMaquina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow,fill][grow,fill]", "[][][][][][][][][]"));
		
		JLabel lblContrato = new JLabel("Contrato");
		contentPane.add(lblContrato, "cell 0 0");
		
		JCheckBox checkBox = new JCheckBox("");
		contentPane.add(checkBox, "cell 1 0");
		
		JLabel lblProblema = new JLabel("Problema");
		contentPane.add(lblProblema, "cell 0 2,alignx trailing");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 1 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblOs = new JLabel("OS");
		contentPane.add(lblOs, "cell 0 3,alignx trailing");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 1 3,growx");
		textField_2.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		contentPane.add(lblCliente, "cell 0 4,alignx trailing");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 1 4,growx");
		textField_3.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo");
		contentPane.add(lblTipo, "cell 0 5,alignx trailing");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Notebook", "Desktop", "Impressora", "Monitor", "All in one", "HD externo", "Pen drive"}));
		contentPane.add(comboBox, "cell 1 5,growx");
		
		JLabel lblData = new JLabel("Data");
		contentPane.add(lblData, "cell 0 6,alignx trailing");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 1 6,growx");
		textField_4.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PPmodel.AdicionaMaquinaVermelho(textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText(), comboBox.getSelectedItem().toString(), checkBox.isSelected());
			}
		});
		
		contentPane.add(btnAdicionar, "cell 1 8");
	}
	
	

}
