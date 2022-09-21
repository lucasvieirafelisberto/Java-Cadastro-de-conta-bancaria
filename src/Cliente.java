package lucas;

public class Cliente {
	private String nome;
	private String cpf;

	// Construtor
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	// Metodo lê nome
	public String getNome() {

		return this.nome;
	}

	// Metodo lê CPF
	public String getCpf() {

		return this.cpf;
	}

}
