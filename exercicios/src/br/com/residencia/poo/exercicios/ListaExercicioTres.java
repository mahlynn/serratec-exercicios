package br.com.residencia.poo.exercicios;

import java.util.Scanner;

public class ListaExercicioTres {
	
	public static void main(String[] args) {
		
		int n1, n2, soma, sub, mult, div;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Primeiro número: ");
		n1 = ler.nextInt();
		System.out.print("Segundo número: ");
		n2 = ler.nextInt();
		
		if(n2 == 0) {
			System.out.println("* Não é possível utilizar esse número, tente novamente.");
			System.out.println("* ERRO: O segundo número é 0");
		}
		
		else {
		
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		div = n1 / n2;
		
		System.out.println("====================");
		System.out.println("Soma: "+ soma);
		System.out.println("Subtração: "+ sub);
		System.out.println("Multiplicação: "+ mult);
		System.out.println("Divisão: "+ div);
		
		ler.close();
		
		}
	}

}
