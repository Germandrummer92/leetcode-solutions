package oj.leetcode.stringConcatenatedWordsIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
        int wordLength = words.length > 0 ? words[0].length() : 0;
        int wordCount = wordsList.size();
        List<Integer> result =  new ArrayList<Integer>();
        if (wordsList.size()*wordLength > s.length()) {
            return new ArrayList<Integer>();
        }
        for (int i = 0; i < s.length(); i++) {
            String curSubstring = i + wordCount * wordLength <= s.length() ? s.substring(i , i + wordCount*wordLength) : null;
            if (findIfStringHasAllWords(wordLength, curSubstring, words)) {
                result.add(i);
            }
        }
        return result;

    }
    private boolean findIfStringHasAllWords(int wordLength, String s, String[] words) {

        ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
        if (s == null || wordLength > s.length()) {
            return false;
        }
        if (words.length == 0) {
            return true;
        }
        for (int j = 0; j < wordsList.size(); j++) {
            int range = j +wordLength;
            if (s.substring(0, wordLength).equals(wordsList.get(j))) {
                wordsList.remove(j);
                if (wordsList.size() == 0) {
                    return true;
                }
                String[] newWords = new String[wordsList.size()];
                newWords = wordsList.toArray(newWords);
                return findIfStringHasAllWords(wordLength, s.substring(wordLength, s.length()), newWords);
            }
        }
        return false;

    }
}