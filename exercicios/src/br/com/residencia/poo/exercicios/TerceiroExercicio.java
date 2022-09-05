package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class TerceiroExercicio {
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = ler.nextLine();
	
	    System.out.println("Digite sua idade: ");
	    idade = ler.nextInt();
	    
	    System.out.println("Seu nome é " + nome + " e sua idade é " + idade);
	    
	    ler.close();
		
	}

}
