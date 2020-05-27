package exercicio_2_1;

public class NomeDiretoParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		return new NomeDireto();
	}

}
