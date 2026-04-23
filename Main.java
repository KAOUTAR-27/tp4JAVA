package EX8;

public class Main {
    public static void main(String[] args) {

        Oiseau oiseau = new Oiseau();
        Avion avion = new Avion();

        
        oiseau.voler();
        oiseau.changerAltitude(100);
        oiseau.migrer();
        oiseau.construireNid();
        oiseau.atterrir();

        System.out.println("------------------");

       
        avion.embarquerPassagers(150);
        avion.voler();
        avion.changerAltitude(10000);
        avion.afficherAltitude();
        avion.atterrir();
    }
}
