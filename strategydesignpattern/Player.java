package strategydesignpattern;

public abstract class Player {
    protected String name;
    private boolean defence;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    public Player(String name){
        this.name = name;
        this.setDefenceBehavior();
        this.setOffenceBehavior();
        this.defence = false;
    }

    public abstract void setDefenceBehavior();

    public abstract void setOffenceBehavior();

    public String play(){
        if(this.defence){
            if(this.defenceBehavior==null)
                return "not playing";
            else
                return this.defenceBehavior.play();
        }
        else{
            if(this.offenceBehavior==null)
                return "not playing";
            else
                return this.offenceBehavior.play();
        }
    }

    public void turnover(){
        this.defence = true;
    }
}
