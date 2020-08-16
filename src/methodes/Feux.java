package methodes;

public class Feux {

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
		
		
		AfficherCouleur(vert); // on a appelé en mettant affichercouleur /ensuite on lui a passé en parametre la couleur à afficher VERT ORANGE ROUGE
		AfficherCouleur(orange);
		AfficherCouleur(rouge);
		
	}
	
	// 3 creer la methode
	
	// on utilse une methode avec return si le chauffeur attend le resultat de l'affichage des feux pour decider s'il passe ou pas
	// Le feux est comme couvert avec un sachet noir, le chauffeur a besoin qu'on n'enleve le sachet afin qu'il puisse voir les couleur pour passer
	// S'il est juste question d'afficher ses couleurs de feux seulement sans ce preocuper du chauffeur ALORS on utilise le void parcequ'on retounre rien
	// Ci dessous l'example 1
	
	
	public static void AfficherCouleur(String f) {
	    System.out.println(f);
		
	}
	


}
