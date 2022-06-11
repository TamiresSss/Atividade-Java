//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

public class Cliente {
	
	String nome; 
	int idade;
	boolean clienteAtivo;
	
	
	void cadastrarCliente(String nomeDoCliente, int idadeDoCliente, boolean clienteAtivo) {
		
		nome = nomeDoCliente;
		idade = idadeDoCliente;
		this.clienteAtivo = clienteAtivo;
		
	}
			
	String comprar (int dinheiro , String produto) {
		if (dinheiro>0) {
			return produto;
		}
		
		return "";
		
	}
	
	void mostrarCadastro() {
			System.out.println("O Nome do cliente é:" + nome);
			System.out.println("A idade do cliente é:" + idade);
			System.out.println("Situação do cliente:" + clienteAtivo);
	}
	

}
