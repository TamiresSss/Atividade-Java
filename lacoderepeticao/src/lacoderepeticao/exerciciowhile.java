package lacoderepeticao;

import javax.swing.JOptionPane;

public class exerciciowhile {
	
	public static void main(String[] args) {
//		Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
//		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//		idade for =-99. (WHILE)
		int totalDePessoas21=0 , totaldePessoas50=0, idadeVariasPessoas=0;
		
		
		while (idadeVariasPessoas!=-99) {
			idadeVariasPessoas= Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
			if(idadeVariasPessoas<21) {
			totalDePessoas21++;
			
			}
			
			if (idadeVariasPessoas>50) {
				totaldePessoas50++;
			}
		}
			System.out.println("Total de pessoas com menos de 21 anos �:"+ totalDePessoas21);
			System.out.println("Total de pessoas com mais de 50 anos �:" + totaldePessoas50);
		
	}
}
