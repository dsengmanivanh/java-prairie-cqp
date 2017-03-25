package mower;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class MowerServiceTest {

    @Test(expected = FileNotFoundException.class)
    public void simulation_play_with_cmd_on_file_not_found() throws FileNotFoundException {
        //set
        String file = "cmdOther.txt";
        MowerService mowerService = new MowerService(file);
        //test
        mowerService.play();
    }

    @Test
    public void simulation_play_with_cmd_file_empty() throws FileNotFoundException {
        //set
        String file = "src/test/java/mower/cmdEmpty.txt";
        MowerService mowerService = new MowerService(file);
        //test
        ArrayList<Mower> results = mowerService.play();
        //assert
        assertEquals(0, results.size());
    }

    @Test
    public void simulation_play_with_cmd() throws FileNotFoundException {
        //set
        String file = "src/test/java/mower/cmd.txt";
        MowerService mowerService = new MowerService(file);
        //test
        ArrayList<Mower> results = mowerService.play();
        //assert
        Mower firstExpected = new Mower(1, 3, Direction.NORTH);
        Mower secondExpected = new Mower(5, 1, Direction.EAST);
        assertEquals(2, results.size());
        assertEquals(firstExpected, results.get(0));
        assertEquals(secondExpected, results.get(1));

    }

    @Test
    public void simulation_play_with_cmd_out_lawn() throws FileNotFoundException {
        //set
        String file = "src/test/java/mower/cmdOut.txt";
        MowerService mowerService = new MowerService(file);
        //test
        ArrayList<Mower> results = mowerService.play();
        //assert
        Mower mower = new Mower(0, 0, Direction.NORTH);
        assertEquals(results.get(0), mower);
    }
}
