import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    public void setUp() {
        movie = new Movie("Movie Title", 1);
    }

    @Test
    public void getPriceCode() {
        Assertions.assertEquals(1, movie.getPriceCode());
    }

    @Test
    public void getTitle() {
        Assertions.assertEquals("Movie Title", movie.getTitle());
    }
}
