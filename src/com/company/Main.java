package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // PROJECT PROBLEM STATEMENT
      /*
       * Write a program to create Console based Calculator which should perform
       * various function like Addition,
       * Subtraction, Multiplication, Division, Power, Square, Cube, Square root,
       * round, ceiling, floor, Min Value, Max
       * Value, sin, cos, asin, acos, atan, exponential, Palindrome, Armstrong number,
       * Prime number, Average (first
       * take the input the number of entries expected and then calculate the
       * average), GCD (of two numbers),
       * LCM(of two number.The list of option must be stated on the console based
       * application which should not
       * terminate the program until last option exit is selected.
       */

      // Option is the list of functions to be performed
      int option;
      Calculator application = new Calculator();
      /*
       * The try-catch block is an Exception handler in Java and it checks if a user
       * enters an invalid value
       * as an input, and throws back a message telling the user to enter a valid
       * option
       */
      try {
         // The do-while loop was applied to keep the program running until the user
         // exits the program.
         do {
            // Creating objects of the scanner class
            Scanner option_input = new Scanner(System.in);
            System.out.println(
                  "Welcome, please choose one of the following operations you'll like to perform: \n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Power\n 6. Square\n 7. Cube\n 8. Square Root\n 9. Round\n 10. Ceiling\n 11. Floor\n 12. Min Value\n 13. Max Value\n 14. sin\n 15. cos\n 16. tan\n 17.asin\n 18. acos\n 19. atan\n 20. Exponential\n 21. Palindrome \n 22. Armstrong Number\n 23. Prime Number\n 24. Average Number\n 25. GCD\n 26. LCM\n 27. Exit\n");
            // Reading the number inputed by the user
            option = option_input.nextInt();
            /*
             * The switch-case statement is used for the decision-making process of the
             * program
             * Each operation is assigned to a case.
             */
            switch (option) {
               /*
                * If the user chooses the option 1 , the input method will run
                * first before the add method both fulfilling the addition function
                */
               case 1:
                  application.addition();
                  break;
               /*
                * If the user chooses the option 2 , the input method will run
                * first before the subtract method both fulfilling subtraction function
                */
               case 2:
                  application.subtraction();
                  break;
               /*
                * If the user chooses the option 3 , the input method will run
                * first before the multiply method both fulfilling the multiplication function
                */
               case 3:
                  application.multiplication();
                  break;
               /*
                * If the user chooses the option 4, the input method will run
                * first before the division method both fulfilling the division function
                */
               case 4:
                  application.division();
                  break;
               /*
                * If the user chooses the option 5, the input method will run
                * first before the power method both fulfilling the power function
                */
               case 5:
                  application.power();
                  break;
               /*
                * If the user chooses the option 6, the input method will run
                * first before the square method both fulfilling the square function
                */
               case 6:
                  application.square();
                  break;
               /*
                * If the user chooses the option 7, the input method will run
                * first before the cube method both fulfilling the cube function
                */
               case 7:
                  application.cube();
                  break;
               /*
                * If the user chooses the option 8, the input method will run
                * first before the square root method both fulfilling the square root function
                */
               case 8:
                  application.square_root();
                  break;
               /*
                * If the user chooses the option 9, the input method will run
                * first before the round method both fulfilling the round function
                */
               case 9:
                  application.round();
                  break;
               /*
                * If the user chooses the option 10, the input method will run
                * first before the ceiling method both fulfilling the ceiling function
                */
               case 10:
                  application.ceiling();
                  break;
               /*
                * If the user chooses the option 11, the input method will run
                * first before the floor method both fulfilling the floor function
                */
               case 11:
                  application.floor();
                  break;
               /*
                * If the user chooses the option 12, the input method will run
                * first before the min value method both fulfilling the min value function
                */
               case 12:
                  application.min_value();
                  break;
               /*
                * If the user chooses the option 13 , the input method will run
                * first before the max value method both fulfilling the max value function
                */
               case 13:
                  application.max_value();
                  break;
               /*
                * If the user chooses the option 14 , the input method will run
                * first before sin add method both fulfilling the sin function
                */
               case 14:
                  application.sin();
                  break;
               /*
                * If the user chooses the option 15 , the input method will run
                * first before the cos method both fulfilling the cos function
                */
               case 15:
                  application.cos();
                  break;
               /*
                * If the user chooses the option 16 , the input method will run
                * first before the tan method both fulfilling the tan function
                */
               case 16:
                  application.tan();
                  break;
               /*
                * If the user chooses the option 17 , the input method will run
                * first before the asin method both fulfilling the asin function
                */
               case 17:
                  application.asin();
                  break;
               /*
                * If the user chooses the option 18 , the input method will run
                * first before the acos method both fulfilling the acos function
                */
               case 18:
                  application.acos();
                  break;
               /*
                * If the user chooses the option 19 , the input method will run
                * first before the atan method both fulfilling the atan function
                */
               case 19:
                  application.atan();
                  break;
               /*
                * If the user chooses the option 20 , the input method will run
                * first before the exponential method both fulfilling the exponential function
                */
               case 20:
                  application.exponential();
                  break;
               /*
                * If the user chooses the option 21 , the input method will run
                * first before the palindrome method both fulfilling the palindrome function
                */
               case 21:
                  application.palindrome();
                  break;
               /*
                * If the user chooses the option 22 , the input method will run
                * first before the armstrong number method both fulfilling the armstrong number
                * function
                */
               case 22:
                  application.armstrong_number();
                  break;
               /*
                * If the user chooses the option 23 , the input method will run
                * first before the prime number method both fulfilling the prime number
                * function
                */
               case 23:
                  application.prime_number();
                  break;
               /*
                * If the user chooses the option 24 , the input method will run
                * first before the average number method both fulfilling the average number
                * function
                */
               case 24:
                  application.average_number();
                  break;
               /*
                * If the user chooses the option 25 , the input method will run
                * first before the GCD method both fulfilling the GCD function
                */
               case 25:
                  application.gcd();
                  break;
               /*
                * If the user chooses the option 26 , the input method will run
                * first before the LCM method both fulfilling the LCM function
                */
               case 26:
                  application.lcm();
                  break;
               /*
                * If the user chooses the option 27 ,the loop running over the program will end
                * causing the program to exit.
                */
               case 27:
                  System.out.println("Thank you for using our application.");
                  ;
                  break;
            }
         } while (option != 27);
      } catch (Exception e) {
         /* The message to be thrown to the user when an invalid input is entered */
         System.out.println("Please choose from the options given");
      }

   }

}
