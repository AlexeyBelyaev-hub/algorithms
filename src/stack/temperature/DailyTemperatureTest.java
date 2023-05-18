package stack.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperatureTest {

    /**
     * Example 1:
     *
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     */
    @Test
    void dailyTemperatures() {
        int[] ints = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperature dailyTemperature = new DailyTemperature();
        int[] res = dailyTemperature.dailyTemperatures(ints);
        Assertions.assertTrue(Arrays.equals(res,new int[]{1,1,4,2,1,1,0,0}));

    }

    @Test
    void dailyTemperaturesStack() {
        int[] ints = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatureStack dailyTemperature = new DailyTemperatureStack();
        int[] res = dailyTemperature.dailyTemperatures(ints);
        Assertions.assertTrue(Arrays.equals(res,new int[]{1,1,4,2,1,1,0,0}));

    }

}