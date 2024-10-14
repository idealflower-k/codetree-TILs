import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        Stack<Integer> stack = new Stack<>();

        int cmdCnt = Integer.parseInt(token.nextToken());

        for (int i = 0; i < cmdCnt; i++) {
            token = new StringTokenizer(buffer.readLine());
            String cmd = token.nextToken();

            if (cmd.equals("push")) {
                int data = Integer.parseInt(token.nextToken());
                stack.push(data);
            } else if (cmd.equals("pop")) {
                int data = stack.pop();
                System.out.println(data);
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                boolean result = stack.isEmpty();
                if (result) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (cmd.equals("top")) {
                System.out.println(stack.peek());
            }
        }
    }
}