public class Match {
    Fighter fighter1;
    Fighter fighter2;

    int minWeight;
    int maxWeight;

    Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    void run(){
        if(isCheck()){
            while(this.fighter1.health > 0 && this.fighter2.health > 0){
                this.fighter2.health = this.fighter1.hit(this.fighter2);
                System.out.println("" + this.fighter2.health);
                fighter1.health = fighter2.hit(fighter1);
                if(this.fighter1.health > 0 && this.fighter2.health > 0){
                    System.out.println("the fighth continues");
                }else{
                    System.out.println("the fighth does not continue");
                    break;
                }

            }

        }else{
            System.out.println("Sporcuların Sikletleri Uymuyor");
        }
    }
    public boolean isCheck(){
        return (fighter1.weight >= minWeight && fighter1.weight <= maxWeight) && (fighter2.weight >= minWeight && fighter2.weight <= maxWeight);
    }
}