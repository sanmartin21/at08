package Conta;

public class ContaMain {

	public static void main(String[] args) {
		
		// conta

		Conta c = new Conta("Banco do Brasil", 123, 321, 0);
		if (c.deposito(1000));
		System.out.println("Deposito OK");
		System.out.println(c.deposito(-100));
		System.out.println(c.saque(100));
		System.out.println(c.saque(901));
		System.out.println(c);

		// Conta Simples

		ContaSimples cs = new ContaSimples("Caixa", 456, 654, 100);
		System.out.println(cs.depositoPoupanca(-40000));
		System.out.println(cs.saquePoupanca(-40000));
		// System.out.println(cs.saquePoupanca(30000));
		System.out.println(cs);

		// Conta Especial

		ContaEspecial ce = new ContaEspecial("Santander", 1215, 12340, -350, 5);
		System.out.println(ce);

	}

}
