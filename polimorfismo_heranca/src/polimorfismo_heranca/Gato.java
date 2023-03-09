package polimorfismo_heranca;

public class Gato extends Animal {

	public Gato(String nome, int idade) {
		super(nome, idade);

	}
	
	@Override
	public void Som() {
		System.out.println("Miando!");
	}
	
	@Override
	public void Correr() {
		System.out.println("Rudá correndo atrás do sachê!");
	}
	
}