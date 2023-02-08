package Sl;

import java.util.Scanner;

//User Input
//Scanner enables you to take input
//System.in(takes in input) and System.out(gives you the output)
//myObject is a variable. you can use scan as a variable aswell.
//String in at line 14 tells the user input that we are using string, you can change it into any data type you want
public class Index {
    public static void main(String[] args){
        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter your name");
        String user_input_string = myObject.next();
        System.out.print("Hello ");
        System.out.print(user_input_string);
    }
}
