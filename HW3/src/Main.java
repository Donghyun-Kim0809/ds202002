//ť�� ������ �����մϴ�
//���� n�� �Է¹޽��ϴ�.
// ť�� n���� ������ ���ڵ��� �ֽ��ϴ�.  ������ ���ڴ� 0~10000 ������ �մϴ�.
//ť���� ���� �ϳ��� �����ϴ�.
//���� �ֻ��� ���ڰ� ť���� ���� ���ں��� ���� ���, ���ÿ��� ���ڸ� ���� ť�� �ֽ��ϴ�.
//������ ����ְų� ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� Ŭ������ e)�� �ݺ��մϴ�.
//���ÿ� ť���� ���� ���ڸ� �ӽ��ϴ�.
//ť�� ������� �ʴٸ� d)�� ���� ������ ����մϴ�.
//���ÿ� �ִµ����͸� �ϳ��� �����鼭 �����͸� ����մϴ�.
import java.util.Scanner;
import java.util.Random;
public class Main {


	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r= new Random();
		System.out.println("�� ���� ����:" );
		int N=sc.nextInt();
		int head=0, tail=0;
		int [] queue= new int[N];
		int [] stack=new int[N];
		int top=-1;
		for(int i=0; i<N; i++) {
			queue[tail]=r.nextInt(10000);
			tail=(tail+1)%N;
		}
		for(int i=0; i<N; i++) {
			System.out.println(queue[i]);
		}
		
		while(head != tail) {
			if (top==-1) {
				top++;
				stack[top]=queue[head];
				queue[head] = (Integer)null;
				head = (head+1)%N;
			}
			
			else if (queue[head]<stack[top]) {
				queue[tail]=stack[top];
				tail=(tail+1)%N;
				stack[top] = (Integer)null;
				top--;				
			}
			else if ((top+1)!=0 && queue[head]>stack[top]) {
				top++;
				stack[top]=queue[head];
				queue[head] = (Integer)null;
				head = (head+1)%N;
			}
			
		}
		System.out.println(" ");
		System.out.println("���� ���:");
		for (int i=0; i<N; i++) {
			System.out.println(stack[top]);
			stack[top] = (Integer)null;
			top--;
			}

		
		
		
	}

}