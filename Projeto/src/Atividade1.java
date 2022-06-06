package src;


public class Atividade1 { 
	//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	//dias e mostre-a expressa apenas em dias.


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos , meses , dias;

		anos = 25;
		meses = (anos * 12);
    	dias = (anos * 365);

    	System.out.println ("A idade é " + anos + " Anos" + "\n"  ); 
		System.out.println( "Isso em dias é " + dias );
	}

}
