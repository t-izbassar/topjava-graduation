package com.github.tizbassar.menu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * REST endpoint for {@link Menu}.
 *
 * @author Izbassar Tolegen (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 *
 * @todo #7:30min/DEV Write integration test for MenuEndpoint.
 */
@RestController
@RequestMapping("menu")
public class MenuEndpoint {

    /**
     * Request {@link Menu} by id.
     * @param id Id
     * @return Menu
     */
    @GetMapping(path = "{id}")
    public Menu requestById(@PathVariable final long id) {
        return Collections::emptyList;
    }
}
