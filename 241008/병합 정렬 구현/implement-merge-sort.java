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
		int i = low;
		int j = mid + 1;
		int k = low;

		int[] mergedArr = new int[size];
		while (i <= mid && j <= high) {
			if (arr[i] <= arr[j]) {
				mergedArr[k++] = arr[i++];
			} else {
				mergedArr[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			mergedArr[k++] = arr[i++];
		}

		while (j <= high) {
			mergedArr[k++] = arr[j++];
		}

		for (int idx = low; idx <= high; idx++) {
			arr[idx] = mergedArr[idx];
		}
	}
}