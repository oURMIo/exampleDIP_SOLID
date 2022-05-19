public class Wolf implements Cage{
    String name = "Wolf";
//    boolean danger = false;

    @Override
    public void sendCage(Cage cage) {
        System.out.printf(" It's a %s. send it in specially cage %n", name);
    }
}