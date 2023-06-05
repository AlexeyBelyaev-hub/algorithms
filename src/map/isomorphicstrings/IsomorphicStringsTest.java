package map.isomorphicstrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

    @Test
    void isIsomorphic() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        Assertions.assertFalse(isomorphicStrings.isIsomorphic("badc","baba"));
        Assertions.assertTrue(isomorphicStrings.isIsomorphic("abad","ctcx"));
    }
}