package strategydesignpattern;

public class QuarterBack extends Player {
    
    public QuarterBack(String name){
        super(name); 
    }
    public void setOffenceBehavior(){
        int OB = (int)Math.random()*2;
        if(OB == 0)
            offenceBehavior = new RunBehavior();
        else
            offenceBehavior = new PassBehavior();
    }

    public void setDefenceBehavior(){
        defenceBehavior = null;
    }
}
