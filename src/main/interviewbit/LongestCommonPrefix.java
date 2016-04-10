package interviewbit;

import java.util.*;

public class LongestCommonPrefix {
	public String longestCommonPrefix(ArrayList<String> a) {
	        String curLongest = "";
	        String curString = a.get(0);
	        for (int j = 1; j <= curString.length(); j++) {
	            String curPrefix = a.get(0).substring(0, j);
	            boolean foundFalse = false;
	            for (int k = 1; k < a.size() && !foundFalse; k++) {
	                String toCompare = a.get(k);
	                if (toCompare.length() < j || !curPrefix.equals(toCompare.substring(0, j))) {
	                    foundFalse = true;
	                }
	            }
	            if (!foundFalse) {
	                curLongest = curPrefix;
	            }
	    }
	    return curLongest;
	}
}
