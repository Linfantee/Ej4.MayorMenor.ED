package Ej4.MayorMenor.ED;

import java.util.Scanner;


public class inicio{
	
	
	public static void main (String[] args) {
		   
		Scanner mayorMenor = new Scanner(System.in);

		int numero;
		int numero2;
		int numero3;
		System.out.println("Introduzca un factor: ");
		numero = mayorMenor.nextInt();
		System.out.println("Introduzca un segundo factor: ");
		numero2 = mayorMenor.nextInt();
		System.out.println("Introduzca un tercer factor: ");
		numero3 = mayorMenor.nextInt();

		if (numero <= numero2 & numero <= numero3) {
			
			if(numero2 <= numero3) {
				System.out.println(numero3 + numero2 + numero);
			}
			else
			{
				System.out.println(numero2 + "," + numero3 + "," + numero);
			}
		
		}else if (numero2 <= numero & numero2 <= numero3) {
			
			if(numero <= numero3) {
				System.out.println(numero3 + "," + numero + "," + numero2);
			}
			else
			{
				System.out.println(numero + "," + numero3 + "," + numero2);
			}
			
		}else if (numero3 <= numero & numero3 <= numero2) {
			
			if(numero <= numero2) {
				System.out.println(numero2 + "," + numero + "," + numero3);
			}
			else
			{
				System.out.println(numero + "," + numero2 + "," + numero3);
			}
		}
	}
}