package entities;

public class contaBanco {
	private String nome;
	private int numeroDaConta;
	private double saldo;
	
	public contaBanco(String nome, int numeroDaConta, double inicialDeposito) {
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
		deposito(inicialDeposito);
	}
	public contaBanco(String nome, int numeroDaConta){
		this.nome = nome;
		this.numeroDaConta = numeroDaConta;
	}
	public String getNome() {
		return nome;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void deposito (double deposito) {
		saldo += deposito;
	}
	public void saque (double saque) {
		saldo -= saque + 5.00;}
	@Override
	public String toString() {
		return "contaBanco nome = " + nome + ", numeroDaConta = " + numeroDaConta + " saldo = " + String.format("%.2f",saldo);
	}
}
	
	



