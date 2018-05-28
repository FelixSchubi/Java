import java.util.Scanner;

public class test {

    public static void main(String[] args) {

    Scanner eingabe = new Scanner(System.in);

      System.out.println("Wie viele Werte soll der Object Stack annehmen?");
      int size = eingabe.nextInt();

     stack one = new stack(size);
    
 try {

    for(int i = 0; i < size; i++) {
        System.out.println((i+1)  + ".ter Wert! Was wird eingegebn *** \"Z\" für Zahl & \"N\" für Name ?? *** :  ");
        String tmp = eingabe.next();
        if(tmp.equals("Z") == true) {
            System.out.println("Welche Zahl?");
            int x = eingabe.nextInt();
            one.push(x);
        } else if (tmp.equals("N") == true) {
            System.out.println("Welcher Name?");
            String nam = eingabe.next();
            one.push(nam);
        } else {
            System.out.println("Das war nix!");
        }
    }
    System.out.println("Falsch Herum: ");
    for(int i = 0; i<size; i++) {
        System.out.println("Daten von " + (i+1) + ".ten Array Block: " + one.pop());
    }

    System.out.println("Richtig Herum: "); 
      for(int i = 0; i<size; i++) {
        System.out.println("Daten von " + (i+1) + ".ten Array Block: " + one.pop2());
    }
    // Nur Zum testen der eigenen Exception
// test();

 }
        catch (/*myExc e*/ Exception e)
         {
            System.out.println(e.getMessage());
        }
 
}



    // public static void test () throws myExc
    // {
    //     int divisor = 0;
 
    //     if(divisor != 0)
    //     {
    //         System.out.println("AHA");
    //     }
    //     else
    //     {
    //         /* Hier wird unsere Exception geworfen */
    //         throw new myExc();
 
    //         /* Anweisungen nach einer throw Anweisung in einem Block werden nicht mehr ausgeführt */
    //     }
    //  //   return ergebnis;
    // }


}