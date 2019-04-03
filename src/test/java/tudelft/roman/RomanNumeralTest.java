package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        //RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        //RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VVVV");
        Assertions.assertEquals(25, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        //RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        //RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XXX");
        Assertions.assertEquals(30, result);
    }
}
