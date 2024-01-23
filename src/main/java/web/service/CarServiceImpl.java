package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private static final List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("Red Bull Racing", "RB19", 2023));
        carList.add(new Car("Mercedes-AMG F1", "W14", 2023));
        carList.add(new Car("Ferrari", "SF-23", 2023));
        carList.add(new Car("McLaren", "MCL60", 2023));
        carList.add(new Car("Aston Martin", "AMR23", 2023));
    }

    @Override
    public List<Car> getSomeCars(Integer countCars) {
        List<Car> list = getCars();
        if (countCars == null || countCars < 0 || countCars > list.size()) {
            countCars = list.size();
        }
        return list.stream().limit(countCars).toList();
    }

    @Override
    public List<Car> getCars() {
        return carList;
    }
}
