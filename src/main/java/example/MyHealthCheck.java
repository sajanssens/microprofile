package example;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

public class MyHealthCheck implements HealthCheck {

    public HealthCheckResponse call() {
        return HealthCheckResponse
                .named("brams-health-check")
                .withData("x", "123")
                .withData("y", "456")
                .up()
                .build();

    }
}
