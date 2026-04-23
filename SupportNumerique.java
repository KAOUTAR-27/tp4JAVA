package EX10;

class SupportNumerique extends Document implements Empruntable, Consultable {

    public SupportNumerique(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

   
    public int calculerDureeEmpruntMax() {
        return 14; 
    }

  
    public boolean estDisponible() {
        return disponible;
    }

   
    public void reserver() {
        System.out.println("Support numérique réservé.");
    }

   
    public void consulter() {
        System.out.println("Consultation en ligne.");
    }
}

