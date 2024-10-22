package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO implements DAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("bmv", 2003, "red"));
        cars.add(new Car("merc", 2020, "blue"));
        cars.add(new Car("vaz", 1997, "green"));
        cars.add(new Car("mazeratti", 224, "purple"));
        cars.add(new Car("lambo", 2077, "orange"));
    }

    @Override
    public List<Car> getCars(int number) {
        if (number >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, number);
        }
    }
}