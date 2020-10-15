<<<<<<< HEAD
import java.util.Scanner;

public class Main {
	public static boolean isValid(String pp) {
		char[] stack = new char[1024];
		int top = -1;
		
		for(int i=0;i<pp.length();i++) {
			char ch = pp.charAt(i);
			if(ch == '(' ) {

				stack[++top] = ch;
			}
			else if(ch == ')') {
				if(top == -1 || stack[top] != '(') return false;
				top--;
			}
		}
		return top == -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			String pp = scan.next();
			
			if(isValid(pp)) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
=======
import java.util.Scanner;

public class Main {
	public static boolean isValid(String pp) {
		char[] stack = new char[1024];
		int top = -1;
		
		for(int i=0;i<pp.length();i++) {
			char ch = pp.charAt(i);
			if(ch == '(' ) {

				stack[++top] = ch;
			}
			else if(ch == ')') {
				if(top == -1 || stack[top] != '(') return false;
				top--;
			}
		}
		return top == -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			String pp = scan.next();
			
			if(isValid(pp)) System.out.println("YES");
			else System.out.println("NO");
		}
	}

}
>>>>>>> b8b491c4fcf1829b7274b56caee6f2cd15289a98
