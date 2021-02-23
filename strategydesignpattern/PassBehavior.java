package strategydesignpattern;
import java.util.Random;

public class PassBehavior implements OffenceBehavior{
    
    public String play(){
        String[] passArray = {"slant route", "out route","seem route","screen pass", "hail mary"};
        Random r = new Random();
        int index = r.nextInt(passArray.length);
        //int index = (int)Math.random()*5;
        return "throws a "+passArray[index];
    }
}
