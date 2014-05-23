package pl.jan

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import pl.jan.model.Item
import pl.jan.persistance.Warehouse
import pl.jan.persistance.WarehouseInMemory

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static final String TEST = "test"
    public static final String PROD = "prod"

    public static void main(String[] args) {
        ConfigurableApplicationContext app = new SpringApplicationBuilder(Application.class)
                .showBanner(false)
                .profiles(PROD)
                .run(args)
    }

    @Bean
    @Profile("test")
    public Warehouse emptyBean() {
        new WarehouseInMemory()
    }

    @Bean
    @Profile("prod")
    public Warehouse inMemoryBean() {
        new WarehouseInMemory()
    }
}