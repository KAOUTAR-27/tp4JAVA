package EX8;

class Oiseau implements Volant {

    private double altitude;

    @Override
    public void voler() {
        System.out.println("L'oiseau vole avec ses ailes.");
    }

    @Override
    public void atterrir() {
        System.out.println("L'oiseau atterrit doucement.");
        altitude = 0;
    }

    @Override
    public void changerAltitude(double altitude) {
        this.altitude = altitude;
        System.out.println("Nouvelle altitude de l'oiseau : " + altitude);
    }

    // Méthodes spécifiques
    public void migrer() {
        System.out.println("L'oiseau migre vers une région chaude.");
    }

    public void construireNid() {
        System.out.println("L'oiseau construit son nid.");
    }
}

