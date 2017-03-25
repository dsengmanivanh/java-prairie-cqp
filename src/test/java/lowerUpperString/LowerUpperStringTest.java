package lowerUpperString;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LowerUpperStringTest {

    @Test
    public void toAlternativeString_with_letters() {
        //set
        LowerUpperString lowerUpperString = new LowerUpperString();
        //test
        String result = lowerUpperString.toAlternativeString("altERnaTIng cAsE <=> ALTerNAtiNG CaSe");
        //assert
        assertEquals("ALTerNAtiNG CaSe <=> altERnaTIng cAsE", result);
    }

    @Test
    public void toAlternativeString_with_letter_empty(){
        //set
        LowerUpperString lowerUpperString = new LowerUpperString();
        //test
        String result = lowerUpperString.toAlternativeString("");
        //assert
        assertEquals("", result);
    }

    @Test
    public void toAlternativeString_without_letter(){
        //set
        LowerUpperString lowerUpperString = new LowerUpperString();
        //test
        String result = lowerUpperString.toAlternativeString(null);
        //assert
        assertEquals("", result);
    }
}