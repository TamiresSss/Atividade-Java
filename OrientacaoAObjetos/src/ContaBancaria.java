//6) Crie uma classe conta bancaria e apresente os atributos e m�todos
//referentes esta classe, em seguida crie um objeto conta bancaria, defina
//as instancias deste objeto e apresente as informa��es deste objeto no
//console.
public class ContaBancaria {
	
	
	int saldo;
	
	
	void sacar(int valor) {
		saldo=saldo-valor;
		
	}
	
	void depositar (int valor) {
		saldo=saldo+valor;
		
	}

	void verSaldo () {
		System.out.println("O saldo da conta �"+ saldo);
	}
}
