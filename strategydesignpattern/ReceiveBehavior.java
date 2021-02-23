package strategydesignpattern;
import java.util.Random;

public class ReceiveBehavior implements OffenceBehavior{
    
    public String play(){
        String[] runArray = {"slant route", "out route","seem route","screen pass", "hail mary"};
        Random r=new Random();
        int index = r.nextInt(runArray.length);
        //int index = (int)Math.random()*5;
        return "runs a "+runArray[index];
    }
}
