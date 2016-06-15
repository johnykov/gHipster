package pl.jan.persistance

import groovy.transform.TypeChecked
import groovy.util.logging.Slf4j
import pl.jan.model.Item

@Slf4j
@TypeChecked
class WarehouseInMemory implements Warehouse {
    private Map<String, Item> Warehouse = Collections.synchronizedMap(new HashMap<>())

    WarehouseInMemory() {
    }

    @Override
    List<Item> getAllItems() {
        Warehouse.values().asList().reverse()
    }
}
