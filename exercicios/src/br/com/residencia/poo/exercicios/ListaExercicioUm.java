package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class ListaExercicioUm {
	
	public static void main(String[] args) {
		
		String nome, sobrenome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Olá! Qual é o seu nome? ");
		nome = ler.nextLine();
		System.out.println("E o seu sobrenome? ");
		sobrenome = ler.nextLine();
		
		System.out.println("Seja bem vindo(a), "+ nome +" "+ sobrenome +"!");
		
		ler.close();
		
	}

}
