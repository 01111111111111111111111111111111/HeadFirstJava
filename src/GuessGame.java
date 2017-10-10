/*
Michael
Created 10/10/2017
GuessGame involves use of Object-oriented programming--objects to objects
Rand number gen betw 0 to 9 where 3 players attempt to guess number
*/

public class GuessGame { // GuessGame with three objects/instances for three Players
    Player p1;
    Player p2;
    Player p3;

    public void startGame() { //three Player objects and assigned to three Player instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; // placeholders for players' guesses
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; //right or wrong for each player's number
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); //using Math class to gen random number to guess for
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {

            System.out.println("Number to guess is " + targetNumber);

            p1.guess(); //invokes guess method to each player's number
            p2.guess();
            p3.guess();

            System.out.println("");

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1); //receive players' guesses; access number var of each player

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guess " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true; //toggles boolean var to hold true to player's guess
            }

            if (guessp2 == targetNumber) {
                p2isRight = true;
            }

            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { //in the event, checking if at least ONE of the players is right... || meaning OR

                System.out.println("");
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("");
                System.out.println("//////// GAME OVER ////////");
                break; //game done; get out of loop

            } else {

                System.out.println("Players will want to guess again!"); //else loop: all three guesses wrong, prompt to try again
                System.out.println("");
            }

        }
    }
}
