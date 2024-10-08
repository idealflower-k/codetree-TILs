import java.util.*;
import java.io.*;

public class Main {

	static int size;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(buffer.readLine());

		size = Integer.parseInt(token.nextToken());
		arr = new int[size];

		token = new StringTokenizer(buffer.readLine());
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(token.nextToken());
		}

		merge_sort(0, size - 1);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void merge_sort(int low, int high) {
		if (high > low) {
			int mid = (low + high) / 2;
			merge_sort(low, mid);
			merge_sort(mid + 1, high);
			merge(low, mid, high);
		}
	}

    public static void merge(int low, int mid, int high) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] leftArr = Arrays.copyOfRange(arr, low, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, high + 1);

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[low + k++] = leftArr[i++];
            } else {
                arr[low + k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) {
            arr[low + k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            arr[low + k++] = rightArr[j++];
        }
    }
}