package quickselect;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinKElementTest {

    @Test
    void getMinKElement() {
        int[] ints = {1, 2, 4, 1, 3};
        MinKElement minKElement = new MinKElement();
        int res = minKElement.getMinKElement(ints, 2);
        Assertions.assertEquals(1, res);
    }
}