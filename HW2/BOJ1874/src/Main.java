import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack();
		ArrayList arr = new ArrayList();
		int n = sc.nextInt();
		int[] a = new int[n + 1];
		int m = 1;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			stack.push(i);
			arr.add("+");
			while (!stack.empty() && (int)stack.peek() == a[m]) {
				stack.pop();
				arr.add("-");
				m++;
			}
		}

		if (stack.empty()) {
			 
				System.out.println(arr);
			}
		 else {
			System.out.println("NO");
		}

	}
}
