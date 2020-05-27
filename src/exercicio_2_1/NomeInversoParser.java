package exercicio_2_1;

public class NomeInversoParser extends NameParserCreator {

	@Override
	protected NameParser getParser() {
		return new NomeInverso();
	}

}
