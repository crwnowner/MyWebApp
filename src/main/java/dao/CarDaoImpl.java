package dao;

import model.Car;

import java.util.ArrayList;

public class CarDaoImpl implements CarDao{
    private ArrayList<Car> cars;
    private int counter;

    {
        cars = new ArrayList<>();
        cars.add(new Car(300, "Phoenix XT", 34500));
        cars.add(new Car(350, "TurboCharge X7", 42200));
        cars.add(new Car(250, "Eclipse GT", 38900));
        cars.add(new Car(400, "ThunderRider S4", 45600));
        cars.add(new Car(400, "Quantum QX", 36800));
        counter = 5;
    }

    @Override
    public void add(int horsepower, String model, int cost) {
        cars.add(new Car(horsepower, model, cost));
        counter++;
    }

    @Override
    public Car getById(int id) throws Exception {
        if ((id) >= counter) {
            throw new Exception("Unacceptable id");
        } else {
            return cars.get(id);
        }
    }

    @Override
    public ArrayList<Car> getAll() {
        return cars;
    }
}
