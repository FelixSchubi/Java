import neueWelt.newWorld;
import neueWelt.arrClass;
import java.util.Scanner;

public class hWorld {



     public static void main(String[]  args){
         System.out.println("Hello World");
	System.out.println("Wie viele? Im Konstruktor?");

  Scanner sc = new Scanner(System.in);
     int tmp = sc.nextInt();
 
	newWorld[] nWa = new newWorld[4];
            for( int i=0; i<4; i++ ) {
             nWa [i] = new newWorld(); }


            nWa[0].sayHi(1);
            nWa[1].sayHi(2);

         test(tmp);
     }

     public static void test(int tmp){

            new arrClass(tmp);
           

     }

}
