package questao01;

public class Programa {

	public static void main(String[] args) {
	
		Pokemon pokemon = new Pokemon();
		pokemon.setAtaqueA(new GolpeDeFogo());
		pokemon.ataqueA();
		pokemon.setAtaqueB(new JatoDeAgua());
		pokemon.ataqueB();
		pokemon.ataqueC();
	}
}
