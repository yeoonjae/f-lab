package algorithm;

import java.util.HashMap;
import java.util.Map;
import javafx.beans.property.IntegerProperty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class k번째_수 {

//    public static void main(String[] args) {
//
//        k번째_수 k = new k번째_수();
//        int[] arr = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//
//        System.out.println(Arrays.toString(k.soultionTest2(arr, commands)));
//    }

    public int[] soultionTest(int[] arrays, int[][] commands) {
        int[] answers = new int[commands.length];
        int cnt = 0;

        for (int i = 0; i < commands.length; i++) {

            int[] temp = Arrays.copyOfRange(arrays, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answers[i] = temp[commands[i][2] - 1];
        }
        System.out.println(Arrays.toString(answers));
        return answers;
    }

    public int[] soultionTest2(int[] arrays, int[][] commands) {
        int[] answers = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int startIndex = commands[i][0];
            int endIndex = commands[i][1];
            int selectIndex = commands[i][2];

            int[] temp = new int[endIndex - startIndex + 1];
            int n = 0;
            for (int j = startIndex - 1; j < endIndex; j++) {
                temp[n] = arrays[j];
                n++;
            }
            Arrays.sort(temp);
            answers[i] = temp[selectIndex - 1];
        }

        return answers;
    }

}

class Solution {

    public static String solution(String[] participants, String[] completions) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participants.length; i++) {
            if (map.get(participants[i]) == null) {
                map.put(participants[i], 1);
            } else {
                map.put(participants[i], map.get(participants[i]) + 1);
            }
        }

        for (int i = 0; i < completions.length; i++) {
            if (map.containsKey(completions[i])) {
                map.put(completions[i], map.get(completions[i]) - 1);
            }
        }

        return map.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst().orElse("");
    }
}
