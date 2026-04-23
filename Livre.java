package EX10;

class Livre extends Document implements Empruntable, Consultable {

    public Livre(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

   
    public int calculerDureeEmpruntMax() {
        return 21; 
    }

   
    public boolean estDisponible() {
        return disponible;
    }

    public void reserver() {
        if (disponible) {
            System.out.println("Livre réservé.");
        } else {
            System.out.println("Livre déjà emprunté.");
        }
    }

   
    public void consulter() {
        System.out.println("Lecture du livre sur place.");
    }
}
