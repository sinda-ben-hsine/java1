public class point {
    private String nom;
    private int abscisse;
    private int ordonnée;
}

    public point(String nom, int a, int o) {
        nom = nom;
        abscisse = a;
        ordonnée = o;
    }

    public point(string nom) {
        nom = nom;
        abscisse = 0;
        ordonnée = 0;

    }

    public point(int a, int o) {
        abscisse = a;
        ordonnée = o;

    }

public void affiche(){
    System.out.println(nom+"("+abscisse+","+ordonnée+")");
}
