import java.io.InputStream;
import java.util.Scanner;

public class Player {
    private final Scanner inputScanner;

    public Player() { this.inputScanner = new Scanner(System.in);}

    public Player(InputStream inputStream){
        this.inputScanner = new Scanner(inputStream);
    }

    public String getGuess() {
        return null;
    }
}
