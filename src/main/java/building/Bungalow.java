package building;

public class Bungalow extends Building {
    protected boolean petsAllowed;
    protected int occupants;
    protected boolean hasGarage;

    public Bungalow(boolean petsAllowed, int occupants, boolean hasGarage, int numberOfRooms, int dateOfConstruction, Boolean centralHeating, int numberOfFloors){
        super(numberOfRooms, dateOfConstruction, centralHeating, numberOfFloors);
        this.petsAllowed = petsAllowed;
        this.occupants = occupants;
        this.hasGarage = hasGarage;
    }


    //Getters and Setters:
    // public boolean isPetsAllowed(){
    //    return petsAllowed;
    //}

    //public void setPetsAllowed(){
    //    this.petsAllowed = petsAllowed;
    //}

    //public int getOccupants(){
    //    return occupants;
    //}

    //public void setOccupants(){
    //    this.occupants = occupants;
    //}

    //public boolean isHasGarage(){
    //    return hasGarage;
    //}

    //public void setHasGarage (){
    //    this.hasGarage = hasGarage;
    //}




}
