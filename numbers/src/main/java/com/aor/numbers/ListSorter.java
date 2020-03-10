package com.aor.numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * An utility class to sort list of numbers.
 */
public class ListSorter {
    private List<Integer> list;

    public ListSorter(List<Integer> list) {
        this.list = list;
    }

    /**
     * Really stupid way to sort a list.
     * @return A sorted version of the list.
     */
    public List<Integer> sort() {
        Collections.sort(list);

        return list;
    }

}
