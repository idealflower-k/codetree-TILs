import java.util.*;
import java.io.*;

public class Main {
    public static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        int cmdCnt = Integer.parseInt(token.nextToken());

        for (int i = 0; i < cmdCnt; i++) {
            token = new StringTokenizer(buffer.readLine());
            String cmd = token.nextToken();

            if (cmd.equals("push_front")) {
                int data = Integer.parseInt(token.nextToken());
                pushFront(data);
            } else if (cmd.equals("push_back")) {
                int data = Integer.parseInt(token.nextToken());
                pushBack(data);
            } else if (cmd.equals("pop_front")) {
                popFront();
            } else if (cmd.equals("pop_back")) {
                popBack();
            } else if (cmd.equals("size")) {
                size();
            } else if (cmd.equals("empty")) {
                empty();
            } else if (cmd.equals("front")) {
                front();
            } else if (cmd.equals("back")) {
                back();
            }
        }
    }

    private static void pushFront(int data) {
        list.addFirst(data);
    }

    private static void pushBack(int data) {
        list.addLast(data);
    }

    private static void popFront() {
        int data = list.pollFirst();
        System.out.println(data);
    }

    private static void popBack() {
        int data = list.pollLast();
        System.out.println(data);
    }

    private static void size() {
        System.out.println(list.size());
    }

    private static void empty() {
        if (list.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void front() {
        int data = list.peekFirst();
        System.out.println(data);
    }

    private static void back() {
        int data = list.peekLast();
        System.out.println(data);
    }
}