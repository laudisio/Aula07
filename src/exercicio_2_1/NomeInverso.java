package exercicio_2_1;

public class NomeInverso implements NameParser {

	@Override
	public Nome parse(String s) {
		int branco = s.indexOf(",");
		String sobrenome = s.substring(0, branco);
		String nome = s.substring(branco+2);
		
		return new Nome(nome,sobrenome);
	}

}
