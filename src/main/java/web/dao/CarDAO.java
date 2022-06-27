package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bakhmai Begaev
 */
@Component
public class CarDAO {
    private int car_count;

    List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++car_count, 101, "Toyota"));
        cars.add(new Car(++car_count, 131, "Mercedes-Benz"));
        cars.add(new Car(++car_count, 284, "Honda"));
        cars.add(new Car(++car_count, 994, "Ford"));
        cars.add(new Car(++car_count, 321, "Volvo"));
        cars.add(new Car(++car_count, 114, "Hyundai"));
        cars.add(new Car(++car_count, 2574, "Fiat"));
        cars.add(new Car(++car_count, 221, "BMW"));
    }


    public List<Car> indicator(String count){
        int num;
        if (count==null) {
            num = 0;
        } else{num = Integer.parseInt(count);}

        if((num < 1) || (num > 4)) {
        return cars;
        }
        return cars.subList(0, num);
    }

}
