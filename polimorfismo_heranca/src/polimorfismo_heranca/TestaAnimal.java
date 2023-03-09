package polimorfismo_heranca;

public class TestaAnimal {
	public static void main(String[] args) {
		Animal gato = new Gato("Rudá", 2);
		Animal cavalo = new Cavalo("Tiamat", 5);
		

		System.out.println("Nome do gato é " + gato.getNome() + " e sua idade é " + gato.getIdade() + " anos.");
		gato.Som();
		gato.Correr();
		System.out.println("\nNome do cavalo é " + cavalo.getNome() + " e sua idade é " + cavalo.getIdade() + " anos.");
		cavalo.Som();
		cavalo.Correr();
		
		
	}
}




