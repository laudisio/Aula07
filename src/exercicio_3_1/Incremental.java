package exercicio_3_1;

public class Incremental {
	private static int count = 0;
	private static int numero;

	private static Incremental inc = null;
	
	private Incremental() {}

	public static synchronized Incremental getInstance() {
		if (inc == null) {
			inc = new Incremental();
		}
		numero = ++count;
		return inc;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}
}
