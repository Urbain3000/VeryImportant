package boucles;

public class For_1 {

	public static void main(String[] args) {
		// Table de multiplication
		
		for(int i=1; i<=10;i++) {
			System.out.println("3 multiplier par"+ i +"est:"+ (3*i));
			
			// on pouvait aussi utiliser une constante pour faire la meme chose
//			
//			final int NOMBRE =5;
//			
//			for(int i2=1; i2<=10;i2++) {
//				System.out.println("5 multiplier par"+ i +"est:"+ (NOMBRE *i));
			
		}
		
		// les boucles infinis
		// il faut faire attention avec cette boucle. c est vrai le pc s'arretera mais sachons juste que cette boucle infini est plus utilisé ds les jeux
		
		for (int i3=0; i3>=0; i3++) {
		System.out.println("la variable i3 est egale à"+ i3);
		
		// NB ne jamais oublier de mettre les acolades car moi meme j'ai mis un ; à la place d'une acolade

	}

}
}

