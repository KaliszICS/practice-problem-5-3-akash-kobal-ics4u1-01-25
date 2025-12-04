public class Cat extends Animal {
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Cat(String name, int age, String type, int position) {
        super(name, age, type, position);
    }
    
    @Override
    public String animalSound() {
        return "Meow";
    }
    
    @Override
    public void move() {
        position = (position + 5);
    }    
}
