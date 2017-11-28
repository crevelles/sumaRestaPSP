
public class Restador extends Thread{

	
	Contador contador;
	
	

	public Restador(Contador contador) {
		super();
		this.contador = contador;
	}



	public void run() {
		for (int i = 0; i < 10; i++) {
			contador.restar();
		}
	}
	
	
}
