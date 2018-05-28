public class MyStackI{

	private Integer[] a;
	private byte top = -1;

	public MyStackI(int groesse){
		a = new Integer[groesse];
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

	public Integer pop(){
		int tmp = a[top];
		a[top] = null;
		top--;
		return tmp;
	}
	//Zweckentfremdung des Methodennamens
	public boolean pop2(){
		int tmp = a[top];
		a[top] = 0;
		top--;
		if (tmp%2 == 0)
			return true;
		return false;
	}
	//Zweckentfremdung des Methodennamens
	public String pop3(){
		return "Hossa";
	}
	
	public void stackPrint(){
		System.out.println("--------------------");
		for(byte b = 0; b<a.length; b++){
			System.out.println("Element " + b + ": "+a[b]);
		}
	}
}