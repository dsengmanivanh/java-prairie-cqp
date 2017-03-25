package libraryPartTwo.model;


public class Book {

    private String title;
    private int pages;
    private int shippingDay;

    public Book(String title, int pages, int shippingDay) {
        this.title = title;
        this.pages = pages;
        this.shippingDay = shippingDay;
    }

    public int getShippingDay() {
        return shippingDay;
    }

    public void setShippingDay(int shippingDay) {
        this.shippingDay = shippingDay;
    }

}
