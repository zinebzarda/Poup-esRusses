abstract class Poupee {
private int taille;
private boolean ouvert;

abstract void ouvrir();

abstract void fermer();

abstract void placerDans(Poupee p);
abstract void sortirDe(Poupee p);

// ----- Constructor Parameters---
public Poupee(int taille){
    this.taille=taille;
}
// ------- getters-----
public int getTaille(){
    return taille;
}
public boolean isouvert(){
    return ouvert;
}

// ------ setters-------
    public void setTaille(int taille){
    this.taille=taille;
    }
    public void setOuvert(boolean ouvert){
    this.ouvert=ouvert;
    }

}
