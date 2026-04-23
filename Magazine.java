package EX10;

class Magazine extends Document implements Consultable {

    public Magazine(int id, String titre, String auteur) {
        super(id, titre, auteur);
    }

   
    public int calculerDureeEmpruntMax() {
        return 7; 

    }
    public void consulter() {
        System.out.println("Consultation du magazine.");
    }
}
