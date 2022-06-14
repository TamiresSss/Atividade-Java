package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
	
		List<String> lista = new ArrayList();
		lista.add("blusinha");
		lista.add("shorts");
		lista.add("calças");
		System.out.println("Contem no estoque:"+ lista);
		lista.remove(1);
		System.out.println("Contem no estoque:"+ lista);
		lista.remove(0);
		System.out.println("Contem no estoque:"+ lista);
		lista.remove("calças");
		System.out.println("Contem no estoque:"+ lista);
		lista.add("meia");
		System.out.println("Estoque atualizado:"+ lista);
		lista.add(0, "chapeu");
		System.out.println("Contem no estoque:"+ lista);
		

	}

}
