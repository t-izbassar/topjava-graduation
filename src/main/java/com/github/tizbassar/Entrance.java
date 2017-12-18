package com.github.tizbassar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entrance class to run Spring-Boot application.
 *
 * @author Tolegen Izbassar (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 */
@SpringBootApplication
public class Entrance {

    /**
     * Java main method.
     * @param args cli args
     */
    public static void main(final String[] args) {
        SpringApplication.run(Entrance.class, args);
    }
}
