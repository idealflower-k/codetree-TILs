import java.util.*;
import java.io.*;

public class Main {

    static int size;
    static int[] arr;
    static int[] mergedArr;

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        size = Integer.parseInt(token.nextToken());
        arr = new int[size];

        token = new StringTokenizer(buffer.readLine());
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        quickSort(0, size - 1);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void quickSort(int low, int high) {
        if (low < high) {
            int pos = partition(low, high);

            quickSort(low, pos - 1);
            quickSort(pos + 1, high);
        }
    }

    public static int partition(int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}