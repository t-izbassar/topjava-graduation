package com.github.tizbassar.dish;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link DishEndpoint}.
 *
 * @author Izbassar Tolegen (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 */
public class DishEndpointTest {

    @Test
    public void shouldRequestById() {
        final DishEndpoint endpoint = new DishEndpoint();
        MatcherAssert.assertThat(
            endpoint.requestById(1L).name(),
            Matchers.equalTo("Dish with id = 1")
        );
    }
}
