package queue.removeKdigits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveKDigitsTest {


    @Test
    void removeKdigitsExample1() {
        // given
        String num = "1432219";
        int k = 3;
        String expected =  "1219";

        //when
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String res = removeKDigits.removeKdigits(num, k);

        //assert
        Assertions.assertEquals(expected, res);
    }

    @Test
    void removeKdigitsExample2() {
        // given
        String num = "10200";
        int k = 1;
        String expected =  "200";

        //when
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String res = removeKDigits.removeKdigits(num, k);

        //assert
        Assertions.assertEquals(expected, res);
    }

    @Test
    void removeKdigitsExample3() {
        // given
        String num = "10";
        int k = 2;
        String expected =  "0";

        //when
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String res = removeKDigits.removeKdigits(num, k);

        //assert
        Assertions.assertEquals(expected, res);
    }


    @Test
    void removeKdigitsExample4() {
        // given
        String num = "10";
        int k = 1;
        String expected =  "0";

        //when
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String res = removeKDigits.removeKdigits(num, k);

        //assert
        Assertions.assertEquals(expected, res);
    }

    @Test
    void removeKdigitsExample5() {
        // given
        String num = "112";
        int k = 1;
        String expected =  "11";

        //when
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String res = removeKDigits.removeKdigits(num, k);

        //assert
        Assertions.assertEquals(expected, res);
    }

    @Test
    void removeKdigitsExample6() {
        // given
        String num = "10001";
        int k = 4;
        String expected =  "0";

        //when
        RemoveKDigits removeKDigits = new RemoveKDigits();
        String res = removeKDigits.removeKdigits(num, k);

        //assert
        Assertions.assertEquals(expected, res);
    }
}