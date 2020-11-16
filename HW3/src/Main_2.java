import java.util.Scanner;

class Queue<E>{ 
	int front;
	int rear;
	E[] data;
	int size;
	
	
	Queue(){
		front=0;
		rear=0;
		size=1000;
		data=(E[])new Object[size];
	}
	public void add(E v) {
		data[rear]=v;
		rear=(rear+1)%size;
	}
	public void remove() {
		data[front]=null;
		front=(front+1)%size;
	}
	public E peek() {
		return data[front];
	}
	public boolean empty() {
		return front==rear; 
	}
	public int size() { 
		return (rear-front+size)%size;
	}
	public E back() {
		return data[(rear-1)];
	}
}
public class Main_2 {
	
	public static void main(String[] args) {

		
		Queue<Integer> queue = new Queue();
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			String str = scan.next();
			if(str.equals("push")) {
				int n = scan.nextInt();
				queue.add(n);
			}
			else if(str.equals("pop")) {
				if(queue.empty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(queue.peek());
					queue.remove();
				}
			}
			else if(str.equals("size")) {
				System.out.println(queue.size());
			}
			else if(str.equals("empty")) {
				if(queue.empty()) {
					System.out.println("1");
				}
				else {
					System.out.println("0");
				}
			}
			else if(str.equals("front")) {
				if(queue.empty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(queue.peek());
				}
			}
			else if(str.equals("back")) {
				if(queue.empty()) {
					System.out.println("-1");
				}
				else {
					System.out.println(queue.back());
				}
			}
		}
	}
}
