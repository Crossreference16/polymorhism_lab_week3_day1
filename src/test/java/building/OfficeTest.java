package building;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfficeTest {

    public Office office;

    @BeforeEach
    public void setUp(){
        office = new Office("JavaBeans", 120000, 5000,  1000,20_10_1922, true, 25);
    }

    @Test
    public void company(){
        String expected = "JavaBeans";
        String actual = office.companyName;
        assertEquals(actual, expected);
    }

    @Test
    public void monthlyRent(){
        int expected = 120000;
        int actual = office.rentPerMonth;
        assertEquals(actual, expected);
    }

    @Test
    public void totalWorkers(){
        int expected = 5000;
        int actual = office.numberOfEmployees;
        assertEquals(actual, expected);
    }



}

