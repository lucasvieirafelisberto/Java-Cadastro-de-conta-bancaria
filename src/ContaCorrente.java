package lucas;

public class ContaCorrente extends Conta {

	final double valorSaque = 0.10;

	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
	public void sacar() {
		if (valorSaque > saldo) {
			System.out.println("Saldo Insulficiente\nTransação não permitida.");
		} else {
			this.saldo -= valorSaque;

			System.out.println("Saque CC Realizado com Sucesso!!");

		}
	}
}
