/**
 * A28
 *
 * @author Mr. King
 * @version 11/22/2021
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(biggestDiff("288321"));
        System.out.println(biggestDiff("2063340"));
        System.out.println(biggestDiff("668"));
        System.out.println(sameEnds("abXYab")); 
        System.out.println(sameEnds("ABBA")); 
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
        System.out.println(sameEnds("javaXYZjava"));
        System.out.println(sameEnds("xavaXYZjava"));
    }

    /**
     * Calculates the difference between smallest and largest integers in the string.
     *
     * @param str - the string with all numbers
     * @return      the difference between the largest and smallest numbers
     */
    public static int biggestDiff(String str) {
        int big = 0;  // this will get replaced if it finds a number bigger than 0
        int small = 9;  // this will get replaced if it finds a number smaller than 9

        for(int i = 0; i < str.length(); i++) {
            int c = Integer.parseInt(str.substring(i, i+1));  // convert character to int
            big = Math.max(big, c);  // see if it is bigger than current max
            small = Math.min(small, c);  // see if it is smaller than current min
        }

        return (big - small);
    }
    
    /**
     * Finds the largest substring that exists at beginning and end of the string, 
     * without overlapping
     *
     * @param str - the string to be checked
     * @return      the largest substring found
     */
    public String sameEnds(String str) {
        int n = 0;
        int max = str.length() / 2;

        for(int i = 0; i < max; i++) {
            if(str.substring(0, i+1).equals(str.substring(str.length() - 1 - i))) {
                n = i+1;
            }
        }

        return str.substring(0, n);
    }
}
