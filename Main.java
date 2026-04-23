package EX1;

public class Main {
    public static void main(String[] args) {

        Etudiant etu = new Etudiant(
                "BENOUAHI",
                "Kaoutar",
                20,
                "lICENCE",
                16
        );

        System.out.println(etu.sePresenter());
        System.out.println("Majeur : " + etu.estMajeur());

        etu.afficherProfil();
    }
}

