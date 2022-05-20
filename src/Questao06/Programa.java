package Questao06;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		boolean sair = false;
		int junior = 0;
		int pleno = 0;
		int senior = 0;

		while (sair == false) {
			
			System.out.println("Voc� deseja cadastrar? s/n");
			String simOuNao = leitor.nextLine();
			
			if(simOuNao.equals("n")) {
				sair = true;
				break;
			}	
		
            System.out.println("informe seu cargo: junior/pleno/s�nior");
			String reposta = leitor.nextLine();
     
			switch (reposta) {

			case "junior":
				AnalistaJunior analistaJunior = new AnalistaJunior();
				System.out.println("Me informe seu nome: ");
				analistaJunior.setNome(leitor.nextLine());
				System.out.println("Nivel que est�: ");
	            analistaJunior.setNivel(Integer.parseInt(leitor.nextLine()));
				System.out.println("Seu salario: " + analistaJunior.salario());
				junior++;
				break;
				
			case "pleno":
				AnalistaPleno analistaPleno = new AnalistaPleno();
				System.out.println("Me informe seu nome: ");
				analistaPleno.setNome(leitor.nextLine());
				System.out.println("Nivel que est�: ");
	            analistaPleno.setNivel(Integer.parseInt(leitor.nextLine()));
				System.out.println("Seu salario: " + analistaPleno.salario());
				pleno++;
				break;
				
			case "s�nior":
				AnalistaSenior analistaSenior = new AnalistaSenior();
				System.out.println("Me informe seu nome: ");
				analistaSenior.setNome(leitor.nextLine());
				System.out.println("Nivel que est�: ");
	            analistaSenior.setNivel(Integer.parseInt(leitor.nextLine()));
				System.out.println("Seu salario: " + analistaSenior.salario());
				senior++;
				break;
			default:
				System.out.println("Op��o invalida");
				break;
			}
		}
		leitor.close();
		System.out.println("Tolta de junior: " + junior);
		System.out.println("Tolta de pleno: " + pleno);
		System.out.println("Tolta de s�nior: " + senior);
	}
}
