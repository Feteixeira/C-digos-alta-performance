import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int alunos;
		
		System.out.println("Digite o número de alunos: ");
		alunos = in.nextInt();
		
		int[] rms = new int[30];
		double[] notas1 = new double[30];
		double[] notas2 = new double[30];
		double[] medias = new double[30];
		int[] aprovados = new int[30];
		
		int contadorAlunos = 0;
		int contadorAprovados = 0;
		
		for (int i = 0; i < 30; i++) {
			System.out.println("Informe RM do aluno ou valor negativo para encerrar: ");
			int rm = in.nextInt();
			
		 if (rm < 0) {
			 break;
			 }
		 
		
		System.out.println("Digite a primeira nota do aluno " + (i+1) + ": ");
		double nota1 = in.nextDouble();		
		System.out.println("Digite a segunda nota do aluno " + (i+1) + ": ");
		double nota2 = in.nextDouble();	
		
		rms[contadorAlunos] = rm; 
		notas1[contadorAlunos] = nota1;
		notas2[contadorAlunos] = nota2;
		
		double media = (nota1 + nota2) / 2;
		medias[contadorAlunos] = media;
		
		if (media >= 6) {
			aprovados[contadorAprovados] = rm;
			contadorAprovados++;
		}
		contadorAlunos++;
		
		   }
		
		System.out.println("\nRM e media de cada aluno: ");
		for (int i = 0; i < contadorAlunos; i++) {
			System.out.println("RM: " + rms[i] + " | " + "Media " + medias[i]);
		}
		System.out.println("\nRms dos alunos aprovados: ");
		for (int i = 0; i < contadorAprovados; i++) {
			System.out.println("RM: " + aprovados[i]);
		}
		
		in.close();
		}
	}

