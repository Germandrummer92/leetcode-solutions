package majorityelement;

import java.util.HashMap;

/**
 * @author Daniel Draper <a href="mailto:Germandrummer92@gmail.com">
 * @version 1.0
 *          Created on ${Date}
 */
public class Solution {
    private HashMap<Integer, Integer> occ = new HashMap<>();

    //Overall runtime O(2n)= O(n)
    public int majorityElement(int[] nums) {
        //Runtime O(n)
        for (int num : nums) {
            //O(1)
            if (occ.containsKey(num)) {
                occ.replace(num, occ.get(num) + 1);
            } else {
                //O(1)
                occ.put(num, 1);
            }
        }
        //Runtime O(n)
        for (HashMap.Entry<Integer, Integer> entry : occ.entrySet()) {
            //O(1)
            if (entry.getValue() > nums.length / 2) {
                //(1)
                return entry.getKey();
            }

        }
        return 0;
    }
}