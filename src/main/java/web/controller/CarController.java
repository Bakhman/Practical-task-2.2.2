package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;


/**
 * @author Bakhmai Begaev
 */
@Controller
@RequestMapping("/cars")
public class CarController {
    private CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String indicator(@RequestParam(value = "count", required = false) String count, Model model){
        model.addAttribute("cars",  carDAO.indicator(count));
        return "cars";
    }

}
