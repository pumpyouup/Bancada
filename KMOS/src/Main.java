import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PPmodel PPmodel = new PPmodel();
					PPmodel.TelaLogIn(PPmodel);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
