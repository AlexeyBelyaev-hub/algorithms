package map;

import java.util.Arrays;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] sToTmapping = new int[256];
        Arrays.fill(sToTmapping, -1);

        int[] tToSmapping = new int[256];
        Arrays.fill(tToSmapping, -1);

        for (int i =0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            //Case 1. No mapping
            if (sToTmapping[sc]==-1 && tToSmapping[tc]==-1) {
                sToTmapping[sc] = tc;
                tToSmapping[tc] = sc;
            }
            // Case 2. Mapping exists but doesn't match in either of the dict or both
            else if (!(sToTmapping[sc] == tc && tToSmapping[tc] == sc)){
                return false;
            }
        }
        return true;
    }
}
