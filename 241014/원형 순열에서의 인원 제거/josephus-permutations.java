import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> que = new LinkedList<>();

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());

        for (int i = 0; i < N; i++) {
            que.add(i + 1);
        }

        while (que.size() != 1) {
            for (int i = 1; i < K; i++) {
                int data = que.poll();
                que.add(data);
            }
            sb.append(que.poll()).append(" ");
        }

        sb.append(que.poll());

        System.out.println(sb.toString());
    }
}