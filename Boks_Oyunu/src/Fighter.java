public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }
    int hit(Fighter foe){
        System.out.println("-" + this.name + "- " + foe.name + " dealt " + this.damage + " damage");
        return foe.health - this.damage;
    }
}


public class Fighter{
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }
    int hit(Fighter foe){
        System.out.print("-" + this.name + foe.name + " dealt " + this.damage + " damage");
        return foe.health - this.damage;
    }
}