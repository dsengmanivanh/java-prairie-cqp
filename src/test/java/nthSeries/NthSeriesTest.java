package nthSeries;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NthSeriesTest {


    @Test
    public void seriesSum_with_zero(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(0);
        //assert
        assertEquals("0.00", result);
    }

    @Test
    public void seriesSum_with_one(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(1);
        //assert
        assertEquals("1.00", result);
    }

    @Test
    public void seriesSum_with_two(){
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(2);
        //assert
        assertEquals("1.25", result);
    }

    @Test
    public void seriesSum_with_five() {
        //set
        NthSeries nthSeries = new NthSeries();
        //test
        String result = nthSeries.seriesSum(5);
        //assert
        assertEquals("1.57", result);
    }

}