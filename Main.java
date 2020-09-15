 import java.util.Scanner;

/**
 * This program puts numbers in order
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  //creates a scanner for user input
  Scanner input = new Scanner(System.in); 

  //prompt user for their numbers 
  System.out.println("Please enter an integer");
  int integer = input.nextInt(); 
  System.out.println("please enter your second integer");
  int secondInteger = input.nextInt(); 

  //determine how the numbers will ascend in order
  if(integer >= secondInteger){
    System.out.println(" your numbers in ascending order are " + secondInteger + "," +integer);
  }else{ 
    System.out.println(" your numbers in ascending order are " + integer+ "," + secondInteger);
  }
    

    
  }
}
