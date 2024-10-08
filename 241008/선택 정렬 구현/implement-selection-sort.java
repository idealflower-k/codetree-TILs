import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        int size = Integer.parseInt(token.nextToken());
        arr = new int[size];

        token = new StringTokenizer(buffer.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}