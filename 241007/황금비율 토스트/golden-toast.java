import java.util.*;
import java.io.*;

public class Main {
	static LinkedList<Character> list = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(buffer.readLine());

		int strLen = Integer.parseInt(token.nextToken());
		int cmdCnt = Integer.parseInt(token.nextToken());

		String str = buffer.readLine();
		char[] chars = str.toCharArray();

		for (char data : chars) {
            list.add(data);
        }

		ListIterator<Character> iter = list.listIterator(list.size());

		for (int i = 0; i < cmdCnt; i++) {
			token = new StringTokenizer(buffer.readLine());
			String cmd = token.nextToken();

			if (cmd.equals("L")) {
				left(iter);
			} else if (cmd.equals("R")) {
				right(iter);
			} else if (cmd.equals("D")) {
				delete(iter);
			} else if (cmd.equals("P")) {
				Character data = token.nextToken().charAt(0);
				position(iter, data);
			}
		}

		for (Character data : list) {
			System.out.print(data);
		}
	}

	private static void left(ListIterator<Character> iter) {
		if (iter.hasPrevious()) {
			iter.previous();
		}
	}

	private static void right(ListIterator<Character> iter) {
		if (iter.hasNext()) {
			iter.next();
		}
	}

	private static void delete(ListIterator<Character> iter) {
		if (iter.hasNext()) {
			iter.next();
			iter.remove();
		}
	}

	private static void position(ListIterator<Character> iter, Character data) {
		if (iter.hasNext()) {
			iter.add(data);
		} else {
			iter.add(data);
		}
	}
}