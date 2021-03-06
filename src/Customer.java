
import java.lang.*;
import java.util.*;

class Customer {
    private final String name;
    private final Vector<Rental> rentals = new Vector<>();

    public Customer (String name){
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }
    public String getName (){
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        final int BONUS_POINT_THRESHOLD = 1;

        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        for (Rental each : rentals) {
            double price = each.price();
            frequentRenterPoints ++;

            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.Type.NEW_RELEASE) && each.getDaysRented().days > BONUS_POINT_THRESHOLD)
                frequentRenterPoints ++;

            //show figures for this rental
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append("\t").append(each.getDaysRented()).append("\t").append(price).append("\n");
            totalAmount += price;
        }
        //add footer lines
        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append("\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(" frequent renter points");
        return result.toString();
    }

}
    