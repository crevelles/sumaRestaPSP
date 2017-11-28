
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Contador c = new Contador(5);
		System.out.println("El valor " + c.getCont());
		Sumador s = new Sumador(c);
		Restador r = new Restador(c);
		s.start();
		r.start();
		try {
			s.join();
			r.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("El valor " + c.getCont());
		
	}

}
