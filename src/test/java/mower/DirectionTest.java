package mower;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DirectionTest {

    @Test
    public void get_direction_on_north() {
        //set
        //test
        Direction result = Direction.get("N");
        //assert
        assertEquals(Direction.NORTH, result);
    }

    @Test
    public void get_direction_on_south() {
        //set
        //test
        Direction result = Direction.get("S");
        //assert
        assertEquals(Direction.SOUTH, result);
    }

    @Test
    public void get_direction_on_east() {
        //set
        //test
        Direction result = Direction.get("E");
        //assert
        assertEquals(Direction.EAST, result);
    }

    @Test
    public void get_direction_on_west() {
        //set
        //test
        Direction result = Direction.get("");
        //assert
        assertEquals(Direction.WEST, result);
    }
}