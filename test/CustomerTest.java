import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dominik on 26.04.16.
 */
public class CustomerTest {

    private Customer c1;
    private String c1Name = "Max Mustermann";
    private Customer c2;
    private String c2Name = "Lena Musterfrau";
    private Movie m1;
    private String m1Name = "movie1";
    private Movie m2;
    private String m2Name = "movie2";
    private Rental r1;
    private Rental r2;

    @Before
    public void initialize() {
        m1 = new Movie(m1Name, 1);
        m2 = new Movie(m2Name, 2);
        r1 = new Rental(m1, 10);
        r2 = new Rental(m2, 5);
        c1 = new Customer(c1Name);
        c2 = new Customer(c2Name);
        c1.addRental(r1);
        c1.addRental(r2);
        c2.addRental(r2);
    }

    @Test
    public void testStatement() throws Exception {
        String expectedStatement = "Rental Record for " + c1Name + "\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\t" + m1Name + "\t\t10\t30.0\n" +
                "\t" + m2Name + "\t\t5\t4.5\n" +
                "Amount owed is 34.5\n" +
                "You earned 3 frequent renter points";
        assertEquals("statement output is not correct!", c1.statement(), expectedStatement);
    }
}