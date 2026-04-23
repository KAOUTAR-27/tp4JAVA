package EX10;

abstract class Document {

    protected int identifiant;
    protected String titre;
    protected String auteur;
    protected boolean disponible;

    public Document(int identifiant, String titre, String auteur) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

  
    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Document emprunté.");
        } else {
            System.out.println("Document non disponible.");
        }
    }

 
    public void retourner() {
        disponible = true;
        System.out.println("Document retourné.");
    }

   
    public void afficherInformations() {
        System.out.println("ID : " + identifiant);
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Disponible : " + disponible);
    }

    public abstract int calculerDureeEmpruntMax();
}
