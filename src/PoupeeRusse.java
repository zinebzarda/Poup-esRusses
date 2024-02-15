class PoupeeRusse extends Poupee {
    private Poupee poupee;
    public PoupeeRusse(int taille ) {
        super(taille);
        poupee = null;
    }

    public Poupee getPoupee() {
        return poupee;
    }

    public void setPoupee(Poupee poupee) {
        this.poupee = poupee;
    }

    @Override
    public void ouvrir() {
        if (!isouvert()){
            setOuvert(true);
            System.out.println("is open");
        }else {
            System.out.println("is already open");
        }
    }

    @Override
    public void fermer() {
        if (isouvert()){
            setOuvert(false);
            System.out.println("is close");
        }else {
            System.out.println("is already close");
        }
    }

    @Override
    void placerDans(Poupee p) {
        if (p.getTaille() > this.getTaille()){
            System.out.println("the first is big");
        }
        else if(!p.isouvert()) {
            System.out.println("is close");
        }
        else {
            setPoupee(p);
        }

    }

    @Override
    void sortirDe(Poupee p) {

    }




}