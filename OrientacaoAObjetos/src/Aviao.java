//2) Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

public class Aviao {
	int numeroPassageiro=150;
	int numeroAcentos=200;
	
	
	void embarque (int quantidadeDePassagens) {
		
		if (numeroPassageiro+quantidadeDePassagens<numeroAcentos) {
			numeroPassageiro = numeroPassageiro + quantidadeDePassagens;
			System.out.println("Passageiros embarcados!");
			
		} else {
			System.out.println("Não é foi possível embarcar!");
		}
		
	}
	
	void desembarque (int quantidadeDesembarque) {
		numeroPassageiro= numeroPassageiro - quantidadeDesembarque;
		System.out.println("Quantidade de Passageiros no desembarque:"+ quantidadeDesembarque);
	}
	
}
