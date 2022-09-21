package lucas;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	public double getSaldo() {
		return this.saldo;
	}

	void deposista(double quantidade) {
		this.saldo += quantidade;
	}

	void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}

	void transfere(Conta destino, double valor) {
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}

	void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public void sacar() {
	}
}
