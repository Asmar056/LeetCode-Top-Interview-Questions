package PalindromePartitioning131;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static List<List<String>> partition(String s) {
        boolean[][] palindrome = new boolean[s.length()][s.length()];
        for (int i = s.length()-1; i >= 0; i--) {
            palindrome[i][i] = true;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    if (j - i <= 2)
                        palindrome[i][j] = true;
                    else
                        if (palindrome[i+1][j-1])
                            palindrome[i][j] = true;
                }
            }
        }

        List<List<String>> result = new ArrayList<>();
        dfs(s, 0, result, new ArrayList<>(), palindrome);
        return result;
    }

    private static void dfs(String s, int start, List<List<String>> result, List<String> list, boolean[][] palindrome){
        if (start == s.length())
            result.add(new ArrayList<>(list));

        for (int i = start; i < s.length(); i++) {
            if (palindrome[start][i]){
                list.add(s.substring(start, i + 1));
                dfs(s, i + 1, result, list, palindrome);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        partition(s);
    }
}
