public class Wolf extends Animal implements Cage{
    public Wolf() {
        super("Wolf",true);
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