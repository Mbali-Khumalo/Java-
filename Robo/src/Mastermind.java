public class Mastermind {
    private final String code;
    private final Player player;
    public Mastermind(Code_Generator generator, Player player){
        this.code = generator.generateCode();
        this.player = player;
    }

    public Mastermind(){
        this(new Code_Generator(), new Player());
    }
    public void runGame(){
        System.out.println("4-digit Code has been set. Digits in range 1 to 8. You have 12 turns to break it.");
        while (true) {
            String guess = player.getGuess();
            if (player.wantsToOff()){
                System.out.println("Bye");
                break;
            }
            int correctNumber = 0;
            int wrongPlace = 0;

            for (int i = 0; i < code.length(); i++) {
                char codeNum = code.charAt(i);
                for (int j = 0; j < guess.length(); j++) {
                    char guessNum = guess.charAt(j);
                    if (codeNum == guessNum && i == j) {
                        correctNumber += 1;
                    } else if (codeNum == guessNum) {
                        wrongPlace += 1;
                    }
                }
            }
            System.out.println("Number of correct digits in correct place: " + correctNumber);
            System.out.println("Number of correct digits not in correct place: " + wrongPlace);

            if (guess.equals(code)){
                System.out.println("Congratulations! You are a codebreaker!");
                System.out.println("The code was: " + code);
                break;
            } else if (player.hasNoChances()) {
                System.out.println("No more turns left.");
                System.out.println("The code was: " + code);
                break;
            } else {
                player.lostChance();
                System.out.println("Turns left: " + player.getChances());
            }
        }
    }
    public static void main(String[] args){
        Mastermind game = new Mastermind();
        game.runGame();
    }
}

