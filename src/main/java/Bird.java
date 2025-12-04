public class Bird extends Animal {
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Bird(String name, int age, String type, int position) {
        super(name, age, type, position);
    }

    @Override
    public String animalSound() {
        return "Chirp";
    }

    void move() {
        position = (position + 50);
    }    
}
