package class_object;

public class Apple {
    //default constructor is provided by Java to create zero args

    public Apple(){
        //each time you created an object, this block of code will be executed
        System.out.println("This is the default constructor");
    }

    public Apple(String color, double price, String taste){
        this.color = color;
        this.price = price;
        this.taste = taste;
    }
    // instance variables - fields - states - attributes
    public String color = "Red";
    public double price;
    public String taste;

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
