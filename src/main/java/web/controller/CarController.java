package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    private CarService service = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(name = "count", defaultValue = "5") int count, ModelMap model) throws Exception {
        if (count <= 0) {
            model.addAttribute("error", "Invalid value");
        } else if (count > 5) {
            model.addAttribute("cars", service.getNumberOfCars(5));
        } else {
            model.addAttribute("cars", service.getNumberOfCars(count));
        }
        return("cars");
    }
}
