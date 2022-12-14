package building;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BungalowTest {


    private Bungalow bungalow;

    @BeforeEach
    public void setUp() {
        bungalow = new Bungalow(false, 4, true, 4, 21_11_2002, true, 1);
    }

    @Test
    public void canAllowPets(){
        boolean expected = false;
        boolean actual = bungalow.petsAllowed;
        assertEquals(actual, expected);

    }

    @Test
    public void totalOccupants(){
       int expected = 4;
       int actual = bungalow.occupants;
        assertEquals(actual, expected);

    }

    @Test
    public void garageAtProperty(){
        boolean expected = true;
        boolean actual = bungalow.hasGarage;
        assertEquals(actual, expected);

    }

}
