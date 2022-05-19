public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf();

        dog.sendCage(new Cage() {
            @Override
            public void sendCage(Cage cage) {

            }
        });

        wolf.sendCage(new Cage() {
            @Override
            public void sendCage(Cage cage) {

            }
        });
    }
}