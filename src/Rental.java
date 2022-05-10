class Rental {
    public static class RentalDays {
        public final int days;

        public RentalDays(int days) throws IllegalArgumentException {
            if(days < 0) throw new IllegalArgumentException("Rental Days may not be negative");
            this.days = days;
        }

        @Override
        public String toString() {
            return "" + days;
        }
    }

    private final Movie movie;
    private final RentalDays daysRented;
    public Rental(Movie movie, RentalDays daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }
    public RentalDays getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    public double price() {
        return getMovie().getPriceCode().getPrice(getDaysRented());
    }
}