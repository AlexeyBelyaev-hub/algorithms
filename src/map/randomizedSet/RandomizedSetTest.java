package map.randomizedSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RandomizedSetTest {

    /**
     ["RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom"]
     [[],[1], [2], [2], [],[1],[2], []]
     [null,true,false,true,1,true,false,2]
     */
    @Test
    public void testCase1(){


        RandomizedSet randomizedSet = new RandomizedSet();
        Assertions.assertTrue(randomizedSet.insert(1));
        Assertions.assertFalse(randomizedSet.remove(2));
        Assertions.assertTrue(randomizedSet.insert(2));
        int random1 = randomizedSet.getRandom();
        Assertions.assertTrue(random1 == 1 || random1 == 2);
        Assertions.assertTrue(randomizedSet.remove(1));
        Assertions.assertFalse(randomizedSet.insert(2));
        int random2 = randomizedSet.getRandom();
        Assertions.assertEquals(2, random2);
    }


    /**
     * Input:
     * ["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
     * [[],[0],[1],[0],[2],[1],[]]
     * Output:
     * [null,true,true,true,true,true,0]
     * Expected:
     * [null,true,true,true,true,true,2]
     */
    @Test
    public void testCase2() {
        RandomizedSet randomizedSet = new RandomizedSet();
        Assertions.assertTrue(randomizedSet.insert(1));
        Assertions.assertFalse(randomizedSet.remove(2));
        Assertions.assertTrue(randomizedSet.insert(2));
        int random1 = randomizedSet.getRandom();
        Assertions.assertTrue(random1 == 1 || random1 == 2);
        Assertions.assertTrue(randomizedSet.remove(1));
        Assertions.assertFalse(randomizedSet.insert(2));
        int random2 = randomizedSet.getRandom();
        Assertions.assertEquals(2, random2);
    }
}