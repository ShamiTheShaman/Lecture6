public class Main {
    public static void main(String[] args) {

        Computer pc = new Computer();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Coin coin1 = new Coin();
        Dog rex = new Dog();

        System.out.println(pc.turnOn());
        System.out.println(pc.turnOff());
        System.out.println("Total Dice roll is: " + (dice1.roll()+dice2.roll()));
        System.out.println("Coin Flipped: "+ coin1.flip());
        System.out.println(rex.ageToHuman());
    }
}