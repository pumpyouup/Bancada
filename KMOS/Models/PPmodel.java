import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class PPmodel {
	
	private JButton[] vetorVermelho, vetorAmarelo, vetorVerde, vetorBancada;
	private Maquina[] maquinaVermelho, maquinaAmarelo, maquinaVerde, maquinaBancada;
	private int contVermelho = 0, contAmarelo = 0, contVerde = 0, contBancada = 0;
	private PaginaPrincipal paginaPrincipal;
	
	public PPmodel() {
		paginaPrincipal = new PaginaPrincipal();
		paginaPrincipal.setVisible(true);
	}
}