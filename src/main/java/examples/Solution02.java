/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Detrich Lange
 */

package examples;
import java.util.Scanner;

/*
Create a program that prompts for an input string and displays output that shows the input string and the number
of characters the string contains.
    Be sure the output contains the original string.
    Use a single output statement to construct the output.
    Use a built-in function of the programming language to determine the length of the string.

    1. Prompt the user to input a string
    2. Save input string to variable Userinput
    3. Print message consisting of string + " is " + Userinput.length() " characters long."
 */

public class Solution02
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Please enter a string");
        String Userinput = input.nextLine();

        System.out.printf(Userinput + " is " + Userinput.length() + " characters long.");
    }
}
