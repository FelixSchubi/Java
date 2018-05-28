public class MyStackTestI{
	public static void main(String[] args){
		MyStackI s = new MyStackI(5);

		s.push(3);
		s.stackPrint();
		s.push(5);
		s.stackPrint();
		System.out.println("Pop: " + s.pop());
		s.stackPrint();
	}
}