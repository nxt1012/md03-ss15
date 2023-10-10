package ra.bt2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int arrLength = Integer.parseInt(sc.nextLine());
        int[] arr = new int[arrLength];
        if (arr.length == 0) {
            throw new NullPointerException("Mảng rỗng");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > max) {
                max = arr[0];
            }
        }

    }
}
