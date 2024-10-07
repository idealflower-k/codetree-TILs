import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer> array = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(buffer.readLine());

        int cmdCnt = Integer.parseInt(token.nextToken());

        for (int i = 0; i < cmdCnt; i++) {
            token = new StringTokenizer(buffer.readLine());
            String cmd = token.nextToken();

            if (cmd.equals("push_back")) {
                int data = Integer.parseInt(token.nextToken());
                pushBack(data);
            } else if (cmd.equals("pop_back")) {
                popBack();
            } else if (cmd.equals("size")) {
                size();
            } else if (cmd.equals("get")) {
                int idx = Integer.parseInt(token.nextToken()) - 1;
                get(idx);
            }

        }
    }

    private static void pushBack(int data) {
        array.add(data);
    }

    private static void popBack() {
        array.remove(array.size() - 1);
    }

    private static void size() {
        System.out.println(array.size());
    }

    private static void get(int idx) {
        int data = array.get(idx);
        System.out.println(data);
    }

}