import java.util.Arrays;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		//2- Faça um programa que entre com três números e coloque em ordem crescente.]
		Locale.setDefault(new Locale("en, Us"));
		
		int n=3;
		int vetor[] = new int[3];
		for (int i=0; i<n; i++) {
			  vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			  
			  
		}
		
		Arrays.sort(vetor);
		JOptionPane.showMessageDialog(null, "O maior valor digitado é:"+ (Arrays.toString(vetor)));
		
	}

}
