package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getNumberOfCars(int number) throws Exception;
}
