package class_object.oopPractice;

public class Sword {
    public Sword(){
        System.out.println("Default constructor");
    }
    public Sword(double weight, double length, String name, String material){
        this.weight = weight;
        this.length = length;
        this.name = name;
        this.material = material;
    }

    // Instance variables

    // static instance variable -> belongs to the class _ what does every sword have
    public static final boolean hasHandle = true;
    public static boolean isSharp;

    public double weight;
    public double length;
    public String name;
    public String material;

    // Methods - what does a sword do - static
    public static void slash() {
        System.out.println("Sword is slashing");
    }
    // non-static -> belongs to the object _ what differs each sword by each other - value will change every time

    public void harms(){
        System.out.println("Sword damages = " + (weight * length) + " points.");
    }
    // running ONCE before everything
    static {
        System.out.println("Starting the sword making furnace");
    }
    {
        System.out.println("Heating up the furnace");
    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    // running everytime when an object is created
    //first static code block then non-static code block - then constructor

    public static void main(String[] args) {
        Sword sword1 = new Sword();
        Sword sword2 = new Sword(5.5,2.5,"Filiz","Iron");
        Sword sword3 = new Sword(10,25,"Long","Iron");

        System.out.println(sword2);
        sword2.harms();
        System.out.println(Sword.hasHandle);
        sword3.harms();
        Sword.slash();
    }
}

