import java.util.function.Function;

public class Movie {
    public enum Type {
        CHILDREN(daysRented -> {
            double amount = 1.5;
            if (daysRented.days > 3)
                amount += (daysRented.days - 3) * 1.5;
            return amount;
        }),
        REGULAR(daysRented -> {
            double amount = 2;
            if (daysRented.days > 2)
                amount += (daysRented.days - 2) * 1.5;
            return amount;
        }),
        NEW_RELEASE(daysRented ->
                daysRented.days * 3.0);

        private final Function<Rental.RentalDays, Double> price;

        public double getPrice(Rental.RentalDays daysRented) {
            return price.apply(daysRented);
        }

        Type(Function<Rental.RentalDays, Double> price) {
            this.price = price;
        }
    }

    private final String title;
    private final Type priceType;
    public Movie(String title, Type priceType) {
        this.title = title;
        this.priceType = priceType;
    }
    public Type getPriceCode() {
        return priceType;
    }
    public String getTitle (){
        return title;
    }
}