//5) Crie uma classe patinete e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto patinete, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Patinete {
	

	 int velocidade;
	 
	 void acelerar(int aceleracao) {
			velocidade = velocidade + aceleracao;
			System.out.println("A velocidade do Patinete é:"+ velocidade);
		}
		
		void freiar(int reduzir) {
			velocidade = velocidade - reduzir;
			System.out.println("Para freiar:"+ velocidade);
		}
}
