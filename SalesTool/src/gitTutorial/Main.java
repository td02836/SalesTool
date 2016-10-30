package gitTutorial;

public class Main {

   public static void main(String[] args) {
       SalesData data = new SalesData();
       
       displayGreeting();
       data.display();
   } //End main


  private static void displayGreeting() {
           System.out.println("HELLO HAPPY SALES PEOPLE!");
           System.out.println("THIS APP SHOWS SALES DATA");
           
           System.out.println("Test 1");
  } //End displayGreeting

}  //End class Main