
import java.util.Random;
import java.util.Scanner;

public class stonePaperScissors {
    public static void main(String[] args) {
        
        Random num = new Random();
        int randomNumber = num.nextInt(3);
        // System.out.println(randomNumber);

        System.out.println("Enter 0 for Stone");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissors");
        
        Scanner scn = new Scanner(System.in);
        int userInput = scn.nextInt();
        
        // System.out.println("You have selected: " + userInput);
        
        
        if(userInput==0){
            System.out.println("You have choosen STONE. ");
        }
        if(userInput==1){
            System.out.println("You have choosen PAPER. ");
        }
        if(userInput==2){
            System.out.println("You have choosen SCISSORS. ");
        }



        if(randomNumber==0){
            System.out.println("The computer has selected STONE. ");
        }
        if(randomNumber==1){
            System.out.println("The computer has selected PAPER. ");
        }
        if(randomNumber==2){
            System.out.println("The computer has selected SCISSORS. ");
        }
        
        

        if(randomNumber>userInput){
            System.out.println("COMPUTER HAS WON!! ");
        }
        if(randomNumber<userInput){
            System.out.println("HURRAY!! PLAYER HAS WON..");
        }
        if(randomNumber==userInput){
            System.out.println("Opps!! MATCH DRAW..");
        }
        
        
    }
    
    
}
