import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String str = buffer.readLine();
        
        for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);

			if (character == '(') {
				stack.push(character);
			} else {
				if (stack.isEmpty()) {
				    System.out.println("No");
                    return;
				}
				stack.pop();
			}
		}

		if (stack.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}