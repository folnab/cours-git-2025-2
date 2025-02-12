package org.oxyl;

public abstract class AUnCentre implements Figure{
    private Point centre;

    public AUnCentre(Point centre){
        this.centre=centre;
    }
    //ça a un centre

    public void deplacer(double distanceX, double distanceY) {
        this.centre.deplacer(distanceX, distanceY);
    }

    public boolean isAuCentre(){
        return this.centre.equals(new Point());
    }

}
