import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        int size = Integer.parseInt(token.nextToken());
        int[] arr = new int[size];

        token = new StringTokenizer(buffer.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        for (int i = 1; i < size; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}