package mower;


import java.util.Objects;

public class Lawn {

    private int xMax;

    private int yMax;

    public Lawn(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public int getyMax() {
        return yMax;
    }


    public int getxMax() {
        return xMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lawn lawn = (Lawn) o;
        return xMax == lawn.xMax &&
                yMax == lawn.yMax;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xMax, yMax);
    }
}
