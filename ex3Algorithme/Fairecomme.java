package ex3Algorithme;

import java.util.Arrays;
import java.util.Scanner;

public class Fairecomme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ValeurLue;
		int Lasomme = 0;
		int[] tab; // celui-ci un tableau vide qui contient les numéro en type int
		int n = 5;
		tab = new int[n]; // creer un tableau 5 élements
		Scanner src = new Scanner(System.in);
		for (int i = 0; i < tab.length; i++) {
			// saisir les numeros selon sa positon dans le tableau
			System.out.println("Saissiez votre valeur, svp");
			tab[i] = src.nextInt();
		}
		
		//calculer la somme tant que valeurLue <> 0
		ValeurLue = tab[0];
		int i = 0;
		while (ValeurLue != 0 && i < n ) {
			ValeurLue = tab[i];
			Lasomme = Lasomme + ValeurLue;
			i++;
		}
		
		
		;
		System.out.println("Tableau origin de valeurs est: " + Arrays.toString(tab));
		System.out.println("La somme est: " + Lasomme);
	}
}
