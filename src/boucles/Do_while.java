package boucles;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		// avec la boucle do while on ne sait pas combien de fois on va repeter l'intructuion
		//or chez for on connaissait combien de fois il fallait repeter
		
		
		Scanner claver = new Scanner (System.in);
		
		int age;
		
		//do while veut dire (faire tant que ....)
		
		do {
			System.out.println("entre ton age:");
			
			
			//pour lire l'age de l'utilisateur on va faire ceci
			age = claver.nextInt();
		} while (age <=0);
		
		System.out.println("bravo on continue");

	}

}
