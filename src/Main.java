package lucas;

public class Main {

	public static void main(String[] args) {
		Cliente Manoel = new Cliente("Manoel constantino Neto ", "222.333.444-55");
		Cliente Marcelo = new Cliente("Marcelo Henrique Costa", "222.333.555-66");
		Cliente Fabricio = new Cliente("Fabricio Passamani", "111.222.333-44");
		Conta Corrente = new ContaCorrente(1, 1, Manoel);
		Conta Poupanca = new ContaPoupanca(2, 2, Marcelo);
		Conta Teste = new ContaCorrente(3, 3, Fabricio);

		System.out.println(Corrente);
		System.out.println(Poupanca);
		System.out.println(Teste);

		Corrente.depositar(50);
		Poupanca.depositar(50);
		Teste.depositar(100);

		System.out.println(Corrente);
		System.out.println(Poupanca);
		System.out.println(Teste);

		Corrente.sacar();
		Corrente.sacar();
		Corrente.sacar();
		Poupanca.sacar();
		Poupanca.sacar();

		System.out.println(Corrente);
		System.out.println(Poupanca);
		System.out.println(Teste);
	}
}
