import java.util.function.Function;

public class Movie {
    public enum Type {
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

        Type(Function<Integer, Double> price) {
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