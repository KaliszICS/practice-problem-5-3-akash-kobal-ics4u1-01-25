public class Bear extends Animal {
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Bear(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    @Override
    public String animalSound() {
        return "Roar";
    }

    @Override
    public void move() {
        position = (position + 1);
    }
}
