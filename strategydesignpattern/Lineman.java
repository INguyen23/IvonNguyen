package strategydesignpattern;

public class Lineman extends Player{
    
    public Lineman(String name){
        super(name);
    }

    public void setOffenceBehavior(){
        offenceBehavior = new OBlockBehavior();
    }

    public void setDefenceBehavior(){
        int DB = (int)Math.random()*3;
        if(DB == 0)
            defenceBehavior = new BlockBehavior();
        else if(DB == 1)
            defenceBehavior = new StripBehavior();
        else 
            defenceBehavior = new SackBehavior();
    }
}
