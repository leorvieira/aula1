package firstJavaProject;

public class testaCC {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.deposita(1000);
		c1.saque(500);
	
		System.out.println("saldo da conta "+c1.getCC()+" = "+c1.getSaldo());
		
		
		

	}

}
