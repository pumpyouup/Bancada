import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PPmodel {
	
	private JButton[] vetorVermelho, vetorAmarelo, vetorVerde, vetorBancada;
	private Maquina[] maquinaVermelho, maquinaAmarelo, maquinaVerde, maquinaBancada;
	private int contVermelho = 0, contAmarelo = 0, contVerde = 0, contBancada = 0;
	public PaginaPrincipal paginaPrincipal;
	public LogIn login;
	
	public void TelaLogIn(PPmodel pPmodel) {
		login = new LogIn();
		login.ppmodel = pPmodel;
		login.setVisible(true);
	}
	
	public void TelaPaginaPrincipal(String nome, String bancada) {
		paginaPrincipal = new PaginaPrincipal(bancada, nome);
		paginaPrincipal.setVisible(true);
	}
			
	public void TelaAdicionaMaquinaVermelho () {
		AdicionaMaquina frame = new AdicionaMaquina();
		frame.setVisible(true);
	}
	
	public void AdicionaMaquinaVermelho (String problema, String oS, String cliente, String data, String tipo, boolean contrato) {
		 maquinaVermelho[contVermelho] = new Maquina(problema, oS, cliente, data, tipo, contrato);
			JButton btnNewButton_9 = new JButton("New button");
			btnNewButton_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			paginaPrincipal.panel_4.add(btnNewButton_9, "cell 0 0");
			
			
		 contVermelho++;
		
	}
}