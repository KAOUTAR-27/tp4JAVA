package EX9;

class VoitureElectrique extends Vehicule implements Electrique {

    private double batterie = 100; 

   
    public void demarrer() {
        System.out.println("La voiture électrique démarre silencieusement.");
    }

   
    public void charger() {
        batterie = 100;
        System.out.println("Batterie chargée à 100%.");
    }

  
    public void verifierBatterie() {
        System.out.println("Niveau de batterie : " + batterie + "%");
    }

    
    public void afficherAutonomie() {
        System.out.println("Autonomie estimée : " + (batterie * 3) + " km");
    }

    public void optimiserConsommation() {
        System.out.println("Mode éco activé.");
    }
}
