public class MyStack{

	private int[] a;
	private byte top = -1;

	public MyStack(int groesse){
		a = new int[groesse];
	}
	
	public boolean isEmpty(){
		if(top == -1)
			return true;
		return false;
	}
	
	public void push(int i){
		top++;
		a[top] = i;
	}

	public int pop(){
		int tmp = a[top];
		a[top] = 0;
		top--;
		return tmp;
	}
	public boolean pop2(){
		int tmp = a[top];
		a[top] = 0;
		top--;
		if (tmp%2 == 0)
			return true;
		return false;
	}
	public String pop3(){
		return "Hossa";
	}
	
	}
	
	public void stackPrint(){
		System.out.println("--------------------");
		for(byte b = 0; b<array.length; b++){
			System.out.println("Element " + b + ": "+a[b]);
		}
	}
}