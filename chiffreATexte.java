import java.util.Scanner;

public class chiffreATexte {

	public static void main(String[] args) {
		/*
		 * Faire un algorithme qui : demande à l’utilisateur de saisir un chiffre -
		 * vérifie que c’est bien un chiffre (entre 0 et 9) - Affiche ce chiffre en
		 * lettres ( « un » « deux »…)
		 */

		Scanner sc = new Scanner(System.in);
		int chiffre;

		// demander à l’utilisateur de saisir un chiffre
		System.out.println("Veuillez saisir un chiffre\n");
		chiffre = sc.nextInt();

		// vérifier que c’est bien un chiffre (entre 0 et 9)
		if (chiffre > 0 && chiffre < 9) {
			// Affichage du chiffre en lettres
			switch (chiffre) {
			case 1:
				System.out.println("Un\n");
				break;
			case 2:
				System.out.println("Deux\n");
				break;
			case 3:
				System.out.println("Trois\n");
				break;
			case 4:
				System.out.println("Quatre\n");
				break;
			case 5:
				System.out.println("Cinq\n");
				break;
			case 6:
				System.out.println("Six\n");
				break;
			case 7:
				System.out.println("Sept\n");
				break;
			case 8:
				System.out.println("Huit\n");
				break;
			}
		} else {
			System.out.println("Le chiffre saisi n'est pas compris entre 0 et 9.\n");
		}
	}
}