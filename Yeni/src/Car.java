public class Car {
    String type;
    String model;
    String color;
    int Speed;
    int SpeedLimit = 180;
    int MinSpeed = 0;

    // Parametreli Constructor
    Car(String model, int Speed) {
        this.model = model;
        this.Speed = Speed;
        System.out.println("Model: " + this.model + " Speed: " + this.Speed);
    }

    Car(String type, String model, String color, int Speed){
        this.type = type;
        this.model = model;
        this.color = color;
        this.Speed = Speed;
        System.out.println("Type: " + type + "\nModel: " + model + "\nColor: " + color + "\nSpeed: " + Speed);
    }

    // Parametresiz Constructor
    Car() {
        this.model = "Default Model";
        this.Speed = 0;
        System.out.println("Default Car Created");
    }

    void increaseSpeed(int increment) {
        if ((increment + Speed) <= SpeedLimit) {
            Speed += increment;
        } else {
            System.out.println("SpeedLimit exceeded");
        }
    }

    void decreaseSpeed(int decrement) {
        if ((Speed - decrement) >= MinSpeed) {
            Speed -= decrement;
        } else {
            System.out.println("Speed cannot be below " + MinSpeed);
        }
    }

    void printSpeed() {
        System.out.println(model + " Speed: " + Speed);
    }

    void printInfo() {
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + Speed);
    }
}
