package Building;

public class School extends Building {
    protected String typeOfSchool;
    protected int numberOfPupils;
    protected boolean hasSixthForm;

    public School(String typeOfSchool, int numberOfPupils, boolean hasSixthForm, int numberOfRooms, int dateOfConstruction,  boolean centralHeating, int numberOfFloors){
        super(numberOfRooms, dateOfConstruction, centralHeating, numberOfFloors);
        this.typeOfSchool = typeOfSchool;
        this.numberOfPupils = numberOfPupils;
        this.hasSixthForm = hasSixthForm;


    }


    //Getters and Setters:
    //public String getTypeOfSchool() {
    //    return typeOfSchool;
    //}

    //public void setTypeOfSchool(String typeOfSchool) {
    //    this.typeOfSchool = typeOfSchool;
    //}

    //public int getNumberOfPupils() {
    //    return numberOfPupils;
    //}

    //public void setNumberOfPupils(int numberOfPupils) {
    //    this.numberOfPupils = numberOfPupils;
    //}

    //public boolean isHasSixthForm() {
    //    return hasSixthForm;
    //}

    //public void setHasSixthForm(Boolean hasSixthForm) {
    //    this.hasSixthForm = hasSixthForm;
    //}




}
