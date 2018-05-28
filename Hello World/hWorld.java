import neueWelt.newWorld;
import neueWelt.arrClass;

public class hWorld {

     public static void main(String[]  args){
         System.out.println("Hello World");

        newWorld[] nWa = new newWorld[4];
            for( int i=0; i<4; i++ ) {
             nWa [i] = new newWorld(); }


            nWa[0].sayHi(1);
            nWa[1].sayHi(2);

         test();
     }

     public static void test(){

            arrClass arCl1 = new arrClass();
            arCl1.faceFuntction();

     }

}