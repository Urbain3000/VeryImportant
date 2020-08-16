package tableaux;

public class Tableausansvaleurs {

	public static void main(String[] args) {
		//lorsqu'on a int[4] cela veut dire que c'est tableau 
		//ayant 4 element avec 0 0 0 0 comme valeur par defaut et on peu leur affecter des entiers et fair des calcules
        
		//creons un tableau de taille fixe "on ne peut plus modifier ce genre de tableau"
		int tab []= new int[4];
		
		// si on avait des doubles on aurait eu des reel, booleen true, false, sting sfkfkg, 
		// si c est un objet particulier la valeur sera null
		// si on avait char alors ce serait '\0000'
		
		//Exo alors affectons de nouvelles valeurs à ce tableau en respectant leurs ordres.
		
		tab[0]=-10;
		tab[2]=50;
		System.out.println(tab[0]+tab[2]);
	
         
        		 
        		 
	}

}
