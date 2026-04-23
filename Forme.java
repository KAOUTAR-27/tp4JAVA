package EX7;

abstract class Forme {

  
    public abstract double calculerSurface();

   
    public abstract double calculerPerimetre();

    
    public abstract boolean validerDimensions();

    public void afficherDescription() {
        System.out.println("Je suis une forme géométrique.");
    }

  
    public int comparerSurface(Forme f) {
        if (this.calculerSurface() > f.calculerSurface()) {
            return 1;
        } else if (this.calculerSurface() < f.calculerSurface()) {
            return -1;
        } else {
            return 0;
        }
    }
}

