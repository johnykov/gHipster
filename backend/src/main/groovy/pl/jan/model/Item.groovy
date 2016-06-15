package pl.jan.model

import com.google.common.base.Objects
import groovy.transform.Canonical
import groovy.transform.TypeChecked

@Canonical
@TypeChecked
public class Item {
    private String name
    private Integer quantity

    public Item() {
    }

    public Item(String name, Integer quantity) {
        this.name = name
        this.quantity = quantity
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Integer getQuantity() {
        return quantity
    }

    void setQuantity(Integer quantity) {
        this.quantity = quantity
    }

}
