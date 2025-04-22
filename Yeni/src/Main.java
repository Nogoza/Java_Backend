public class Main {
    public static void main(String[] args) {

        // Parametreli constructor kullanımı
        Car audi = new Car("Audi", 90);
        audi.color = "Red";
        audi.decreaseSpeed(10);
        audi.printSpeed();

        System.out.println("------------------");

        Car BMW = new Car("Otomatik", "BMW", "Mavi", 50);
        BMW.decreaseSpeed(10);
        BMW.printSpeed();

        System.out.println("------------------");


        // Parametresiz constructor kullanımı
        Car MercedesCar = new Car();
        MercedesCar.type = "Otomatik";
        MercedesCar.model = "Mercedes";
        MercedesCar.color = "Blue";
        MercedesCar.Speed = 12;
        MercedesCar.decreaseSpeed(5);
        MercedesCar.printSpeed();

        System.out.println("------------------");

        // Bilgileri yazdır
        audi.printInfo();
        System.out.println("------------------");
        MercedesCar.printInfo();

        System.out.println("-----------------");

        Truck MercedesTruck = new Truck("Mercedes", 9, 23);
        MercedesTruck.printInfo();

        Truck Aravan = new Truck();


        }


    }
}
