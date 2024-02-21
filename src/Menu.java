import java.util.*;
public class Menu {

    PoupeeRusse poup1 = new PoupeeRusse("", 0);
    PoupeeRusse poup2 = new PoupeeRusse("", 0);
    PoupeeRusse poup3 = new PoupeeRusse("", 0);
    static Scanner scanner = new Scanner(System.in);
    // ANSI escape codes for colors
    public static final  String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuInterface();
    }
    public void menuInterface() {


            int Choix;
            do {
                System.out.println("| ------------- Menu----------------- |");
                System.out.println("|-------------------------------------|");
                System.out.println(ANSI_CYAN+"|      1. Ajouter un poupée.          |");
                System.out.println("|      2. Afficher les poupée.        |");
                System.out.println("|      3. Commencer le jeu.           |");
                System.out.println(ANSI_RED+"|      4. Quitter le jeu.             |");
                System.out.println(ANSI_RESET+"|----------------------------------- -|");
                System.out.print(ANSI_GREEN +"          Entrez un choix : "+ANSI_RESET );
                Choix = scanner.nextInt();
                switch (Choix) {
                    case 1:
                        System.out.println(ANSI_GREEN+"Ajouter la poupée numéro 1"+ANSI_RESET);

                        System.out.println("Entrez le nom de la poupée:");
                        Scanner input=new Scanner(System.in);
                        String nom=input.nextLine();
                        poup1.setNom(nom);
                        //Scanner Nom = scanner.nextLine();
                        System.out.println("Entrez la taille de la poupée :");
                        int taille = input.nextInt();
                        poup1.setTaille(taille);
                        System.out.println("Poupées ajoutées avec succès !");
                        ////////////////////////////////////////////

                        System.out.println(ANSI_GREEN+"Ajouter la poupée numéro 2"+ANSI_RESET);
                        System.out.println("Entrez le nom de la poupée:");
                        nom=input.next();
                        poup2.setNom(nom);
                        //Scanner Nom = scanner.nextLine();
                        System.out.println("Entrez la taille de la poupée :");
                        taille = input.nextInt();
                        poup2.setTaille(taille);
                        System.out.println("Poupées ajoutées avec succès !");
                        System.out.println(ANSI_GREEN+"Ajouter la poupée numéro 3"+ANSI_RESET);

                        System.out.println("Entrez le nom de la poupée:");

                        nom=input.next();
                        poup3.setNom(nom);
                        //Scanner Nom = scanner.nextLine();
                        System.out.println("Entrez la taille de la poupée :");
                        taille = input.nextInt();
                        poup3.setTaille(taille);
                        System.out.println("Poupées ajoutées avec succès !");
                      //  poup3.ajouterPoupees();
                        break;
                    case 2:
                        System.out.println(ANSI_CYAN+"  La liste des poupées disponible   "+ANSI_RESET);
                        System.out.println("------------------------------------");
                        System.out.println(ANSI_PURPLE+"| ------    Poupée Russe 1    ------ |\n");
                        poup1.afficherPoupees();
                        System.out.println("| ------    Poupée Russe 2    ------ |\n");
                        poup2.afficherPoupees();
                        System.out.println("| ------    Poupée Russe 3    ------ |\n");
                        poup3.afficherPoupees();
                        break;
                    case 3:
                        GameInterface();
                        break;
                    case 4:
                        System.out.println(ANSI_RED+" Quitté  ");
                        break;
                    default:
                        System.out.println("      Entrez un choix valid !       "+ANSI_RESET);
                        break;
                }
            } while (Choix != 4);

        }
        public void GameInterface (){
            int ChoixGame;
            do {
                System.out.println(ANSI_CYAN+"|       jouer a poupée russe         |"+ANSI_RESET);
                System.out.println("|------------------------------------|");
                System.out.println(ANSI_GREEN+"|      1. Ouvrir une poupée.         |");
                System.out.println(ANSI_RED+"|      2. Fermer une poupée.         |");
                System.out.println(ANSI_GREEN+"|      3. Placer dans.               |");
                System.out.println(ANSI_RED+"|      4. Sortir de.                 |");
                System.out.println(ANSI_CYAN+"|      5. Retour a Menu.             |");
                System.out.println("|------------------------------------|");
                System.out.print(ANSI_RESET+"          Entrez un choix : ");
                ChoixGame = scanner.nextInt();
                switch (ChoixGame) {
                    case 1:
                        int ChoixOpen;
                        System.out.println("|       ouvrir une Poupée Russe      |");
                        System.out.println("|------------------------------------|");
                        System.out.println(" choisir la poupée a ouvrir 1,2 ou 3 ");
                        System.out.println("|------------------------------------|");
                        System.out.print("          Entrez un choix : ");
                        ChoixOpen = scanner.nextInt();
                        switch (ChoixOpen){
                            case 1 :
                                poup1.ouvrir();
                                break;
                            case 2 :
                                poup2.ouvrir();
                                break;
                            case 3 :
                                poup3.ouvrir();
                                break;
                            default:
                                System.out.println("Entrez un choix valid !");
                                break;
                        }
                        break;
                    case 2:
                        int ChoixClose;
                        System.out.println("|       fermer une Poupée Russe      |");
                        System.out.println("|------------------------------------|");
                        System.out.println("| choisir la poupée a fermer 1,2 ou 3|");
                        System.out.println("|------------------------------------|");
                        System.out.print("          Entrez un choix : ");
                        ChoixClose = scanner.nextInt();
                        switch (ChoixClose){
                            case 1 :
                                poup1.fermer();
                                break;
                            case 2 :
                                poup2.fermer();
                                break;
                            case 3 :
                                poup3.fermer();
                                break;
                            default:
                                System.out.println("   Entrez un choix valid !  ");
                                break;
                        }
                        break;
                    case 3:
                        int ChoixPlaceIn;
                        System.out.println("|       Placer une Poupée Russe      |");
                        System.out.println("|------------------------------------|");
                        System.out.println("|  1. Placer poupée 1 dans poupée 2. |");
                        System.out.println("|  2. Placer poupée 1 dans poupée 3. |");
                        System.out.println("|  3. Placer poupée 2 dans poupée 1. |");
                        System.out.println("|  4. Placer poupée 2 dans poupée 3. |");
                        System.out.println("|  5. Placer poupée 3 dans poupée 1. |");
                        System.out.println("|  6. Placer poupée 3 dans poupée 2. |");
                        System.out.println("|------------------------------------|");
                        System.out.print("          Entrez un choix : ");
                        ChoixPlaceIn = scanner.nextInt();
                        switch (ChoixPlaceIn){
                            case 1 :
                                poup1.placerDans(poup2);
                                break;
                            case 2 :
                                poup1.placerDans(poup3);
                                break;
                            case 3 :
                                poup2.placerDans(poup1);
                                break;
                            case 4 :
                                poup2.placerDans(poup3);
                                break;
                            case 5 :
                                poup3.placerDans(poup1);
                                break;
                            case 6 :
                                poup3.placerDans(poup2);
                                break;
                            default:
                                System.out.println("|      Entrez un choix valid !       |");
                                break;
                        }
                        break;
                    case 4:
                        int ChoixLeave;
                        System.out.println("|       Sortir une Poupée Russe      |");
                        System.out.println("|------------------------------------|");
                        System.out.println("|  1. Sortir poupée 1 dans poupée 2. |");
                        System.out.println("|  2. Sortir poupée 1 dans poupée 3. |");
                        System.out.println("|  3. Sortir poupée 2 dans poupée 1. |");
                        System.out.println("|  4. Sortir poupée 2 dans poupée 3. |");
                        System.out.println("|  5. Sortir poupée 3 dans poupée 1. |");
                        System.out.println("|  6. Sortir poupée 3 dans poupée 2. |");
                        System.out.println("|------------------------------------|");
                        System.out.print("          Entrez un choix : ");
                        ChoixLeave = scanner.nextInt();
                        switch (ChoixLeave){
                            case 1 :
                                poup1.sortirDe(poup2);
                                break;
                            case 2 :
                                poup1.sortirDe(poup3);
                                break;
                            case 3 :
                                poup2.sortirDe(poup1);
                                break;
                            case 4 :
                                poup2.sortirDe(poup3);
                                break;
                            case 5 :
                                poup3.sortirDe(poup1);
                                break;
                            case 6 :
                                poup3.sortirDe(poup2);
                                break;
                            default:
                                System.out.println(" Entrez un choix valid !");
                                break;
                        }
                    case 5 :
                        menuInterface();
                        break;
                    default:
                        System.out.println("Entrez un choix valid !");
                        break;
                }
            }while (ChoixGame != 5);
        }
    }


