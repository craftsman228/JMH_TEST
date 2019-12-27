package com.jmh.benchmark.strategy.impl;

import com.jmh.benchmark.strategy.TextValidator;

public class IsNumeric implements TextValidator {
    @Override
    public boolean execute(String input) {
        return input.matches("\\d+");
    }
}
