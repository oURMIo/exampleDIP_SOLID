public class Dog extends Animal implements Cage{
    public Dog() {
        super("Dog", false);
    }

    @Override
    public void sendCage(Animal animal) {
        System.out.printf("Send it in ");
        if (animal.danger){
            System.out.printf(" specially cage %n %n");
        } else {
            System.out.printf(" usually cage %n %n");
        }
    }
}