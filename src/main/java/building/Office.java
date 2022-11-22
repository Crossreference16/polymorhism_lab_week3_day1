package building;

public class Office extends Building {

    protected String companyName;
    protected int rentPerMonth;
    protected int numberOfEmployees;

    public Office (String companyName, int rentPerMonth, int numberOfEmployees, int numberOfRooms, int dateOfConstruction,  boolean centralHeating, int numberOfFloors){
        super(numberOfRooms, dateOfConstruction, centralHeating, numberOfFloors);
        this.companyName = companyName;
        this.rentPerMonth = rentPerMonth;
        this.numberOfEmployees = numberOfEmployees;

    }

    //Getters and Setters:
    // public String getCompanyName(){
    //   return companyName;
    //}

    //public void setCompanyName(){
    //    this.companyName = companyName;
    //}

    //public int getRentPerMonth(){
    //    return rentPerMonth;
    //}

    //public void setRentPerMonth(){
    //    this.rentPerMonth = rentPerMonth;
    //}

    //public int getNumberOfEmployees() {
    //    return numberOfEmployees;
    //}

    //public void setNumberOfEmployees(){
    //    this.numberOfEmployees = numberOfEmployees;
    //}





}