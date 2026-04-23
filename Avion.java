package EX8;

class Avion implements Volant {

    private double altitude;
    private int nombrePassagers;

  
    public void voler() {
        System.out.println("L'avion vole grâce à ses moteurs.");
    }

   
    public void atterrir() {
        System.out.println("L'avion atterrit sur la piste.");
        altitude = 0;
    }

   
    public void changerAltitude(double altitude) {
        this.altitude = altitude;
        System.out.println("Nouvelle altitude de l'avion : " + altitude);
    }

    
    public void embarquerPassagers(int nombre) {
        this.nombrePassagers = nombre;
        System.out.println(nombre + " passagers embarqués.");
    }

    public void afficherAltitude() {
        System.out.println("Altitude actuelle : " + altitude);
    }
}

