import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ujwala M on 13-12-2015.
 */

public class ArtiTestTest {

    @Test
    public void fooTest()
    {

        //Arrange
        Arti uut = new Arti();

        // Act
        String[] actual = uut.getall();

        //Assert
        assertEquals(3, actual.length);
    }
}