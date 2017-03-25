package libraryPartTwo.model;


public class CD {

    protected String title;
    protected int time;
    protected int shippingDay;

    public CD(String title, int time, int shippingDay) {
        this.title = title;
        this.time = time;
        this.shippingDay = shippingDay;
    }

    public String getTitle() {
        return title;
    }

    public int getShippingDay() {
        return shippingDay;
    }

    public void setShippingDay(int shippingDay) {
        this.shippingDay = shippingDay;
    }
}
