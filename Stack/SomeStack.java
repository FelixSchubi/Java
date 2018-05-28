public class SomeStack{
	private int[] myStack;
	private int top;

	public boolean isEmpty(){
		if(top == -1)
			return true;
		return false;
	}
	
	public SomeStack(int init){
		myStack = new int[init];
		top = -1;
	}
	
	public void push(int i){
		top++;
		myStack[top]=i;
	}
	public int pop(){
		top--;
		return myStack[top+1];
	}
	public int pop2(){
		int tmp = myStack[top];
		myStack[top] = 0;
		top--;
		return tmp;
	}
	public void stackPrint(){
		for(int lv =top; lv>=0; lv--){
			System.out.println(	
			"Element an der Stelle " + lv +
			" hat den Wert " + myStack[lv]);
		}
		System.out.println("\n\n");
	}
	
}