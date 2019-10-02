package firstJavaProject;

public class ContaBancaria {
		
	private String titular;
	private double saldo;
	private int numCC;	
	
	public double getSaldo() {
		return saldo;	
	}
	
	public int getCC() {
		return numCC;
	}

	public void deposita(double deposito) {
		saldo += deposito;
		
	}

	public void saque(double deposito) {
		saldo -= deposito;
		
	}
	
}
