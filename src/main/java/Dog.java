public class Dog implements Cage{
    String name = "Dog";
//    boolean danger = false;

    @Override
    public void sendCage(Cage cage) {
        System.out.printf(" It's a %s. send it in usually cage %n", name);
    }
}