
public class testeTodos  {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ();
		cachorro.nome= "Zico";
		cachorro.idade= 2;
		cachorro.emiteSom();
		cachorro.correr();
		
		Cavalo cavalo = new Cavalo ();
		cavalo.nome= "Pé de pano";
		cavalo.idade= 10;
		cavalo.emiteSom();
		cavalo.correr();
		
		
		Preguica preguica = new Preguica();
		preguica.nome = "Ronaldo";
		preguica.idade = 5;
		preguica.emiteSom();
		preguica.subirArvore();
		

	}

}
