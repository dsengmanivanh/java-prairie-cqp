package libraryPartTwo.model;


import java.util.Objects;

public class DVD extends CD {
    private Movie kind;
    private boolean threeD;

    public DVD(String title, int time, int shippingDay, Movie kind, boolean threeD) {
        super(title, time, shippingDay);
        this.kind = kind;
        this.threeD = threeD;
    }


    public Movie getKind() {
        return kind;
    }

    public boolean isThreeD() {
        return threeD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DVD dvd = (DVD) o;
        return threeD == dvd.threeD &&
                kind == dvd.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, threeD);
    }
}
