package building;

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

    public String announcement(int numberOfPupils) {
        return "This is the morning announcement. School has been cancelled tomorrow for all " + numberOfPupils + " students.";
    } //Method overload part-1.


    public String announcement(String lesson3, String lesson4) {
        return "This is the lunchtime announcement. " + lesson3 + " and " + lesson4 + " today have also been cancelled for Class 10A.";
    }  //Method overload part-2.


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
