import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static String checkWeirdness(int n) {
        // If n is odd, print Weird
        if (n % 2 != 0) {
            return "Weird";
        } else {
            // If n is even and in the inclusive range of 2 to 5, print Not Weird
            if (n >= 2 && n <= 5) {
                return "Not Weird";
            }
            // If n is even and in the inclusive range of 6 to 20, print Weird
            else if (n >= 6 && n <= 20) {
                return "Weird";
            }
            // If n is even and greater than 20, print Not Weird
            else if (n > 20) {
                return "Not Weird";
            }
        }
        return ""; // Should not be reached given the problem constraints
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = checkWeirdness(N);
        System.out.println(result);

        scanner.close();
    }