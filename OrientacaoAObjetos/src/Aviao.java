//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
//esta classe, em seguida crie um objeto avi�o, defina as instancias deste
//objeto e apresente as informa��es deste objeto no console.

public class Aviao {
	int numeroPassageiro=150;
	int numeroAcentos=200;
	
	
	void embarque (int quantidadeDePassagens) {
		
		if (numeroPassageiro+quantidadeDePassagens<numeroAcentos) {
			numeroPassageiro = numeroPassageiro + quantidadeDePassagens;
			System.out.println("Passageiros embarcados!");
			
		} else {
			System.out.println("N�o � foi poss�vel embarcar!");
		}
		
	}
	
	void desembarque (int quantidadeDesembarque) {
		numeroPassageiro= numeroPassageiro - quantidadeDesembarque;
		System.out.println("Quantidade de Passageiros no desembarque:"+ quantidadeDesembarque);
	}
	
}
