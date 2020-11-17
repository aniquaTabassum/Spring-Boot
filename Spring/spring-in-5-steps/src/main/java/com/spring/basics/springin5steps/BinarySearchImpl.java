package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int index)
    {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        return 3;
    }
}
