package class_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000.0);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000.0);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000.0);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000.0);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000.0);


        ArrayList<Car> cars = new ArrayList<>(Arrays.asList(car1,car2,car3,car4,car5));
        Car mostExpCar = cars.get(0); Car mostCheapCar = cars.get(0); int count = 0;
        for (Car car : cars) {
            if (car.color.equals("Black")) count++;

        }
        System.out.println(count);

        for (Car car : cars) {
            if(car.price > mostExpCar.price) mostExpCar = car;
            if(car.price < mostCheapCar.price) mostCheapCar = car;
        }
        System.out.println(mostExpCar);
        System.out.println(mostCheapCar);

        for (Car car : cars) {
            if(car.year> 2020 && car.year<2023) System.out.println(car);
        }
        System.out.println(cars.stream().filter(car -> car.color.equals("Black")).count());
        System.out.println(cars.stream().filter(car -> car.color.equals("Black") || car.color.equals("Beige") || car.year == 2023).count());
        cars.removeIf(c -> c.model.equals("Tesla")); // it returns boolean when in print statement because its return type is boolean
        System.out.println(cars.size());

        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            if (iterator.next().make.equals("Tesla")) iterator.remove();
        }
        System.out.println(cars.size());
    }
}
