package sayilir.coder.cors.controller;

import org.springframework.web.bind.annotation.*;
import sayilir.coder.cors.model.Coffee;
import sayilir.coder.cors.model.Size;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/coffee")
//@CrossOrigin(origins = "http://localhost:3000")
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    public CoffeeController() {
        coffeeList.add(new Coffee(1, "Americano", Size.GRANDE));
        coffeeList.add(new Coffee(2, "Latte", Size.VENTI));
        coffeeList.add(new Coffee(3, "Macchiato", Size.TALL));
    }


    @GetMapping
    public List<Coffee> findAll(){
        return coffeeList;
    }
    @DeleteMapping
    public void delete(Integer id) {
        coffeeList.removeIf(coffee -> coffee.id().equals(id));
    }


}
