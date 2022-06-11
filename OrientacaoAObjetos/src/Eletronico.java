//3) Crie uma classe produto eletrônico e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto produto eletrônico,
//defina as instancias deste objeto e apresente as informações deste objeto
//no console.
public class Eletronico {

	int quantidadeBateria;
	String modelo;
	
	void carregar (int energia) {
		quantidadeBateria = quantidadeBateria + energia;
		System.out.println("A quantidade de energia é:"+ quantidadeBateria);
	}

	void mostrarModelo () {
		System.out.println("O modelo do eletronico é: "+ modelo);
	}
	
}
