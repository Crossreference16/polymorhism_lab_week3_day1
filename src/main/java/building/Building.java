package building;

public abstract class Building {

    protected int numberOfRooms;
    protected int dateOfConstruction;
    protected boolean centralHeating;
    protected int numberOfFloors;




    public Building(int numberOfRooms, int dateOfConstruction, boolean centralHeating, int numberOfFloors){
        this.numberOfRooms = numberOfRooms;
        this.dateOfConstruction = dateOfConstruction;
        this.centralHeating = centralHeating;
        this.numberOfFloors = numberOfFloors;

    }







    //Getters and Setters:
    //public int getNumberOfRooms(){
    //    return numberOfRooms;
    //}

//    public void setNumberOfRooms(int numberOfRooms){
//        this.numberOfRooms = numberOfRooms;
//    }
//
//    public int getDateOfConstruction(){
//        return dateOfConstruction;
//    }
//
//    public void setDateOfConstruction(int dateOfConstruction){
//        this.dateOfConstruction = dateOfConstruction;
//    }
//
//    public boolean isCentralHeating(){
//        return centralHeating;
//    }
//
//    public void setCentralHeating(boolean centralHeating){
//        this.centralHeating = centralHeating;
//    }
//
//    public int getNumberOfFloors(){
//        return numberOfFloors;
//    }
//
//    public void setNumberOfFloors(int numberOfFloors){
//        this.numberOfFloors = numberOfFloors;
//    }




}
