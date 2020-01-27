import java.util.Scanner;


import java.util.Scanner;

class CmdCalculator {
   public static void main(String args[]){
      Scanner MyScanner = new Scanner(System.in);
      double No1,No2,Answer;
     
   }
}
class CmdCalculator {
   public static void main(String args[]){
      Scanner MyScanner = new Scanner(System.in);
      double No1,No2,Answer;
     
      System.out.print("Enter The No1 : ");
      No1 = MyScanner.nextDouble();

      System.out.print("Enter The No2 : ");
      No2 = MyScanner.nextDouble();

      Answer = No1 + No2;
      System.out.println("Addition Is : ");
      System.out.print(Answer);

      Answer = No1 - No2;
      System.out.println("Subtraction Is : ");
      System.out.print(Answer);

      Answer = No1 / No2;
      System.out.println("Division Is : ");
      System.out.print(Answer);

      Answer = No1 * No2;
      System.out.println("Multiplication Is : ");
      System.out.print(Answer);
   }
}