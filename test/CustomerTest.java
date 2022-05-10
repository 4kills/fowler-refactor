import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    private Customer customer;
    private static final String NAME = "Dominik";

    @BeforeEach
    public void setUp() {
        customer = new Customer(NAME);
    }

    @Test
    public void statement() {
        String expected = "Rental Record for " + NAME + "\n";
        expected += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        expected += "Amount owed is " + "0.0" + "\n";
        expected += "You earned " + "0" + " frequent renter points";
        Assertions.assertEquals(expected, customer.statement());
    }

    @Test
    public void getName() {
        Assertions.assertEquals(NAME, customer.getName());
    }
}
