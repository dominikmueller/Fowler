/**
 * Created by dominik on 28.04.16.
 */
public class RegularPrice extends Price {
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented) {
        if (daysRented > 2) return (daysRented - 2 ) * 1.5;
        else return 2;
    }
}
