public class Ex3 {
    public static class Rectangle {
    // Attributs
    private double largeur;
    private double longueur;

    // Constructeur
    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    // Méthode pour calculer le périmètre du rectangle
    public double perimetre() {
        return 2 * (largeur + longueur);
    }

    // Méthode pour calculer la diagonale du rectangle
    public double diagonale() {
        return Math.sqrt(largeur * largeur + longueur * longueur);
    }

    // Méthode pour doubler la longueur du rectangle
    public void doubler() {
        longueur *= 2;
    }
}

    public class TestRectangle {
        public static void main(String[] args) {
            // Création d'un rectangle avec largeur 5 et longueur 10
            Rectangle monRectangle = new Rectangle(5, 10);

            // Calcul et affichage du périmètre
            double perimetre = monRectangle.perimetre();
            System.out.println("Le périmètre du rectangle est : " + perimetre);

            // Calcul et affichage de la diagonale
            double diagonale = monRectangle.diagonale();
            System.out.println("La diagonale du rectangle est : " + diagonale);

            // Doubler la longueur
            monRectangle.doubler();

            // Afficher la nouvelle longueur
            System.out.println("La nouvelle longueur du rectangle est : " + monRectangle.longueur);
        }
    }
}
