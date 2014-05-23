package pl.jan.persistance

import groovy.transform.TypeChecked
import pl.jan.model.Item
import spock.lang.Specification

@TypeChecked
class WarehouseInMemoryTest extends Specification {

    void "warehouse should be empty"() {
        when:
        WarehouseInMemory WarehouseUnderTest = new WarehouseInMemory()

        then:
        WarehouseUnderTest.getAllItems() == []
    }

}
