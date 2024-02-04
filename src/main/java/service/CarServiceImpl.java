package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    private CarDao carDao = new CarDaoImpl();

    @Override
    public ArrayList<Car> getNumberOfCars(int number) throws Exception {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            cars.add(carDao.getById(i));
        }
        return cars;
    }
}
