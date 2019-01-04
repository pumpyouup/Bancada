package Models;

public class LImodel {
	
	private LogIn logIn;
	private PPmodel pPmodel = new PPmodel();
	
	public LImodel() {
	}
	
	public void Start(boolean ligado) {
		if (ligado) {
			logIn = new LogIn();
			logIn.setVisible(true);	
		}
		else
		{
			logIn.setVisible(false);	
		}
	}
	
	public void BotaoEntrar() {
		pPmodel.AcessoLogIn(logIn.getUsuario(), logIn.getBancada());
	}
	
}
