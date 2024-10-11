import java.util.*;
import java.io.*;


public class Main {

    static int[] arr;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        size = Integer.parseInt(token.nextToken());
        arr = new int[size + 1];

        token = new StringTokenizer(buffer.readLine());
        for (int i = 1; i <= size; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }

        heapSort(size);

        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static void heapify(int n, int i) {
        int largest = i;
        int left = i * 2;
        int right = i * 2 + 1;

        if (left <= n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right <= n && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(i, largest);
            heapify(n, largest);
        }

    }

    static void heapSort(int n) {
        for (int i = n / 2; i >= 1; i--) {
            heapify(n, i);
        }

        for (int i = n; i > 1; i--) {
            swap(1, i);
            heapify(i - 1, 1);
        }
    }

    static void swap(int src, int dest) {
        int temp = arr[src];
        arr[src] = arr[dest];
        arr[dest] = temp;
    }
}