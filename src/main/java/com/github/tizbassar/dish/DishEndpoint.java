package com.github.tizbassar.dish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST endpoint for {@link Dish}.
 *
 * @author Izbassar Tolegen (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 *
 * @todo #7:30min/DEV Write now there is no integration test for
 *  DishEndpoint. This should be fixed.
 */
@RestController
@RequestMapping("/dish")
public class DishEndpoint {

    /**
     * Request {@link Dish} by id.
     * @param id Id
     * @return Dish
     */
    @GetMapping(value = "/{id}")
    public Dish requestById(@PathVariable final long id) {
        return new Dish() {

            /**
             * Name.
             * @return name
             */
            @Override
            public String name() {
                return "Dish with id = " + id;
            }

            /**
             * Price.
             * @return price
             */
            @Override
            public double price() {
                return 0;
            }
        };
    }
}
