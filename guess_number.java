import java.io.*;
import java.util.Scanner;
import java.util.Random;

class guess_number {

    public static void main(String [] args){
       Scanner rd = new Scanner(System.in);
       String play = "yes";

// While loop to determine if we are going to play game again. 
       while(play.equals("yes")){

        Random rand = new Random();
        int randnum = rand.nextInt(100);
        int user_guess = -1;
        int user_tries = 0;
        System.out.println("\n......Let's play the game......\n");

        // while loop to check if game is over.
        while(user_guess != randnum){

           System.out.println("I'll pick a number between");
           System.out.println("1 and 100, and you try to guess it: ");

           user_guess = rd.nextInt();
           user_tries++;

           if(user_guess == randnum){
            System.out.println("Very nice! You guessed the number!! ");
            System.out.println("You got it in " + user_tries + " guesses!");
            System.out.println("Would you like to play again? Yes/No");
            play = rd.next().toLowerCase();
           }

           else if(user_guess > randnum){
            System.out.println("That's too high.  Try again:");        
           }

            else {
            System.out.println("That's too low.  Try again:");        
           }
        }
     }
       rd.close();
    }
}

