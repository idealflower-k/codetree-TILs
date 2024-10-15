import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();

        int size = Integer.parseInt(buffer.readLine());

        for (int i = 1; i <= size; i++) {
            que.addLast(i);
        }

        while(que.size() > 1) {
            que.pollFirst();

            int data = que.pollFirst();
            que.addLast(data);
        }

        System.out.println(que.peekFirst());

    }
}