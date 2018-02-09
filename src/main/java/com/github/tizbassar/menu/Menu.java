package com.github.tizbassar.menu;

import com.github.tizbassar.dish.Dish;

/**
 * Menu.
 *
 * @author Izbassar Tolegen (t.izbassar@gmail.com)
 * @version $Id$
 * @since 0.1.0
 */
public interface Menu {

    /**
     * Dishes of this menu.
     * @return Dishes
     */
    Iterable<Dish> dishes();
}
