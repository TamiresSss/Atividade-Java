//4) Crie uma classe funcion�rio e apresente os atributos e m�todos
//referentes esta classe, em seguida crie um objeto funcion�rio, defina as
//instancias deste objeto e apresente as informa��es deste objeto no
//console.
public class Funcionario {
	
	int pagamento;
	String nome="Larissa Oliveira";
	
	void pagar (int dinheiro) {
		pagamento = pagamento + dinheiro;
		System.out.println("O pagamento �" + dinheiro);
	
	}
	
	void nomeFuncionario () {
		System.out.println("Nome:"+ nome);
	}
}
