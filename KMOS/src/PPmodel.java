import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PPmodel {
	
	private JButton[] vetorVermelho, vetorAmarelo, vetorVerde, vetorBancada;
	private Maquina[] maquinaVermelho, maquinaAmarelo, maquinaVerde, maquinaBancada;
	private int contVermelho = 0, contAmarelo = 0, contVerde = 0, contBancada = 0;
			
	public static void TelaAdicionaMaquinaVermelho () {
		AdicionaMaquina frame = new AdicionaMaquina();
		frame.setVisible(true);
	}
	
	public void AdicionaMaquinaVermelho (String problema, String oS, String cliente, String data, String tipo, boolean contrato) {
		 maquinaVermelho[contVermelho] = new Maquina(problema, oS, cliente, data, tipo, contrato);
		 vetorVermelho[contVermelho] = new JButton("POSI\u00C7\u00C3O 00");
		 vetorVermelho[contVermelho].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				}
			});
		vetorVermelho[contVermelho].setVisible(false);
		vetorVermelho[contVermelho].setContentAreaFilled(false);
		vetorVermelho[contVermelho].setEnabled(false);
		PaginaPrincipal.panel_5.add(vetorVermelho[contVermelho], "cell 0 0");
			
		 contVermelho++;
		
	}
}