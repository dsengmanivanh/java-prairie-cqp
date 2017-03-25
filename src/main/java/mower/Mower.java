package mower;


import java.util.Objects;

public class Mower {

    private int x;
    private int y;
    private Direction direction;

    public Mower(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public Mower forward(Lawn lawn) {
        if (Direction.NORTH == direction  && y < lawn.getyMax()) {
            return new Mower(x, y + 1, direction);
        }
        if (Direction.SOUTH == direction  && y > 0) {
            return new Mower(x, y - 1, direction);
        }
        if (Direction.EAST == direction  && x < lawn.getxMax()) {
            return new Mower(x + 1, y, direction);
        }
        if (Direction.WEST == direction && x > 0) {
            return new Mower(x - 1, y, direction);
        }
        return this;
    }

    public Mower onLeft() {
        if (Direction.NORTH == direction) {
            direction = Direction.WEST;
        } else if (Direction.SOUTH == direction) {
            direction = Direction.EAST;
        } else if (Direction.EAST == direction) {
            direction = Direction.NORTH;
        } else if ((Direction.WEST == direction)) {
            direction = Direction.SOUTH;
        }
        return new Mower(x, y, direction);
    }

    public Mower onRight() {
        if (Direction.NORTH == direction) {
            direction = Direction.EAST;
        } else if (Direction.SOUTH == direction) {
            direction = Direction.WEST;
        } else if (Direction.EAST == direction) {
            direction = Direction.SOUTH;
        } else if ((Direction.WEST == direction)) {
            direction = Direction.NORTH;
        }
        return new Mower(x, y, direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mower mower = (Mower) o;
        return x == mower.x &&
                y == mower.y &&
                direction == mower.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }
}
