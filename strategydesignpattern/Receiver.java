package strategydesignpattern;

public class Receiver extends Player{
    
    public Receiver(String name){
        super(name);
    }

    public void setOffenceBehavior(){
        offenceBehavior = new ReceiveBehavior();
    }

    public void setDefenceBehavior(){
        defenceBehavior = null;
    }
}
