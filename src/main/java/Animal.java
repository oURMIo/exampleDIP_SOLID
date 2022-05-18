public abstract class Animal {

    protected final String name;
    protected final boolean danger;

    protected Animal(String name, boolean danger) {
        this.name = name;
        this.danger = danger;
    }

    public void print(){
        if (danger) {
            System.out.printf("I'm a %s and I'm dangerous %n",name);  /* IF CLASS DANGER*/
        } else {
            System.out.printf("I'm a %s and I'm not dangerous %n", name);       /* IF CLASS NOT DANGER*/
        }
    }
}