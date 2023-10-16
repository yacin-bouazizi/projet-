public class livre {
    private int id;
    private String titre;
    private String auteur;
    private double prix;

    public livre (int id, String titre, String auteur, double prix) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id ;
    }
    public String gettitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix (double prix) {
        this.prix = prix;
    }

    public static void main (String[] Args) {
        livre l1= new livre(15,"ali","baccari",568);
        livre l2= new livre(11,"mi","emma",888);
        l1.toostring();
        l2.toostring();
        System.out.println("auteur est"+l1.getAuteur());
        l1.setAuteur("mohsen");
        System.out.println("le nouveaux auteur est"+l1.getAuteur());
    }

    public void toostring(){
        System.out.println(id+"/"+titre +"/"+auteur+"/"+prix);
    }}