package Java;
import java.util.Scanner;  // Import the Scanner class

// 1. Check Positive or Negative Number

public class hello{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        try{
            System.out.println("Enter Number...");
            int number = myObj.nextInt();
            if(number >= 0){
                System.out.println("This Number is Positive...");
            }else{
                System.out.println("This Number is Negative...");
            }
        }finally{
            myObj.close();
        }
    }
}