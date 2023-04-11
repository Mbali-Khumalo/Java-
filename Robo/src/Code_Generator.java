import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Code_Generator {
    private final Random random;
    public Code_Generator() {
        this.random = new Random();
    }
    public String generateCode(){
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int randomDigit = this.random.nextInt(8)+1;
            code.append(randomDigit);
        }
        return code.toString();
    }

}
