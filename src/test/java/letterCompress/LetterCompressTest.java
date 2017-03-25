package letterCompress;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class LetterCompressTest {

    @Test
    public void letterCompress_with_repetition() {
        //set
        String letters = "aabcccccaaa";
        LetterCompress letterCompress = new LetterCompress();
        //test
        String result = letterCompress.apply(letters);
        //assert
        assertEquals("a5b1c5", result);
    }

    @Test
    public void letterCompress_with_letters_empty() {
        //set
        LetterCompress letterCompress = new LetterCompress();
        //test
        String result = letterCompress.apply("");
        //assert
        assertEquals("", result);
    }

    @Test
    public void letterCompress_without_letters() {
        //set
        LetterCompress letterCompress = new LetterCompress();
        //test
        String result = letterCompress.apply(null);
        //assert
        assertEquals("", result);
    }


}