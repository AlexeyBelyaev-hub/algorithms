package sum.threesumsmaller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumSmallerTest {

    @Test
    void threeSumSmaller() {
        int[] ints = {-2, 0, 1, 3};
        ThreeSumSmaller threeSumSmaller = new ThreeSumSmaller();
        int res = threeSumSmaller.threeSumSmaller(ints, 2);
        Assertions.assertEquals(2, res);

    }
}