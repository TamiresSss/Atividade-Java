package lacoderepeticao;

import javax.swing.JOptionPane;

public class exercicioDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6- Escrever um programa que receba vários números inteiros no teclado. E no
//		final imprimir a média dos números múltiplos de 3. Para sair digitar
//		0(zero).(DO...WHILE)
		int numeroInteiro , mediaNumerosM=0 , somaDosN=0 ;
	
		
		do {
			numeroInteiro =	Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			
			
			if(numeroInteiro!=0 && numeroInteiro%3==0) {
				mediaNumerosM = mediaNumerosM + numeroInteiro;
				somaDosN++;
				System. out. println("A média dos números múltiplos de 3 é:"+ mediaNumerosM/somaDosN);
			}
			} while(numeroInteiro!=0);
		
		
		
		}
	
}


