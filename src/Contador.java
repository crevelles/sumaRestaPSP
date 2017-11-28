
public class Contador {
	
	
	private int cont = 0;

	
	
	public Contador(int cont) {
		super();
		this.cont = cont;
	}
	
	public int getCont() {
		return cont;
	}

	
	public  synchronized void sumar() {
		cont = cont +1;
		try {
			Thread.sleep(500);
			System.out.println("La variable se ha incrementado: " + cont);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public synchronized void restar() {
		cont = cont -1;
		try {
			Thread.sleep(500);
			System.out.println("La variable se ha decrementado: " + cont);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
