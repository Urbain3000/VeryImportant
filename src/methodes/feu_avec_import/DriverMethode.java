package methodes.feu_avec_import;

import methodes.feu_avec_import.methodes_afficher.ResidenceIngenieurs; // numéro de téléphone des ingénieur

public class DriverMethode {

	public static void main(String[] args) {
		
	//1 Declaration
		
		String vert;
		String orange;
		String rouge;
		
		//2 Initinalisation
		
		vert = "vert";
		orange= "orange";
		rouge="rouge";
		
		//4 appler la methode
		
		
		ResidenceIngenieurs.AfficherCouleur(vert); // on a appelé en mettant affichercouleur /ensuite on lui a passé en parametre la couleur à afficher VERT ORANGE ROUGE
		ResidenceIngenieurs.AfficherCouleur(orange);
		ResidenceIngenieurs.AfficherCouleur(rouge);
		
	}

}
