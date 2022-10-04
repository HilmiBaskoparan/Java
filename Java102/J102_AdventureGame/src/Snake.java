
import java.util.Random;

public class Snake extends Monster{
    private static Random random = new Random();
    private static int possRn = random.nextInt(20);
    
    public Snake() {
        super(4, "Snake", 5, 12, possRn);
    }
    
}
