package taskexamples;

import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) {

        int n = 10;
        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            table[i][j] = (i+1) * (j+1);    }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%2d x %2d = %2d   ", i+1, j+1 , table[i][j]);
            }
            System.out.println();
        }


    }
}
