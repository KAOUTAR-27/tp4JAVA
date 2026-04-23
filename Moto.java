package EX9;

class Moto extends Vehicule {

    private String type;

    public Moto(String type) {
        this.type = type;
    }

   
    public void demarrer() {
        System.out.println("La moto démarre avec un bruit puissant.");
    }

  
    public void faireRoueArriere() {
        System.out.println("La moto fait une roue arrière !");
    }

    public void afficherTypeMoto() {
        System.out.println("Type de moto : " + type);
    }
}

