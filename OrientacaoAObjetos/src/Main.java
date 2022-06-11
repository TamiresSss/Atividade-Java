
public class Main {

	public static void main(String[] args) {

		Cliente seuCliente = new Cliente();
		seuCliente.cadastrarCliente("Tamires dos santos", 26, false);
		System.out.println("O produto comprado foi : " + seuCliente.comprar(0, "Make"));
		seuCliente.mostrarCadastro();
		
		Aviao meuaviao= new Aviao();
		meuaviao.embarque(20);
		meuaviao.desembarque(200);
		
		Eletronico eletronico = new Eletronico ();
		eletronico.carregar(10);
		eletronico.mostrarModelo();
		
		Funcionario Larissa = new Funcionario ();
		Larissa.pagar(1000);
		Larissa.nomeFuncionario();
		
		Patinete patinete = new Patinete();
		patinete.acelerar(20);
		patinete.freiar(20);
		
		ContaBancaria conta = new ContaBancaria();
		conta.depositar(50);
		conta.sacar(20);
		
		Paciente paciente = new Paciente();
		paciente.cadastrarCliente("Meu paciente",30, true);
		paciente.comprar(100, "Consulta medica");
		paciente.mostrarCadastro();
		paciente.cadastrarDoenca("Febre");
	}

}
