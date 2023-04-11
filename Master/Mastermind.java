

public class Mastermind {
    private final String code;
    private final Player player;

    public Mastermind(CodeGenerator generator, Player player){
        this.code = generator.generateCode();
        this.player = player;
    }

    public Mastermind() {
        this(new CodeGenerator(), new Player());
    }

    public void runGame(){

    }

    public static void main(String[] args){
        Mastermind game = new Mastermind();
        game.runGame();
    }
}