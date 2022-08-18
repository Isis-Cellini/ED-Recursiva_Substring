package view;

import java.util.Scanner;

import controller.controllerRecursiva;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		scan.close();
		int posFinal = palavra.length()-1;

		controllerRecursiva inverter = new controllerRecursiva();
		String resultado = inverter.inverte(palavra, posFinal);
		
		System.out.println(resultado);
		
	}

}
