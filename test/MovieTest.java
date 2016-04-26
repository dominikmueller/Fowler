import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dominik on 26.04.16.
 */
public class MovieTest {

    private Movie m1;
    private String m1Name = "childmovie";
    private int m1PriceCode = 0;
    private Movie m2;
    private String m2Name = "newreleasemovie";
    private int m2PriceCode = 1;
    private Movie m3;
    private String m3Name = "regularmovie";
    private int m3PriceCode = 2;

    @Before
    public void initialize() {
        m1 = new Movie(m1Name, m1PriceCode);
        m2 = new Movie(m2Name, m2PriceCode);
        m3 = new Movie(m3Name, m3PriceCode);
    }

    @Test
    public void testGetPriceCode() throws Exception {
        assertEquals("getPriceCode returns false value for childmovie", m1.getPriceCode(), m1PriceCode);
        assertEquals("getPriceCode returns false value for newreleasemovie", m2.getPriceCode(), m2PriceCode);
        assertEquals("getPriceCode returns false value for regularmovie", m3.getPriceCode(), m3PriceCode);
    }

    @Test
    public void testSetPriceCode() throws Exception {
        int newPriceCode = 2;
        m1.setPriceCode(newPriceCode);
        assertEquals("the set PriceCode does not match the returned price", m1.getPriceCode(), newPriceCode);

    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals("returned movie title does not match expected movie title", m1.getTitle(), m1Name);
        assertEquals("returned movie title does not match expected movie title", m2.getTitle(), m2Name);
        assertEquals("returned movie title does not match expected movie title", m3.getTitle(), m3Name);
    }

}