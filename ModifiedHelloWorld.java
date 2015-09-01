//ModifiedHelloWorld.java
//i like codes kept as compact as possible
public class ModifiedHelloWorld {
  public static void main(String args[]) {
//   System.out.print("Hello\nWorld!\n\"I'm Simon!");
//   System.out.println(" This is my story...\"");
//   System.out.print("\tOnce upon a time, a long time ago...\\\n");
   //concatenation (take one String and atdd it to another String)
  /* String text; //only declares String
   text = "APCS is fun!"; //assigns text to the declared String
   String text2 = "APCS is not fun!"; //assigns and declares a String
   String text3 = new String("Is APCS fun?"); //String constructor
   System.out.println(text+"\n"+text2+"\n"+text3);
   String result = new String(text+"\n"+text2+"\n"+text3);
   String alternateResult = text+"\n"+text2+"\n"+text3;
   System.out.println(result+"\n"+alternateResult);
   int grade = 100;
   System.out.println("I want a grade of "+grade+".");
   System.out.println(grade*2.125);
   double grade2 = grade*2.125;
   System.out.println(grade2);*/
   /*Challenge
    * Modidy this program:
    * Create: 1 boolean, 1 int, 1 double, 1 String with any values.
    * Do some kind of math with the int and double and reset values.
    * print the values before adn after the modification.
    * Print the values again but modify them in the print statement.
    * print the string with some escape characters.
    * print the boolean
    * 
    */
    boolean dooly = true;
    int x = 5;
    double y = 3.14159;
    String array = "Truely outrageous";
    System.out.println(x+" "+y+" "+array);
    
    x = ++x;
    array = "asdf";
    System.out.println(x);
    System.out.println(x/2);
    System.out.println(x*y);
    System.out.println(dooly);
    System.out.println(array);
    String one = "you ";
    String two;
    two = "are ";
    String three = new String("good.");
    System.out.println(one+two+three);
    String four = one+two+three;
    System.out.println(four);
    for (x=0;x<5;x++) {
     System.out.println(x); 
    }
    
    
  }//end main() method
}//end class ModifiedHelloWorld