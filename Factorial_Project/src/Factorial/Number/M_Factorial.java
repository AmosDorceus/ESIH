package Factorial.Number;

import java.util.Scanner;

public class M_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// On créé une instance de la classe scanner pour pouvoir récupérer des valeurs
		Scanner sc = new Scanner(System.in);
		System.out.println("*********************************************************"
				+ " \n Bienvenue à ce programme qui va "
				+ "calculer la factorielle d'un nombre \n"
				+ "*************************************************************");
		
		// Le programme communique avec son utilisateur
		System.out.println("Saisir à l'aide du clavier le nombre dont vous souhaitez"
				+ "calculer la factorielle");
		int nombre=sc.nextInt();
		sc.close();
		//Creation d'une instance de la classe Factorielle.java
		
		Factorielle number= new Factorielle();
		// utilisation de la methode numFacto de la classe Factorielle
		number.numFacto(nombre);
		
	}

}
