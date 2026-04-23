package EX9;

public class Main {
    public static void main(String[] args) {

        VoitureElectrique voiture = new VoitureElectrique();
        Moto moto = new Moto("Sport");

        voiture.demarrer();
        voiture.accelerer(50);
        voiture.verifierBatterie();
        voiture.afficherAutonomie();
        voiture.optimiserConsommation();
        voiture.charger();

        System.out.println("------------------");

        moto.demarrer();
        moto.accelerer(80);
        moto.faireRoueArriere();
        moto.afficherTypeMoto();
        moto.freiner(30);
    }
}

