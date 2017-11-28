
public class Sumador extends Thread{
	
	
	Contador contador;
	
	
	
	public Sumador(Contador contador) {
		super();
		this.contador = contador;
	}



	public void run() {

		for (int i = 0; i < 10; i++) {
			contador.sumar();
		}
	}
	

}
