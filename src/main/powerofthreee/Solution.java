package powerofthreee;

/**
 * @author Daniel Draper <a href="mailto:Germandrummer92@gmail.com">
 * @version 1.0
 *          Created on ${Date}
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n != 0 && n % 3 == 0) {
            n = n / 3;
            return isPowerOfThree(n);
        }
        return false;
    }
}