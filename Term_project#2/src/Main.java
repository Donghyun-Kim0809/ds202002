import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int N=sc.nextInt(); //데이터 개수
		int K=sc.nextInt(); //구간개수
		long t1 = System.currentTimeMillis();
		
		int[] num=new int[N];
		int[] a1=new int[K];
		int[] a2=new int[K];
		int a=0,b=0;		
		int max, min, sum;
		max=sum=0;
		min=10000;
		for(int i=0;i<N;i++) {
			num[i]=r.nextInt(1000);
			System.out.println(num[i]);
		}
		for(int j=0;j<K;j++) {
			a1[j]=r.nextInt(N)+1;
			a2[j]=r.nextInt(N)+1;
			if(a1[j]>a2[j]) {
				a=a1[j];
				b=a2[j];
				a1[j]=b;
				a2[j]=a;
				System.out.println(a1[j]);
				System.out.println(a2[j]);
			}
			if(a1[j]==a2[j]) {
				a2[j]=a1[j]+1;
			}
			else {
				System.out.println(a1[j]);
				System.out.println(a2[j]);
			}
		}

		
		for (int i=0; i<K; i++) {
			a=a1[i];
			b=a2[i];
			for(int start=a-1;start<b;start++) {
				if(num[start]>max) max=num[start];
				if(num[start]<min) min=num[start];
				sum=min+max;
			}
			System.out.println("구간"+ a +"에서부터"+ b +"까지의 : 최소값 =" +min+"최대값= "+max+" 합계 = "+sum);
			}

		long t2=System.currentTimeMillis();
		System.out.println("Elapsed Time is "+(t2-t1)+"ms.");
			
		}


	}
