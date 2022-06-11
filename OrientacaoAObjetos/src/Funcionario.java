//4) Crie uma classe funcionário e apresente os atributos e métodos
//referentes esta classe, em seguida crie um objeto funcionário, defina as
//instancias deste objeto e apresente as informações deste objeto no
//console.
public class Funcionario {
	
	int pagamento;
	String nome="Larissa Oliveira";
	
	void pagar (int dinheiro) {
		pagamento = pagamento + dinheiro;
		System.out.println("O pagamento é" + dinheiro);
	
	}
	
	void nomeFuncionario () {
		System.out.println("Nome:"+ nome);
	}
}
