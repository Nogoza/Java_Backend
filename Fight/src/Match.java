public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run(){
        if(isCheck()){

        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight);
        
    }
}
