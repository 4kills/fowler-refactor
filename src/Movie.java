public class Movie {
    public enum Code {
        CHILDREN,
        REGULAR,
        NEW_RELEASE
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
    };
}