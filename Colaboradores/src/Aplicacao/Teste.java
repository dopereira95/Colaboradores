package Aplicacao;

import java.util.Scanner;

import Colaborador.AnalistaDeSistemas;
import Colaborador.Colaboradores;
import Colaborador.Desenvolvedor;
import Colaborador.GerenteDeProjetos;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GerenteDeProjetos gerente = Obter(scan);
		AnalistaDeSistemas analista = Obter1(scan);
		Desenvolvedor desenvolvedor = Obter2(scan);
		
		gerente.exibeDados3();
		analista.exibeDados2();
		desenvolvedor.exibeDados1();
	}
	
	private static GerenteDeProjetos Obter(Scanner scan) {
		System.out.println("**** Gerente ****");
		System.out.println("");
		
		System.out.print("informe o código do colaborador:");
		int codColaborador = scan.nextInt();
		System.out.print("informe o nome do colaborador:");
		String nomeColaborador = scan.next();
		System.out.print("informe a data de admissão do colaborador:");
		String dataColaborador = scan.next();
		System.out.print("O colaborador conhece o Project: (true/false)");
		boolean Colaborador = scan.nextBoolean();
		GerenteDeProjetos gerente = new GerenteDeProjetos(codColaborador, dataColaborador, dataColaborador,
				Colaborador);
		return gerente;
	}
		
		private static AnalistaDeSistemas Obter1(Scanner scan) {
		System.out.println("**** Analista ****");
		System.out.println("");
		
		System.out.print("informe o código do colaborador:");
		int codColaborador = scan.nextInt();
		System.out.print("informe o nome do colaborador:");
		String nomeColaborador = scan.next();
		System.out.print("informe a data de admissão do colaborador:");
		String dataColaborador = scan.next();
		System.out.print("O colaborador conhece o UML: (true/false)");
		boolean Colaborador = scan.nextBoolean();
		AnalistaDeSistemas analista = new AnalistaDeSistemas(codColaborador, dataColaborador, dataColaborador,
																Colaborador);
		return analista;
		
		}
		
		private static Desenvolvedor Obter2(Scanner scan) {
		System.out.println("**** Desenvolvedor ****");
		System.out.println("");
		
		System.out.print("informe o código do colaborador:");
		int codColaborador = scan.nextInt();
		System.out.print("informe o nome do colaborador:");
		String nomeColaborador = scan.next();
		System.out.print("informe a data de admissão do colaborador:");
		String dataColaborador = scan.next();
		System.out.print("O colaborador conhece o Java: (true/false)");
		boolean javaColaborador = scan.nextBoolean();
		System.out.print("O colaborador conhece o .NET: (true/false)");
		boolean netColaborador = scan.nextBoolean();
		Desenvolvedor desenvolvedor = new Desenvolvedor(codColaborador, nomeColaborador, dataColaborador, javaColaborador, netColaborador);
		return desenvolvedor;
		
		
	}
	 
}
		
		

	
