package exercicio_1_2;

public class FabricaProducer {
	public static final int PIZZARIA = 1;
	public static final int CALZONERIA = 2;
	
	private FabricaProducer() {
		throw new AssertionError();
	}
	
	public static Fabrica getFabrica(int tipo) {
		switch(tipo) {
		case PIZZARIA:
			return new Pizzaria();
		case CALZONERIA:
			return new Calzoneria();
		}
		return null;
	}
}
