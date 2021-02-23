package strategydesignpattern;

public class SackBehavior implements DefenceBehavior {
    
    public String play(){
        String sack = "sack the quarterback";
        return sack;
    }
}
