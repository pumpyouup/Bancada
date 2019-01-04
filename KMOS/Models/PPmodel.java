import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PPmodel extends JFrame {
	
	private String nome, bancada;
	private JButton[] vetorVermelho, vetorAmarelo, vetorVerde, vetorBancada;
	private Maquina[] maquinaVermelho, maquinaAmarelo, maquinaVerde, maquinaBancada;
	private int contVermelho, contAmarelo, contVerde, contBancada;
	private PaginaPrincipal paginaPrincipal;
	private LogIn logIn;
	private AdicionaMaquina adicionaMaquina;
	private LImodel lImodel;
	private UsuarioLocal ;
	
	public PPmodel() {
		contVermelho = 0;
		contAmarelo = 0;
		contVerde = 0;
		contBancada = 0;
		paginaPrincipal = new PaginaPrincipal();
		logIn = new LogIn();
		adicionaMaquina = new AdicionaMaquina();
	}
	
	public void AcessoLogIn (String nome, String bancada) {

	}
}

