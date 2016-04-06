package interviewbit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Apparently runtime is not sufficient. Further investigations needed.
public class Solution {
    private HashSet<Integer> h = new HashSet<>();


    public ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i < a; i++) {
            if (isPrime(i) == 1) {
                h.add(i);
            }
        }
        Iterator<Integer> iter = h.iterator();
        int cur;
        while (iter.hasNext()) {
            cur = iter.next();
            int min = a - cur < cur ? a - cur : cur;
            int max = a - cur > cur ? a - cur : cur;
            if (h.contains(a - cur)) {
                if (result.size() == 2) {
                    if (min < result.get(0)) {
                        result.remove(0);
                        result.remove(0);
                        result.add(0, min);
                        result.add(1, max);
                    }
                } else {
                    result.add(0, min);
                    result.add(1, max);
                }
            }
        }
        return result;

    }


    private int isPrime(int A) {
        if (A == 2) {
            return 1;
        }
        if (A < 2 || A % 2 == 0) {
            return 0;
        }
        int upperLimit = (int) (Math.sqrt(A));
        for (int i = 2; i <= upperLimit; i++) {
            if (i < A && A % i == 0) return 0;
        }
        return 1;
    }
}
