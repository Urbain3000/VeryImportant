package Scanners;

import java.util.Scanner;

public class Interactions {

	public static void main(String[] args) {
		
	System.out.println("Veillez saisir votre nom : ");
	//System.out.println("Veillez saisir votre age : " +age);
	
		Scanner sc= new Scanner(System.in);
		String x =sc.nextLine();
		
		
	//	int age= sc.nextInt();
    //  double d=sc.nextDouble();
		
		
		System.out.println("Vous avez saisie : " + x);

	}

}
