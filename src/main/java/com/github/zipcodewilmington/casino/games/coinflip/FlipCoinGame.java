package com.github.zipcodewilmington.casino.games.coinflip;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Random;
import java.util.Scanner;

public class FlipCoinGame implements GameInterface {
    int heads = 2;
    int tails = 1;
    PlayerInterface player;
    static Random random = new Random();

    //        System.out.println("Howdy! Thanks for playing Coin Flip. If you have a gambling addiction please call 1-800-GAMBLER");
//        System.out.println("How Much would you like to bet?");
//        System.out.println("Type 2 for Heads or 1 for Tails. Choose wisely...");

    public static int flipCoin(int heads, int tails) {

        int flipCoin = random.nextInt(2)+1;

        if(flipCoin == 2){
            return heads;
        }
        else return tails;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("\n" +
//                " _____  _  _          ____          _         \n" +
//                "|___  || |(_)  __ _  |___ \\   ___  (_)  __ _  \n" +
//                "   _| || || | / _` |     | | / _ \\ | | / _` | \n" +
//                "  |_  || || || (_| |  ___| || (_) || || | | | \n" +
//                "    |_||_||_| \\__, | |____/  \\___/ |_||_| |_| \n" +
//                "                 |_|                          \n");
//
//        System.out.println("Howdy! Thanks for playing Coin Flip. If you have a gambling addiction please call 1-800-GAMBLER");
//        System.out.println("How Much would you like to bet?");
//        int userInput = scanner.nextInt();
//        System.out.println("Type 2 for Heads or 1 for Tails. Choose wisely...");
//
//        int userInput2 = scanner.nextInt();
//        int randNumber = random.nextInt(2)+1;
//        if(userInput2 == 1){
//            System.out.println("You guessed Tails, I hope you ain't fail.");
////            return userInput;
//        }
//        else if(userInput2 ==2) {
//            System.out.println("You guessed Heads for the bread.");
////            return userInput;
//        }
//        else return tails;
//
//
//
//////        if(randNumber >1){
//////            System.out.println("The coin landed on Heads!");
////        return heads;
////
////        }
////        System.out.println("The coin landed on Tails!");
//
//
//        if(randNumber == 1) {
//            System.out.println("The coin landed on Tails!");
//
//            }
//        else{ System.out.println("The coin landed on Heads.");
//        }
//        if (userInput2 == randNumber){
//            System.out.println("Bingo! Your guess was correct! You won " + "$"+ (userInput * 2));
//            return userInput;
//        }
//        System.out.println("Sorry wrong guess :(");
//        return tails;
//
    }


    public static int playFlipCoin(int heads, int tails){
        Scanner scanner = new Scanner(System.in);


        System.out.println("\n" +
                " _____  _  _          ____          _         \n" +
                "|___  || |(_)  __ _  |___ \\   ___  (_)  __ _  \n" +
                "   _| || || | / _` |     | | / _ \\ | | / _` | \n" +
                "  |_  || || || (_| |  ___| || (_) || || | | | \n" +
                "    |_||_||_| \\__, | |____/  \\___/ |_||_| |_| \n" +
                "                 |_|                          \n");

        System.out.println("Howdy! Thanks for playing Coin Flip. If you have a gambling addiction please call 1-800-GAMBLER");
        System.out.println("How Much would you like to bet?");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter a number");
        }
        int userInput = scanner.nextInt();
        System.out.println("Type 2 for Heads or 1 for Tails. Choose wisely...");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Please enter a number");
        }
        int userInput2 = scanner.nextInt();
        int randNumber = random.nextInt(2)+1;
        if(userInput2 == 1){
            System.out.println("You guessed Tails, I hope you ain't fail.");
//            return userInput;
        }
        else if(userInput2 ==2) {
            System.out.println("You guessed Heads for the bread.");
//            return userInput;
        }
        else return tails;



////        if(randNumber >1){
////            System.out.println("The coin landed on Heads!");
//        return heads;
//
//        }
//        System.out.println("The coin landed on Tails!");


        if(randNumber == 1) {
            System.out.println("The coin landed on Tails!");

        }
        else{ System.out.println("The coin landed on Heads.");
        }
        if (userInput2 == flipCoin(2,1)){
            System.out.println("Bingo! Your guess was correct! You won " + "$"+ (userInput * 2));
            return userInput;
        }
        System.out.println("Sorry wrong guess :(");
        return tails;


    }


    public boolean playerWinsOrLose() {

//        CoinFlipPlayer coinFlipPlayer = new CoinFlipPlayer;
//
//    if(flipCoin(2,1) )
        return false;
    }







    public static void main(String[] args) {




        playFlipCoin(2,1);
//        System.out.println("\n" +
//                " _____  _  _          ____          _         \n" +
//                "|___  || |(_)  __ _  |___ \\   ___  (_)  __ _  \n" +
//                "   _| || || | / _` |     | | / _ \\ | | / _` | \n" +
//                "  |_  || || || (_| |  ___| || (_) || || | | | \n" +
//                "    |_||_||_| \\__, | |____/  \\___/ |_||_| |_| \n" +
//                "                 |_|                          \n");
//
//                System.out.println("Howdy! Thanks for playing Coin Flip. If you have a gambling addiction please call 1-800-GAMBLER");
//        System.out.println("How Much would you like to bet?");
//        System.out.println("Type 2 for Heads or 1 for Tails. Choose wisely...");

    }


    @Override
    public void add(PlayerInterface player) {
        this.player = player;

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {
//        flipCoin(1,2);
        Scanner scanner = new Scanner(System.in);
        String playAgain = "y";
        do {

            playFlipCoin(2, 1);
            System.out.println("Would you like to play again? y/n");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("y"));
        System.out.println("\n" +
                " _____  _  _          ____          _         \n" +
                "|___  || |(_)  __ _  |___ \\   ___  (_)  __ _  \n" +
                "   _| || || | / _` |     | | / _ \\ | | / _` | \n" +
                "  |_  || || || (_| |  ___| || (_) || || | | | \n" +
                "    |_||_||_| \\__, | |____/  \\___/ |_||_| |_| \n" +
                "                 |_|                          \n");

//        System.out.println( System.out.println("\n" +
//                " _____  _  _          ____          _         \n" +
//                "|___  || |(_)  __ _  |___ \\   ___  (_)  __ _  \n" +
//                "   _| || || | / _` |     | | / _ \\ | | / _` | \n" +
//                "  |_  || || || (_| |  ___| || (_) || || | | | \n" +
//                "    |_||_||_| \\__, | |____/  \\___/ |_||_| |_| \n" +
//                "                 |_|                          \n");
    }

    @Override
    public void addCasinoAccount(CasinoAccount casinoAccount) {

    }
}
