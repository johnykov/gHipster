package pl.jan.mvc

import groovy.transform.TypeChecked
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import pl.jan.model.Item
import pl.jan.persistance.Warehouse

@TypeChecked
@RestController
@RequestMapping("/Warehouse")
class WarehouseController {

    private Warehouse Warehouse

    @Autowired
    public WarehouseController(Warehouse Warehouse) {
        this.Warehouse = Warehouse
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Item> index() {
        Warehouse.getAllItems()
    }
}
