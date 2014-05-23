package pl.jan

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.context.ConfigurableApplicationContext
import spock.lang.Shared
import spock.lang.Specification

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

class BootSpec extends Specification {
    protected static TEST_ADDRESS = "http://localhost"
    protected static TEST_PORT = "8081"
    protected static PROFILE = Application.TEST

    @Shared
    static ConfigurableApplicationContext context

    void setup() {
        Future future = Executors
                .newSingleThreadExecutor().submit(
                new Callable() {
                    @Override
                    public ConfigurableApplicationContext call() throws Exception {
                        return (ConfigurableApplicationContext) new SpringApplicationBuilder
                                (Application.class)
                                .showBanner(false)
                                .profiles(PROFILE)
                                .run("--server.port=${TEST_PORT}")
                    }
                })
        context = future.get(60, TimeUnit.SECONDS)
    }

    void cleanup() {
        if (context != null) {
            context.close()
        }
    }
}
