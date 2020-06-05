import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars =new ArrayList<>();
        Car c1 =new Car(15000, "VW",160);
        Car c2 =new Car(13000, "BM",160);
        Car c3 =new Car(17000, "Ford",160);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        Comparator<Car> comp=new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getPrice()>o2.getPrice())
                    return 1;
                else return -1;
            }
        };
        Collections.sort(cars,comp);
        for(Car c:cars)
            System.out.println(c.getPrice());
    }
}
