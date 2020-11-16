//큐와 스택을 생성합니다
//숫자 n을 입력받습니다.
// 큐에 n개의 랜덤한 숫자들을 넣습니다.  랜덤한 숫자는 0~10000 범위로 합니다.
//큐에서 숫자 하나를 꺼냅니다.
//스택 최상위 숫자가 큐에서 꺼낸 숫자보다 작은 경우, 스택에서 숫자를 꺼내 큐에 넣습니다.
//스택이 비어있거나 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 클때까지 e)를 반복합니다.
//스택에 큐에서 꺼낸 숫자를 넛습니다.
//큐가 비어있지 않다면 d)로 가서 수행을 계속합니다.
//스택에 있는데이터를 하나씩 꺼내면서 데이터를 출력합니다.
import java.util.Scanner;
import java.util.Random;
public class Main {


	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random r= new Random();
		System.out.println("총 난수 갯수:" );
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
		System.out.println("정렬 결과:");
		for (int i=0; i<N; i++) {
			System.out.println(stack[top]);
			stack[top] = (Integer)null;
			top--;
			}

		
		
		
	}

}