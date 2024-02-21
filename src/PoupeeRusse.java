
class PoupeeRusse extends Poupee {
    private String Nom;
    private PoupeeRusse PR ;
    public PoupeeRusse(String Nom ,int taille ){
        super(taille);
        this.Nom=Nom;
    }




    public String getNom(){
        return Nom;
}
public void setNom(String Nom){
        this.Nom=Nom;
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
            System.out.println("La poupée "+this.getNom()+" a été fermer avec succes.");
        } else {
            System.out.println("La poupée "+this.getNom()+" est déja fermer.");
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
    public void afficherPoupees() {{
            System.out.print("Nom=" + this.getNom()+ ", Taille=" +this.getTaille()+"\n");
        }
    }

}