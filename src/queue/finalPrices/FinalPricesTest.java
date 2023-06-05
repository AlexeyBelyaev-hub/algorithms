package queue.finalPrices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalPricesTest {

    @Test
    void finalPrices() {
        int [] prices = new int[]{8,4,6,2,3};
        FinalPrices finalPrices = new FinalPrices();
        int[] res = finalPrices.finalPrices(prices);
        Assertions.assertEquals(4,res[0]);
        Assertions.assertEquals(2,res[1]);
        Assertions.assertEquals(4,res[2]);
        Assertions.assertEquals(2,res[3]);
        Assertions.assertEquals(3,res[4]);
    }
}