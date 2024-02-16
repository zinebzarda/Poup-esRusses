import javax.naming.Name;
import java.util.*;

class PoupeeRusse extends Poupee {
    private String Nom;
    private boolean empty;
    private PoupeeRusse PR ;
    public PoupeeRusse(int taille , String Nom){
        super(taille);

    }

    public String getNom(){
        return Nom;
}
public void setNom(String Nom){
        this.Nom=Nom;
}
    public void AjouterPoupee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de la poupée : ");
        String nv_nom = scanner.nextLine();
        this.setNom(nv_nom);
        System.out.println("Entrez la taille de la poupée : ");
        int nv_Taille = scanner.nextInt();
        this.setTaille(nv_Taille);
    }

    public void AffivherPoupee() {
        System.out.println("|Nom: "+this.getNom());
        System.out.println("|Taille: "+this.getTaille());
    }

    @Override
    public void ouvrir() {
        if (!isouvert()) {
            setOuvert(true);
            System.out.println("La poupée "+this.getNom()+" a été ouvrir avec succes");
        } else {
            System.out.println("la poupée "+this.getNom()+" est déja ouverte");
        }
    }

    @Override
    public void fermer() {
        if (isouvert()) {
            setOuvert(false);
            System.out.println("La poupée "+this.getNom()+" a été ouvrir avec succes.");
        } else {
            System.out.println("La poupée "+this.getNom()+" est déja ouverte.");
        }
    }

    @Override
    void placerDans(Poupee p) {
        PoupeeRusse R = (PoupeeRusse) p;
        if (!R.isouvert()) {
            System.out.println("Impossible de placer dans cette poupée");
            System.out.println("La poupée est fermée, veuillez l'ouvrir.");
        }

        if (this.getTaille() >= p.getTaille()) {
            System.out.println("Impossible de placer dans cette poupée");
            System.out.println("La taille de la poupée est petite.");
        }

        System.out.println("la poupée "+this.Nom+" est placée dans "+R.Nom);

    }

    @Override
    public void sortirDe(Poupee p) {
        PoupeeRusse R = (PoupeeRusse) p;
        if (R.isouvert() && this.getTaille() > p.getTaille()) {
            System.out.println("Impossible de sortir la poupée, la poupée conteneur n'est pas ouverte.");

        }
        System.out.println("La poupée a été sortie de la poupée conteneur.");
    }





}