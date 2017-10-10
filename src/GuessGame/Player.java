package GuessGame;

/**
 * Created by mwz16 on 10/10/2017.
 */
public class Player {
    int number = 0; // where guess goes

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }
}
