package singlenumberiii;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Daniel Draper <a href="mailto:Germandrummer92@gmail.com">
 * @version 1.0
 *          Created on 01.04.16.
 */
public class Solution {

    private HashSet<Integer> hashSet = new HashSet<>();
    private HashSet<Integer> doubleNum = new HashSet<>();

    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        for (int num : nums) {
            if (!hashSet.contains(num)) {
                hashSet.add(num);
            } else {
                doubleNum.add(num);
            }
        }
        hashSet.removeAll(doubleNum);
        Iterator<Integer> iter = hashSet.iterator();
        res[0] = iter.next();
        res[1] = iter.next();
        return res;
    }

}
