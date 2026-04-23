package EX1;

public class Etudiant extends Personne {

   
    private String niveauEtude;
    private double moyenne;

   
    public Etudiant(String nom, String prenom, int age,
                    String niveauEtude, double moyenne) {
        super(nom, prenom, age); 
        this.niveauEtude = niveauEtude;
        this.moyenne = moyenne;
    }

    
    public String calculerMention() {
        if (moyenne >= 16) {
            return "Très bien";
        } else if (moyenne >= 14) {
            return "Bien";
        } else if (moyenne >= 12) {
            return "Assez bien";
        } else if (moyenne >= 10) {
            return "Passable";
        } else {
            return "Ajourné";
        }
    }

  
    public boolean estAdmis() {
        return moyenne >= 10;
    }

   
    public void afficherProfil() {
        System.out.println("=== Profil Étudiant ===");
        afficherInformations(); // méthode héritée
        System.out.println("Niveau : " + niveauEtude);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Mention : " + calculerMention());
        System.out.println("Admis : " + (estAdmis() ? "Oui" : "Non"));
    }
}
