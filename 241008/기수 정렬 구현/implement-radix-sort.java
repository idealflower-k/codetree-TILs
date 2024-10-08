import java.util.*;
import java.io.*;

public class Main {

    public static final int MAX_K = 6;
    public static final int MAX_DIGIT = 10;
    public static int size;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        size = Integer.parseInt(token.nextToken());
        arr = new int[size];

        token = new StringTokenizer(buffer.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        
        radixSort();

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void radixSort() {
        int p = 1;

        for (int pos = 0; pos < MAX_K; pos++) {
            ArrayList<Integer>[] arrNew = new ArrayList[MAX_DIGIT];
            for (int i = 0; i < MAX_DIGIT; i++) {
                arrNew[i] = new ArrayList<>();
            }

            for (int i = 0; i < size; i++) {
                int digit = (arr[i] / p) % 10;
                arrNew[digit].add(arr[i]);
            }

            int index = 0;
            for (int i = 0; i < MAX_DIGIT; i++) {
                for (int j = 0; j < arrNew[i].size(); j ++) {
                    arr[index++] = arrNew[i].get(j);
                }
            }

            p *= 10;
        }
    }
}