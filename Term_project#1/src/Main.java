import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int N=sc.nextInt();
		int[] num=new int[N];
		for(int i=0;i<N;i++) {
			num[i]=r.nextInt(100);
			System.out.println(num[i]);
		}
		int a= sc.nextInt();
		int b= sc.nextInt();
		int max, min, sum;
		max=min=sum=num[0];
		for(int j=1;j<num.length;j++) {
			if(max<num[j])
				max=num[j];
			if(min>num[j])
				min=num[j];
			sum=min+max;
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}

}