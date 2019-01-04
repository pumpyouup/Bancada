package Models;
public class Maquina {
	
	private String problema, OS, cliente, data, tipo;
	private boolean contrato;
	
	public Maquina(String problema, String oS, String cliente, String data, String tipo, boolean contrato) {
		super();
		this.problema = problema;
		OS = oS;
		this.cliente = cliente;
		this.data = data;
		this.tipo = tipo;
		this.contrato = contrato;
	}
}
