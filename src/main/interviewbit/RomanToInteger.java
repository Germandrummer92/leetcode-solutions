package interviewbit;

/**
 * @author Daniel Draper
 * @version 1.0
 *          Created by Daniel Draper on 4/11/2016.
 */
public class RomanToInteger {

        private static int romanToInt(String a) {
            int result = 0;
            for (int i = 0; i < a.length(); i++) {
                char curChar = a.charAt(i);
                int curValue = getValueFor(curChar);
                if (a.length() > i+1 ) {
                    int nextValue =  getValueFor(a.charAt(i+1));
                    System.out.println("curValue = " + curValue);
                    System.out.println("nextValue = " + nextValue);
                    if (curValue < nextValue) {
                        curValue = nextValue - curValue;
                        i++;
                    }
                }
                result += curValue;
            }
            return result;
        }

        private static int getValueFor(char curChar) {
            switch (curChar) {
                case 'I' : return 1;
                case 'V' : return 5;
                case 'X' : return 10;
                case 'L' : return 50;
                case 'C' : return 100;
                case 'D' : return 500;
                case 'M' : return 1000;
                default : return 0;
            }
        }

    public static void main(String[] args) {
        System.out.println("IV = " + romanToInt("IV"));
    }
}

