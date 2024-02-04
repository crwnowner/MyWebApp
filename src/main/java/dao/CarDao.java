package dao;

import model.Car;

import java.util.ArrayList;

public interface CarDao {
    public void add(int horsepower, String model, int cost);
    public Car getById(int id) throws Exception;
    public ArrayList<Car> getAll();
}
