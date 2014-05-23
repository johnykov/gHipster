package pl.jan.persistance

import pl.jan.model.Item

interface Warehouse {
    List<Item> getAllItems()
}
