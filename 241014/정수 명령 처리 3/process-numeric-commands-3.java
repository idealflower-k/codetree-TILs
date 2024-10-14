import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());
        Deque<Integer> que = new ArrayDeque<>();

        int cmdCnt = Integer.parseInt(token.nextToken());

        for (int i = 0; i < cmdCnt; i++) {
            token = new StringTokenizer(buffer.readLine());
            String cmd = token.nextToken();
            
            if (cmd.equals("push_front")) {
                int data = Integer.parseInt(token.nextToken());
                que.addFirst(data);

            } else if (cmd.equals("push_back")) {
                int data = Integer.parseInt(token.nextToken());
                que.addLast(data);
                
            } else if (cmd.equals("pop_front")) {
                System.out.println(que.pollFirst());
                
            } else if (cmd.equals("pop_back")) {
                System.out.println(que.pollLast());
                
            } else if (cmd.equals("size")) {
                System.out.println(que.size());
                
            } else if (cmd.equals("empty")) {
                if (que.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
                
            } else if (cmd.equals("front")) {
                System.out.println(que.peekFirst());
                
            } else if (cmd.equals("back")) {
                System.out.println(que.peekLast());
            }
        }
    }
}