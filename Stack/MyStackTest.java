public class MyStackTest{
	public static void main(String[] args){
		MyStack s = new MyStack();

		s.push(3);
		s.stackPrint();
		s.push(5);
		s.stackPrint();
		System.out.println("Pop: " + s.pop());
		s.stackPrint();
	}
}