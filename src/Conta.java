package lucas;

public abstract class Conta {
	protected int numero;
	protected int agencia;
	protected Cliente cliente;
	protected double saldo = 0;

	// construtor
	public Conta(int numero, int agencia, Cliente cliente) {
		this.numero = Math.abs(numero);
		this.agencia = Math.abs(agencia);
		this.cliente = cliente;
	}
	// Metodo Sacar Abstrato para ser implementado pela classe filha

	public abstract void sacar();

	// Realiza o dep�sito
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Des�sito de " + valor + " realizado com sucesso!!\n");
	}

	public double getsaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		if (numero == 1) {
			return "***Dados da Banc�rios*** \n\nCliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf()
					+ "\nConta Corrente: " + numero + "\nAg�ncia: " + agencia + "\nSaldo: " + saldo + "\n\n";

		} else {
			return "***Dados da Banc�rios*** \n\nCliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf()
					+ "\nConta Poupan�a: " + numero + "\nAg�ncia: " + agencia + "\nSaldo: " + saldo + "\n\n";
		}

	}
}
