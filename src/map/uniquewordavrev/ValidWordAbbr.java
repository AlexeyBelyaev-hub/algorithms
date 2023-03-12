package map.uniquewordavrev;

import java.util.*;

class ValidWordAbbr {

    Map<String, Set<String>> abbrMap;
    public ValidWordAbbr(String...dictionary) {
        abbrMap = new HashMap<>();
        for (String e : dictionary) {
            String abbr = getAbbr(e);
            Set<String> wordSet = abbrMap.getOrDefault(abbr, new HashSet<>());
            wordSet.add(e);
            abbrMap.put(abbr, wordSet);
        }
    }

    public boolean isUnique(String word) {
        String abbr = getAbbr(word);
        if (abbrMap.containsKey(abbr)) {
            Set<String> words = abbrMap.get(abbr);
            return words.contains(word) && words.size() == 1;
        }
        return true;
    }

    private String getAbbr(String word) {
        int length = word.length();
        if (length <=2) return word;
        String toInsert = String.valueOf(length-2);

        String newStr = word.charAt(0) + toInsert + word.substring(length-1);
        System.out.println("abbr of "+word+" = " + newStr);
        return newStr;

    }
}