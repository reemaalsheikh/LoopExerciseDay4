import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // Loop Exercise

   /* 1.Write a program that prints the numbers from 1 to 100 such that:
If the number is a multiple of 3, you need to print "Fizz" instead of that number.
If the number is a multiple of 5, you need to print "Buzz" instead of that number.
If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
*/
         /* for (int i = 1; i <= 100; i++) {

            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }

            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%3==0){
                System.out.println("Fuzz");
            }
           else {
                System.out.println(i);}  } */



/*2.Write a Java program to reverse a string.
Test Data: Input a string: The quick brown fox
Expected Output: Reverse string: xof nworb kciuq ehT
 */
     /*   String inputString= "The quick brown fox";
        String reversedString = "";

        for (int i = inputString.length()-1; i >=0; i--) {
            reversedString += inputString.charAt(i);

        }
        System.out.println("Reverse string: "+reversedString); */


        /* 3.Write a program to find the factorial value of any number entered through the keyboard. */

       /* System.out.println("Please enter a number:   ");
        int number= input.nextInt();
        long factorial =1;
        for (int i = 1; i<= number ; i++) {
            factorial *= i;
        }
        System.out.println(factorial); */


        /*4.Two numbers are entered through the keyboard.
        Write a program to find the value of one number raised to the power of another.
        (Do not use Java built-in method) */

      /*  System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("Please enter another number: ");
        int exponent = input.nextInt();

        long result=1;
        for (int i = 1; i <= exponent ; i++) {
            result *= number;
        }
        System.out.println(result); */



        /* 5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.*/

       /* int even=0;
        int odd=0;
        int number;

        System.out.println("Please Enter a number (Enter 0 to see the results):");

        do{
            number = input.nextInt();
            if (number%2==0) {
                even+=number;
            } else{
                odd+=number;
            }

        }
        while (number!=0);
        System.out.println("Sum of even numbers: "+even);
        System.out.println("Sum of odd numbers: "+odd);
        */




        /*6.Write a program that prompts the user to input a positive integer.
         It should then output a message indicating whether the number is a prime number. */


       /* System.out.println("Please enter a positive number: ");
        int pnumber = input.nextInt();
        boolean prime= true;

        if(pnumber == 1){
            prime = false;
        }
        else {
            for (int i = 2; i <= pnumber/2; i++) {
            if (pnumber %i == 0){
                prime= false;}
        }}
        if(prime){
            System.out.println("The number you entered is a prime number");
        }else{
            System.out.println("The number you entered is not a prime number"); } */


        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4).
        Then use another for loop to print the days (Days 1 -7) for each week.
        Expected Output:
        Week 1 Day1 Day2 Day3 Day4 Day5 Day6 Day7 Week 2 Day1 Day2 ... */

        // Loop for weeks (1 to 4)
       /*  for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + " ");

            // Loop for days (1 to 7)
            for (int day = 1; day <= 7; day++) {
                System.out.println("Day" + day + " ");
            }
        } */

        /*8.Write a program thats check if the word is a palindrome or not.
         hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left. */

      /*  System.out.println("Please enter a word: ");
        String word = input.nextLine();
        boolean palindrome = true;
        int length = word.length();
        for (int i = 0; i < length/2; i++) {
            if (word.charAt(i) != word.charAt(length-i-1)) {
                palindrome = false;  }}
        if (palindrome) {
            System.out.println(word + " is a palindrome.");
        }else {
            System.out.println(word + " is not a palindrome.");
        } */


    }
}