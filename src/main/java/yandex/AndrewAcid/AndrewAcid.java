package yandex.AndrewAcid;

import java.util.Scanner;

public class AndrewAcid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vols = new int[n];
        for (int i = 0; i < n; i++) {
            vols[i] = scanner.nextInt();
        }

        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            if (vols[i] > vols[i + 1]) {
                System.out.println(-1);
                return;
            } else if (vols[i] < vols[i + 1]) {
                k += vols[i + 1] - vols[i];
            }
        }
        System.out.println(k);
    }
}
