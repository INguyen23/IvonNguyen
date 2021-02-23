package strategydesignpattern;
import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
    
    public String play() { 
        String[] blockArray = {"kick", "punt","pass","catch"};
        Random r=new Random();
        int index = r.nextInt(blockArray.length);
        //int index = (int)Math.random()*4;
        return "blocks a "+blockArray[index];
    }
}
