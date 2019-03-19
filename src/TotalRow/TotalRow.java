package TotalRow;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.*;

public class TotalRow {

    static ArrayList<Integer> ans = new ArrayList<Integer>();

    public static ArrayList<Integer> getRowTotals(int[][] m) {
        int sum = 0;
        for (int[] i : m) {
            sum = 0;
            for (int j : i) {
                sum += j;
            }
            ans.add(sum);
        }
        return ans;
    }

    public static String makeString(ArrayList<Integer> arr) {
        String output = "[";
        for (int i : arr) {
            output += " " + i + ",";
        }
        if (output.equals("[")) {
            output += "]";
        } else {
            output += "\b]";
        }
        return output;
    }
}
