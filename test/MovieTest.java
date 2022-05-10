import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("Movie Title", Movie.Code.NEW_RELEASE);
    }

    @Test
    public void getPriceCode() {
        Assertions.assertEquals(Movie.Code.NEW_RELEASE, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Assertions.assertEquals("Movie Title", movie.getTitle());
    }
}
