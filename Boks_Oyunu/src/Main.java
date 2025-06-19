public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Tarık", 50, 100, 70);
        Fighter fighter2 = new Fighter("Kerem", 35, 100, 70);

        Match match = new Match(fighter1, fighter2, 65, 75);
        match.run();
    }
}