package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class ListaExercicioQuatro {
	
	public static void main(String[] args) {
		
		int tc, tf;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Temperatura em C°: ");
		tc = ler.nextInt();
		
		tf = (int) (tc * 1.8 + 32);
		
		System.out.println("======================");
		System.out.println("Temperatura em F°: "+ tf);
		
		ler.close();
		
	}

}
