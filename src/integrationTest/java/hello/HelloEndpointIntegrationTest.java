package hello;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Hello endpoint integration test.
 *
 * @author Tolegen Izbassar (t.izbassar@gmail.com)
 * @version $Id
 * @since 0.0.1
 */
public class HelloEndpointIntegrationTest {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloEndpointIntegrationTest.class);
    private final Client client = ClientBuilder.newClient();

    @Test
    public void shouldGreet() {
        LOGGER.info("Testing shouldGreet");

        final String result = client.target("http://localhost:8080")
                .path("hello")
                .queryParam("name", "int-test")
                .request()
                .get(String.class);

        Assert.assertEquals("Hello, int-test", result);
    }
}
