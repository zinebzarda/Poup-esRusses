abstract class Poupee {
private int taille;
private boolean ouvert;

abstract void ouvrir();

abstract void fermer();

abstract void placerDans(Poupee p);
abstract void sortirDe(Poupee p);

// ----- Constructor Parameters---
public Poupee(int taille,boolean ouvert){
    this.taille=taille;
    this.ouvert = ouvert;
}
// ------- getters-----
public int getTaille(){
    return taille;
}
public boolean getouvert(){
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
