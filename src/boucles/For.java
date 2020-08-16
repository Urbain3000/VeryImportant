package boucles;

public class For {

	public static void main(String[] args) {
	// les boucles: elle nous permettent de repeter les instructions plusieurs fois jusqu'arriver à l'objectif
		
		//(initialisation)                  (condition)                                             (concatenation)
		// bloc d'instruct (int i=1)        (il faut repeter cela tant que le i est <=10)           (on ajoute le nombre i++)
		
		
		for(int i=1; i<=10;i++) {
		
		System.out.println("le triple de " + i +" est: "+ 3*i);
		
		//on utilise la boucle for lorsqu'on connait le nombre de fois qu'on doit repeter un bloc d'instruction.
		
		}
		
		// ici on est sorti de la boucle preceddente et on y a ajouté une ligne j'aime java
System.out.println("j'aime java");
	}

}
