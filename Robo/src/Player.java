
import java.io.InputStream;
import java.util.Scanner;
public class Player {
    private final Scanner inputScanner;
    private boolean Off = false;
    private int chances = 12;
    public Player(){
        this.inputScanner = new Scanner(System.in);
    }
    public Player(InputStream inputStream){
        this.inputScanner = new Scanner(inputStream);
    }
    public int getChances() {
        return chances;
    }
    public void lostChance() {
        if(!this.hasNoChances()) {
            chances --;
        }
    }
    public boolean hasNoChances() {
        return this.getChances() == 0;
    }
    public boolean validateGuess(String guess) {
        if (guess.equalsIgnoreCase("quit") || guess.equalsIgnoreCase("exit")) {
            this.Off = true;
            return true;

        } else if (guess.contains("0") || guess.contains("9")) {
            return false;
        } else if (guess.contains("0") || guess.contains("9")) {
            return false;
        } else return convertDigit(guess);
    }

    public boolean convertDigit(String guess){
        try {
            Integer.parseInt(guess);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public String getGuess() {
        System.out.println("Input 4 digit code:");
        String guess = inputScanner.nextLine();
        while(guess.length() != 4 || !validateGuess(guess)){
            System.out.println("Please enter exactly 4 digits (each from 1 to 8).");
            System.out.println("Input 4 digit code:");
            guess = inputScanner.nextLine();
        }
        return guess;
    }
    public boolean wantsToOff(){
        return this.Off;
    }
}
