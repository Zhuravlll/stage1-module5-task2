package com.epam.mjc;

import java.util.LinkedList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) { return x -> {
        List<Integer> result = new LinkedList<>();
        for (Integer e: x) {
            result.add(e/ divider);
        }
        return result;
    };

    }
}
