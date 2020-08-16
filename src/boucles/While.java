package boucles;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		
		// pour while on teste la condition dans un premier temps avant d'avancer (c'est pas comme chez do while ou on va tester la condition après)
		// avec la boucle do while le bloc sera au moin executé un fois, c'est pas le cas chez while
	
		
		Scanner claver = new Scanner (System.in);
		
		int age=0;
		
		//while veut dire ( tant que ....)
		
			while (age<=0) {
				System.out.println("entre ton age");
			
			//pour lire l'age de l'utilisateur on va faire ceci
			age = claver.nextInt();
			
			if( age<=0) {
				System.out.println("l'age doit est supeieur à 0");
				
				
			}
			
			System.out.println("s 'il vous plait tenter à nouveau");
			
	}
			

}
}
