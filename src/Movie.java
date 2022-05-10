import java.util.function.Function;

public class Movie {
    public enum Code {
        CHILDREN(daysRented -> {
            double amount = 1.5;
            if (daysRented > 3)
                amount += (daysRented - 3) * 1.5;
            return amount;
        }),
        REGULAR(daysRented -> {
            double amount = 2;
            if (daysRented > 2)
                amount += (daysRented - 2) * 1.5;
            return amount;
        }),
        NEW_RELEASE(daysRented ->
                daysRented * 3.0);

        private final Function<Integer, Double> price;

        public double getPrice(int daysRented) {
            return price.apply(daysRented);
        }

        Code(Function<Integer, Double> price) {
            this.price = price;
        }
    }

    private final String title;
    private final Code priceCode;
    public Movie(String title, Code priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }
    public Code getPriceCode() {
        return priceCode;
    }
    public String getTitle (){
        return title;
    }
}