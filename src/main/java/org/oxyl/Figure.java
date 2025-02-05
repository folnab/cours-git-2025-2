package org.oxyl;

public interface Figure {
    //deplacer une figure
    void deplacer(double distanceX, double distanceY);
    default void tourner(double thetaDegrees){

    }
}
