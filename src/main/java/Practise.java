import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Mew on 2017/7/14.
 */
public class Practise {
    //    static Scanner scanner = new Scanner(System.in);
//    static String str  = scanner.next();
    public static void main(String[] args) {
        Practise practise = new Practise();
        System.out.println(practise.checkReverseEqual("waterbottle", "erbottlewat"));
    }

    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        return false;
    }

    public int[][] clearZero(int[][] mat, int n) {
        Set<Integer> x = new HashSet<Integer>();
        Set<Integer> y = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (int i : x) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = 0;
            }
        }
        for (int j : y) {
            for (int i = 0; i < n; i++) {
                mat[i][j] = 0;
            }
        }
        return mat;
    }

    public int[][] transformImage(int[][] mat, int n) {
        int[] temp = new int[n];

        return mat;
    }

    public String zipString(String iniString) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iniString.length(); i++) {
            stringBuilder.append(iniString.charAt(i));
            int cnt = 1;
            for (int j = i + 1; j < iniString.length(); j++) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    cnt++;
                } else {
                    break;
                }
            }
            i += (cnt - 1);
            stringBuilder.append(cnt);
        }
        if (stringBuilder.length() == iniString.length() * 2) {
            return iniString;
        }
        return stringBuilder.toString();
    }

    public boolean checkDifferent(String iniString) {
        for (int i = 0; i < iniString.length(); i++) {
            for (int j = i + 1; j < iniString.length(); j++) {
                if (iniString.charAt(i) == iniString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String reverseString(String iniString) {
        return new StringBuilder(iniString).reverse().toString();
    }

    public boolean checkSam(String stringA, String stringB) {
        for (int i = 0; i < stringA.length(); i++) {
            if (-1 == stringB.indexOf(stringA.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (iniString.charAt(i) != ' ') {
                stringBuilder.append(iniString.charAt(i));
            } else {
                stringBuilder.append("%20");
            }
        }
        return stringBuilder.toString();
    }
}
