package Java;
import java.util.Scanner;  // Import the Scanner class

// 1. Check Positive or Negative Number

public class hello{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        // try{
        //     System.out.println("Enter Number...");
        //     int number = myObj.nextInt();
        //     if(number >= 0){
        //         System.out.println("This Number is Positive...");
        //     }else{
        //         System.out.println("This Number is Negative...");
        //     }
        // }finally{
        //     myObj.close();
        // }

        // Find Greatest Among Three Numbers

        // try{
        //     System.out.println("Enter First Number...");
        //     int num1 = myObj.nextInt();
        //     System.out.println("Enter Second Number...");
        //     int num2 = myObj.nextInt();
        //     System.out.println("Enter Third Number...");
        //     int num3 = myObj.nextInt();
        //     if(num1>=num2 && num1>=num3){
        //         System.out.println("First Number is Greatest...");
        //     }else if(num2>=num1 && num2>=num3){
        //         System.out.println("Second Number is Greatest...");
        //     }else{
        //         System.out.println("Third Number is Greatest...");
        //     }
        // }finally{
        //     myObj.close();
        // }


        // Write a Java program to determine if a given number is even or odd using an if-else statement.

        // try{
        //     System.out.println("Enter Number");
        //     int num = myObj.nextInt();
        //     if(num%2==0){
        //         System.out.println("This number is EVEN...");
        //     }else{
        //         System.out.println("This number is ODD...");
        //     }
        // }finally{
        //     myObj.close();
        // }

        // Write a Java program to check if a given year is a leap year using an if-else statement.

        try{
            System.out.println("Enter Year");
            int year = myObj.nextInt();
            if(year>365 && year<367){
                System.out.println("This is Leap Year...");
            }else{
                System.out.println("This is Normal Year...");
            }
        }finally{
            myObj.close();
        }

    }
}