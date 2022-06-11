
public class Main {

	public static void main(String[] args) {

		Cliente seuCliente = new Cliente();
		Cliente outroCliente = new Cliente();
		
		seuCliente.cadatrarCliente("Tamires dos santos", 26, false);
		outroCliente.cadatrarCliente("Lucas Toscano", 28, true);
		
		System.out.println("O produto comprado foi : " + seuCliente.comprar(0, "Make"));
		
		seuCliente.mostrarCadastro();
		outroCliente.mostrarCadastro();
		Aviao meuaviao= new Aviao();
		meuaviao.embarque(20);
		meuaviao.desembarque(200);
		Eletronico eletronico = new Eletronico ();
		eletronico.carregar(10);
		eletronico.mostrarModelo();
		Funcionario Larissa = new Funcionario ();
		Larissa.pagar(1000);
		Larissa.nomeFuncionario();
	}

}
