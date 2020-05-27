package exercicio_2_1;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Mariana Palmeira");
		nomes.add("Palmeira, Mariana");
		nomes.add("Andrade, Estevao");
		nomes.add("Douglas Vasquez");

		NameParserCreator parser;
		
		for(String nome: nomes) {
			if(nome.contains(",")) {
				parser = new NomeInversoParser();
			} else {
				parser = new NomeDiretoParser();
			}
			parser.gravar(nome);
		}
		
	}

}
