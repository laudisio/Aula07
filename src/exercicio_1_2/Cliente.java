package exercicio_1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Cliente {

	public static void main(String[] args) {
		String data = "26/05/2020";
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		Date today;
		try {
			today = formater.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
			today = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(today);
		int diaSemana = c.get(Calendar.DAY_OF_WEEK);
		Fabrica fabrica = FabricaProducer.getFabrica(FabricaProducer.CALZONERIA);
		Produto pizza = null;
		
		switch(diaSemana) {
		case 2: case 4: case 6:
			pizza = fabrica.getProduto(Pizzaria.CALABRESA);
			break;
		case 3: case 5: case 7:
			pizza = fabrica.getProduto(Pizzaria.PRESUNTO);
			break;
		default:
			System.out.println("Pizzaria nao abre dia de domingo.");
		}
		if (pizza != null) {
			String sabor = pizza.fazer();
			System.out.println(today);
			System.out.println(sabor);
		}
	}

}
