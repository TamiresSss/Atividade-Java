//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
//referentes esta classe, em seguida crie um objeto produto eletr�nico,
//defina as instancias deste objeto e apresente as informa��es deste objeto
//no console.
public class Eletronico {

	int quantidadeBateria;
	String modelo;
	
	void carregar (int energia) {
		quantidadeBateria = quantidadeBateria + energia;
		System.out.println("A quantidade de energia �:"+ quantidadeBateria);
	}

	void mostrarModelo () {
		System.out.println("O modelo do eletronico �: "+ modelo);
	}
	
}
