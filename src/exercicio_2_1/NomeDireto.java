package exercicio_2_1;

public class NomeDireto implements NameParser {

	@Override
	public Nome parse(String s) {
		int branco = s.indexOf(" ");
		String nome = s.substring(0, branco);
		String sobrenome = s.substring(branco+1);
		
		return new Nome(nome,sobrenome);
	}

}
