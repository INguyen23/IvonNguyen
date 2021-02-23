package strategydesignpattern;
import java.util.Random;

public class RunBehavior implements OffenceBehavior{
    
    public String play(){
        String[] runArray = {"drive(up the gut)", "draw","pinch","reverse"};
        Random r =new Random();
        int index = r.nextInt(runArray.length);
        //int index = (int)Math.random()*4;
        return "runs a "+runArray[index];
    }
}
