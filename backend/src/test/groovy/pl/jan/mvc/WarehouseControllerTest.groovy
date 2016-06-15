package pl.jan.mvc

import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import pl.jan.BootSpec
import pl.jan.model.Item

@TypeChecked
class WarehouseControllerTest extends BootSpec {
    static final String WAREHOUSE = "/Warehouse"

    void "should return empty items list"() {
        when:
        ResponseEntity<Item[]> response = getResponseFromServer()
        then:
        response.getStatusCode() == HttpStatus.OK
        response.getBody() == []
    }


    @TypeChecked(TypeCheckingMode.SKIP)
    private ResponseEntity<Item[]> getResponseFromServer() {
        new RestTemplate().getForEntity("${TEST_ADDRESS}:${TEST_PORT}${WAREHOUSE}",
                Item[].class)
    }
}
