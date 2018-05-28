public class SomeStackTest{
	public static void main (String[] args){
		SomeStack s = new SomeStack(5);
		if(s.isEmpty() == true)
			System.out.println("\t-->Stack leer");
		else
			System.out.println("\t-->Stack nicht leer");
		s.stackPrint();
		s.push(12);
		s.stackPrint();
		if(s.isEmpty() == true)
			System.out.println("\t-->Stack leer");
		else
			System.out.println("\t-->Stack nicht leer");
		s.push(25);
		s.stackPrint();
		s.pop();
		s.stackPrint();
	}

}