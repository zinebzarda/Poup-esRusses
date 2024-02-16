import java.util.*;
public class Menu {

    // ANSI escape codes for colors
    public static final  String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Poupee poupee = null;

        int Exit=0;
        loop:while(Exit==0){
            int Choose;
            System.out.println(ANSI_CYAN+"******************************************************");
            System.out.println("*****************Choose one option:*******************");
            System.out.println(ANSI_GREEN+"**   1:  Ouvre la poupée                            **");
            System.out.println(ANSI_RED+"**   2:  Ferme la poupée                            **");
            System.out.println(ANSI_GREEN+"**   3:  Place la poupée courante dans la poupée    **");
            System.out.println(ANSI_RED+"**   4:  Sort la poupée courante de la poupée       **");
            System.out.println("**   5:  Exit All                                   **");
            System.out.println(ANSI_CYAN+"******************************************************");
            System.out.println("******************************************************"+ANSI_RESET);
            Choose = scanner.nextInt();
            switch (Choose) {
                case 1:
                    poupee.ouvrir();
                    break;
                case 2:
                    poupee.fermer();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    Exit=1;
                    break;
                default:
                    break;
            }

        }




    }
}
