public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf();

        dog.print();
        dog.sendCage(new Dog());

        wolf.print();
        wolf.sendCage(new Wolf());
    }
}