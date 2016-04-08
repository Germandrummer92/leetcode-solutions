package interviewbit;

import java.util.ArrayList;

/**
 * @author Daniel Draper
 * @version 1.0
 *          Created by Daniel Draper on 4/8/2016.
 */
public class PascalTriangleKthRow {
    public class Solution {
        public ArrayList<Integer> getRow(int a) {
            ArrayList<ArrayList<Integer>> result = generate(a+1);
            return result.get(a);

        }

        public ArrayList<ArrayList<Integer>> generate(int a) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                result.add(new ArrayList<>());
                for (int j = 0; j <= i; j++) {
                    if (i == 0) {
                        result.get(0).add(1);
                    }
                    else  {
                        if (j == 0) {
                            result.get(i).add(1);
                        }
                        else {
                            if (result.get(i-1).size() > j) {
                                result.get(i).add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                            }
                            else {
                                result.get(i).add(1);
                            }
                        }
                    }
                }
            }
            return result;
        }


    }
}
