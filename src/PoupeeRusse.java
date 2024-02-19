import java.util.*;

class PoupeeRusse extends Poupee {
    private String Nom;
    private PoupeeRusse PR ;
    public PoupeeRusse(String Nom ,int taille ){
        super(taille);
        this.Nom=Nom;
    }

    private static String[] poupees = new String[3];
    static Scanner scanner = new Scanner(System.in);



    public String getNom(){
        return Nom;
}
public void setNom(String Nom){
        this.Nom=Nom;
}
//@Override
//    public void AjouterPoupee() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entrez le nom de la poupée : ");
//        String nv_nom = scanner.nextLine();
//        this.setNom(nv_nom);
//        System.out.println("Entrez la taille de la poupée : ");
//        int nv_Taille = scanner.nextInt();
//        this.setTaille(nv_Taille);
//    }

//    public void AffivherPoupee() {
//        System.out.println("|Nom: "+this.getNom());
//        System.out.println("|Taille: "+this.getTaille());
//    }

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
    public void placerDans(Poupee p) {
        PoupeeRusse poup = (PoupeeRusse) p;
        if (p.isouvert() && this.getTaille() < poup.getTaille()) {
                System.out.println("La poupée russe de taille " + this.getTaille() + " est placée dans une autre poupée de taille " + poup.getTaille());
                this.PR = poup;
            } else {
                System.out.println("Impossible de placer la poupée russe de taille " + this.getTaille() + " dans une poupée de taille " + poup.getTaille() + ".");
            }
    }


    @Override
    public void sortirDe(Poupee p) {
        if (p.isouvert() && this.PR == p) {
            PoupeeRusse poup = (PoupeeRusse) p;
            System.out.println("La poupée russe de taille " + this.getTaille() + " est sortie de la poupée de taille " + poup.getTaille());
            this.PR = null;
        } else {
            System.out.println("La poupée russe n'est pas contenue dans la poupée spécifiée.");
        }
    }

    // -----------------------Ajouter poupee ------------------
    public void ajouterPoupees() {

        System.out.println("Entrez le nom de la poupée:");
        String Nom = scanner.nextLine();
        System.out.println("Entrez la taille de la poupée :");
        int taille = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Poupées ajoutées avec succès !");
    }


    public String afficherPoupees() {{
            return "Poupée russe : Nom=" + Nom + ", Taille=" + super.getTaille();
        }
    }

}