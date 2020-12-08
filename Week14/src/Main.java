
import java.util.Scanner;
public class Main {

	static int histo(int[] v, int a, int b) {
		
		if (a == b) return v[a];
		int mid = (a+b)/2;
		int left = histo(v, a, mid);
		int right = histo(v, mid+1, b);
		int res = Math.max(left, right);
		
		int i = mid, j = mid+1;
		int h = Math.min(v[i], v[j]);
		res = Math.max(res, h*2);
		
		while (a < i || j <b) {
			if (j < b && ((i == a) || v[i-1] < v[j+1]))
				h= Math.min(h, v[++j]);
			else h = Math.min(h, v[--i]);
			res = Math.max(res, h*(j-i+1));
		}
		return res;
	}
	
	static int histo(int[] v, int n) {
		return histo(v, 0, n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for (int i=0; i<n; i++) v[i] = sc.nextInt();
		
		int r = histo(v, n);
		System.out.println(r);
	}
}