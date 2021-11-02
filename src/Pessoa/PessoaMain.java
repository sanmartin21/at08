package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		// Pessoa

		Pessoa p = new Pessoa("João", "Rua Karl Schott");
		System.out.println(p);

		// PessoaFisica

		PessoaFisica ps = new PessoaFisica("João", "Rua Karl Schott", "096.733.409-43", "Solteiro");
		System.out.println(ps);

		// PessoaJuridica

		PessoaJuridica pj = new PessoaJuridica("contabilijaum", "Rua Karl Schott", "77.777.777.0001-77",
				"Contabilidade");
		System.out.println(pj);

	}

}