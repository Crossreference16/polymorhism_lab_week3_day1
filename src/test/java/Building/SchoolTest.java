package Building;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SchoolTest {

    private School school;


    @BeforeEach
    public void setUp() {
        school = new School("Performing Arts", 1200, true, 100, 20_10_1922, true, 5);
    }

    @Test
    public void typeOfSchool(){

        String expected = "Performing Arts";
        String actual = school.typeOfSchool;
        assertEquals(actual, expected);

    }

    @Test
    public void totalPupils(){
        int expected = 1200;
        int actual = school.numberOfPupils;
        assertEquals(actual, expected);
    }

    @Test
    public void sixthFormInSchool(){
        boolean expected = true;
        boolean actual = school.hasSixthForm;
        assertEquals(actual, expected);
    }



}
