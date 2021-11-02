package Item;

public class ItemMain {

	public static void main(String[] args) {
		
		// Item

		Item i = new Item(5625, "chave biblioteca");
		System.out.println(i);

		// Livro

		Livro l = new Livro(5625, "chave conta", "Machado de Assis");
		System.out.println(l);

		// Midia

		Midia m = new Midia(5625, "chave conta", "Sony Music", 55);
		System.out.println(m);

		// Cd

		CD cd = new CD(5625, "chave conta", "Sony Music", 55, 5, "armandinho", "sol loiro");
		System.out.println(cd);

		// VHS

		VHS VHS = new VHS(5625, "chave conta", "Sony Music", 55, "peter pan");
		System.out.println(VHS);
	}

}