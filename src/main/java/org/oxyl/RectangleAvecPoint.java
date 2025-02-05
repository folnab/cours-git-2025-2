package org.oxyl;

public class RectangleAvecPoint extends AUnCentre {
    private Point centre;
    private double longueur;
    private double largeur;
    private double angle;

    public RectangleAvecPoint(Point centre, double longueur, double largeur, double angle) {
        super(centre);
        setLongueur(longueur);
        setLargeur(largeur);
        this.angle = angle;
    }

    public RectangleAvecPoint() {
        super();
        setLargeur(1.);
        setLongueur(1.);
    }

    public RectangleAvecPoint(RectangleAvecPoint other) {
        this(other.centre, other.longueur, other.largeur, other.angle);
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur >= 0. ? longueur : 0.;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur >= 0. ? largeur : 0.;
    }

    public boolean isCarre() {
        return longueur == largeur;
    }

    public void redimensionner(double f) {
        setLongueur(longueur * f);
        setLargeur(largeur * f);
    }

    public void tourner(double theta) {
        angle += theta;
    }
}
