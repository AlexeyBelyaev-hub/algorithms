package map.uniquewordavrev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidWordAbbrTest {

    ValidWordAbbr dictionary = new ValidWordAbbr("deer","door","cake","card");

    @ParameterizedTest
    @CsvSource(
            value = {"dear:false","cart:true","cane:false", "make:true", "cake:true"},
            delimiter = ':')
    void isUnique1(String input, boolean expected) {
        Assertions.assertEquals(expected,dictionary.isUnique(input));
    }


    @ParameterizedTest
    @CsvSource(
            value = {"dear:false","door:false","cart:true", "cake:true"},
            delimiter = ':')
    void isUnique2(String input, boolean expected) {
        Assertions.assertEquals(expected,dictionary.isUnique(input));
    }
}