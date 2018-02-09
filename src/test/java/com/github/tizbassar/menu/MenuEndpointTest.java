package com.github.tizbassar.menu;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link MenuEndpoint}.
 *
 * @author Izbassar Tolegen (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 */
public class MenuEndpointTest {

    @Test
    public void shouldRequestById() {
        final MenuEndpoint endpoint = new MenuEndpoint();
        MatcherAssert.assertThat(
            endpoint.requestById(1L).dishes(),
            Matchers.emptyIterable()
        );
    }
}
