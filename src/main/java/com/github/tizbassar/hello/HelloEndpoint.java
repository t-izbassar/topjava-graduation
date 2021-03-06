package com.github.tizbassar.hello;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloEndpoint as proof of work.
 *
 * @author Tolegen Izbassar (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 *
 * @todo #26:30m/DEV Delete HelloEndpoint as it is created only for
 *  proof of concept. Delete it after core logic is defined.
 */
@RestController
@RequestMapping("/hello")
public class HelloEndpoint {

    /**
     * Greeting resource.
     * @param name name to greet
     * @return greetings
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello(final String name) {
        return "Hello, " + name;
    }
}
