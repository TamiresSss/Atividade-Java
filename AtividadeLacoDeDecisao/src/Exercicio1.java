import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Locale.setDefault(new Locale("en, Us"));
		int numero4 , numero5 , numero6, valorMaior=0;
		
		numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		numero5 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		numero6 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		
		valorMaior= numero4;
		
		if (valorMaior<numero5) {
			valorMaior=numero5;
		}
		if (valorMaior<numero6) {
			valorMaior =numero6;
			
		}
				JOptionPane.showMessageDialog(null, "O maior valor digitado é:"+ valorMaior);
	}

}
