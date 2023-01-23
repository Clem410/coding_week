/**
 * Fichier de code principal.
 * 
 * @author Thomas Raimbault (squelette de base)
 * @author à compléter (les membres de l'équipe)
 * @version 2023/01
 */

// Contient l'ensemble des fonctions pour le programme (dont la fonction main).
// Y ajouter vos propres fonctions !
public class Main {

	// RAPPEL : seul le code contenu dans cette fonction « main » est exécuté par le
	// programme
	public static void main(String[] args) throws Exception {
		baseJour1();
	}

	// Fonction fournie montrant l'utilisation d'une partie des fonctions
	// disponibles.
	static void baseJour1() {
		// initialisation d'une matrice d'entiers en chargant une carte au format .txt
		int[][] carte = Outils.chargerCarte("carte01.txt");
		afficherMatriceEnConsole(carte);

		// Association de la matrice à la fenêtre graphique
		FenetreGraphique.initialiserFenetre(carte);

		// Marquer une pause
		System.out.print("Appuyer sur Entrer pour suite");
		Console.appuyerSurEntrer();

		// Exemple de modification d'une case de la carte
		int eau = 1; // selon la légende
		carte[0][1] = eau;
		// index ligne puis index colonne.
		// Valeur possible selon "legende.csv" !
		// Attention : informer la fenêtre après une mise à jour dans la matrice
		// d'entiers !!
		FenetreGraphique.rafraichirElement(0, 1); // préciser les mêmes index (ligne puis colonne)
		System.out.println("La valeur en position [0][1] a été mise à jour.");

		// Exemple de modification du texte en zone de droite de la fenêtre
		FenetreGraphique.modifierMessageDroite("La valeur en position [0][1] a été mise à jour.");

		// Exemple de modification du texte en zone du bas de la fenêtre
		System.out.println("Saisir le message du bas");
		String msg = Console.saisirChaine();
		FenetreGraphique.modifierMessageBas(msg);

		// Exemple d'enregistrement
		Outils.enregistrerCarte(carte, "carteSauvegardee.txt");
		Console.effacerContenu();
		System.out.println("Enregistrement effectué dans un nouveau fichier txt.");

		FenetreGraphique.messagePopUp("fin");
	}

	// Autre fonction fournie (à adapter si besoin) pour afficher « de façon brute »
	// une matrice d'entiers en Console.
	// Précondition : fournir une matrice d'entiers non null. (« Matrice » <=> même
	// nombre de colonnes à chaque ligne)
	// Le premier index correspond aux lignes, le second aux colonnes.
	static void afficherMatriceEnConsole(int[][] matrice) {
		// parcours ligne par ligne
		for (int lig = 0; lig < matrice.length; lig++) {
			// parcours colonne par colonne
			for (int col = 0; col < matrice[0].length; col++) {
				// contenu d'une case
				System.out.print(matrice[lig][col]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

} // ne pas supprimer (fin de la class Main contenant les fonctions)
