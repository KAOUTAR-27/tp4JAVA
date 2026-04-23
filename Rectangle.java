package EX7;

class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerSurface() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    @Override
    public boolean validerDimensions() {
        return longueur > 0 && largeur > 0;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis un rectangle.");
    }
}
