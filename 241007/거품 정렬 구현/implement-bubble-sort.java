import java.util.*;
import java.io.*;

public class Main {
    static int[] ints;

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        int numCnt = Integer.parseInt(token.nextToken());
        ints = new int[numCnt];

        token = new StringTokenizer(buffer.readLine());
        for (int i = 0; i < numCnt; i++) {
            ints[i] = Integer.parseInt(token.nextToken());
        }

        boolean isSorted = false;

        do {
            isSorted = true;
            for (int i = 0; i < numCnt - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    int temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                    isSorted = false;
                }
            }
        } while (!isSorted);

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}