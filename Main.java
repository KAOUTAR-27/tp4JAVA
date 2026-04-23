package EX10;

public class Main {
    public static void main(String[] args) {

        Livre livre = new Livre(1, "Java POO", "Auteur A");
        Magazine magazine = new Magazine(2, "Tech Mag", "Auteur B");
        SupportNumerique sn = new SupportNumerique(3, "E-book AI", "Auteur C");

       
        livre.afficherInformations();
        livre.emprunter();
        livre.consulter();
        livre.reserver();

        System.out.println("----------------");

     
        magazine.afficherInformations();
        magazine.consulter();

        System.out.println("----------------");

     
        sn.afficherInformations();
        sn.consulter();
        sn.reserver();
    }
}
