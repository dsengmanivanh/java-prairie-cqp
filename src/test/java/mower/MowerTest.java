package mower;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MowerTest {

    @Test
    public void mower_forward_on_north() {
        //set
        int x = 0;
        int y = 0;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(0, result.getX());
        assertEquals(1, result.getY());
        assertEquals(Direction.NORTH, result.getDirection());
    }

    @Test
    public void mower_forward_on_south(){
        //set
        int x = 0;
        int y = 1;
        Direction south = Direction.SOUTH;
        Mower mower = new Mower(x, y, south);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.SOUTH, result.getDirection());
    }

    @Test
    public void mower_forward_on_east(){
        //set
        int x = 0;
        int y = 0;
        Direction east = Direction.EAST;
        Mower mower = new Mower(x, y, east);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(1, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.EAST, result.getDirection());
    }

    @Test
    public void mower_forward_on_west(){
        //set
        int x = 1;
        int y = 0;
        Direction west = Direction.WEST;
        Mower mower = new Mower(x, y, west);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.WEST, result.getDirection());
    }

    @Test
    public void mower_forward_without_direction(){
        //set
        int x = 0;
        int y = 0;
        Mower mower = new Mower(x, y, null);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(null, result.getDirection());
    }

    @Test
    public void mower_forward_on_north_outside_lawn(){
        //set
        int x = 5;
        int y = 5;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(5, result.getX());
        assertEquals(5, result.getY());
        assertEquals(Direction.NORTH, result.getDirection());
    }

    @Test
    public void mower_forward_on_south_outside_lawn(){
        //set
        int x = 0;
        int y = 0;
        Direction south = Direction.SOUTH;
        Mower mower = new Mower(x, y, south);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.SOUTH, result.getDirection());
    }

    @Test
    public void mower_forward_on_west_outside_lawn(){
        //set
        int x = 0;
        int y = 0;
        Direction west = Direction.WEST;
        Mower mower = new Mower(x, y, west);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.WEST, result.getDirection());
    }

    @Test
    public void mower_forward_on_east_outside_lawn(){
        //set
        int x = 5;
        int y = 5;
        Direction east = Direction.EAST;
        Mower mower = new Mower(x, y, east);
        Lawn lawn = new Lawn(5, 5);
        //test
        Mower result = mower.forward(lawn);
        //assert
        assertEquals(5, result.getX());
        assertEquals(5, result.getY());
        assertEquals(Direction.EAST, result.getDirection());
    }

    @Test
    public void mower_onLeft_with_north() {
        //set
        int x = 0;
        int y = 0;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        //test
        Mower result = mower.onLeft();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.WEST, result.getDirection());
    }

    @Test
    public void mower_onLeft_with_south() {
        //set
        int x = 0;
        int y = 0;
        Direction south = Direction.SOUTH;
        Mower mower = new Mower(x, y, south);
        //test
        Mower result = mower.onLeft();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.EAST, result.getDirection());
    }

    @Test
    public void mower_onLeft_with_east() {
        //set
        int x = 0;
        int y = 0;
        Direction east = Direction.EAST;
        Mower mower = new Mower(x, y, east);
        //test
        Mower result = mower.onLeft();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.NORTH, result.getDirection());
    }

    @Test
    public void mower_onLeft_with_west() {
        //set
        int x = 0;
        int y = 0;
        Direction west = Direction.WEST;
        Mower mower = new Mower(x, y, west);
        //test
        Mower result = mower.onLeft();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.SOUTH, result.getDirection());
    }

    @Test
    public void mower_onRight_with_north() {
        //set
        int x = 0;
        int y = 0;
        Direction north = Direction.NORTH;
        Mower mower = new Mower(x, y, north);
        //test
        Mower result = mower.onRight();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.EAST, result.getDirection());
    }

    @Test
    public void mower_onRight_with_south() {
        //set
        int x = 0;
        int y = 0;
        Direction south = Direction.SOUTH;
        Mower mower = new Mower(x, y, south);
        //test
        Mower result = mower.onRight();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.WEST, result.getDirection());
    }

    @Test
    public void mower_onRight_with_east() {
        //set
        int x = 0;
        int y = 0;
        Direction east = Direction.EAST;
        Mower mower = new Mower(x, y, east);
        //test
        Mower result = mower.onRight();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.SOUTH, result.getDirection());
    }

    @Test
    public void mower_onRight_with_west() {
        //set
        int x = 0;
        int y = 0;
        Direction west = Direction.WEST;
        Mower mower = new Mower(x, y, west);
        //test
        Mower result = mower.onRight();
        //assert
        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(Direction.NORTH, result.getDirection());
    }

}
