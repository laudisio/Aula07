package exercicio_3_2;

public class SingletonExercise {
	public static void main(String args[]) {
		Deck deck = Deck.getInstance();
		deck.print();
	}
}
