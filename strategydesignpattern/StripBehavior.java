package strategydesignpattern;

public class StripBehavior implements DefenceBehavior{
    
    public String play(){
        String strip = "Strip a ball from runners hand";
        return strip;
    }
}
