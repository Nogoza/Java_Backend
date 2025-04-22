public class Truck {
    String model;
    int year;
    int loadCapacity;

    Truck(String model, int year, int loadCapacity){
        this.model = model;
        this.year = year;
        this.loadCapacity = loadCapacity;
        System.out.println("Model: " + model + "\nYear: " + year + "\nLoad Capacity: " + loadCapacity);
    }
    Truck(){
        this.model = "Deaful Model";
        this.year = 1;
        this.loadCapacity = 10;
        System.out.println("Default Truck Creating");
    }
    void printInfo(){
        System.out.println("Model: " + model + "\nYear: " + year + "\nLoad Capacity: " + loadCapacity);
    }
}
