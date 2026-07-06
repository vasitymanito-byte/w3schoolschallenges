/* 4. Number Guessing Game
Difficulty: Beginner Skills and Technologies

Core Java
JavaFX for GUI
Random Class
Event Handling
Project Overview: Build a simple game where players guess a number within a range and limited attempts. Learn basic Java logic and GUI development.

Key Features:

Generate random numbers for guessing.
Display feedback ("Too High" or "Too Low").
Track remaining attempts and game status.
Simple GUI for user input and results.
Learning Outcomes:

Use Java’s Random class and control structures.
Create a basic GUI with JavaFX.
Handle user input and game logic.
Recommended Tech Stack:

Core Java, JavaFX  */

import java.util.*;


public class NumberGuessingGame {
    public static void main (String[] args){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please enter your name: ");
    String name = input.next();
    int randomnumber = rand.nextInt(100) + 1;
    // System.out.println("Random number is: "+ randomnumber);
    int trycount = 0;
    while(true){

    System.out.println("Enter your guess(1-100): ");
    int guessplayer = input.nextInt();
    trycount++;

    if(guessplayer == randomnumber){
        System.out.println("Good job!");
        System.out.println("It took you "+ trycount + " tries");
        break;
    }else if (randomnumber > guessplayer){
        System.out.println("Too Low");
    }else{
        System.out.println("Too high");
    }
}
        input.close();

    }
}
