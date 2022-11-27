package class_object;

public class Animal {
    public Animal(){}

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore,boolean isOmnivore){
        this(name, age); // can use constructor in constructor but has to be the first statement - constructor channing
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        //Animal animal1 = new Animal();
        //Animal animal2 = new Animal("Dog", 3);
        //Animal animal3 = new Animal("Cow", 5);
        //Animal animal4 = new Animal("Cat", 1);
        Animal animal5 = new Animal("Tiger", 10, true, false, false);
        Animal animal6 = new Animal("Cow", 5, false, true, false);
        Animal animal7 = new Animal("Cat", 2, false, false, true);

        //System.out.println(animal2);
        //System.out.println(animal2.name);
        //System.out.println(animal2.age);
        System.out.println(animal5);
        System.out.println(animal6);
        System.out.println(animal7);



    }
}
