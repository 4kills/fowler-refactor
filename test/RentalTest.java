import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RentalTest {
    private Rental rental;
    private Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("Movie Title", Movie.Code.REGULAR);
        rental = new Rental(movie, 8);
    }

    @Test
    public void getMovie() {
        Assertions.assertEquals(movie, rental.getMovie());
    }

    @Test
    public void getDaysRented() {
        Assertions.assertEquals(8, rental.getDaysRented());
    }
}
