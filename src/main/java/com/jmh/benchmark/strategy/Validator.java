package com.jmh.benchmark.strategy;


import java.util.function.Predicate;

public class Validator {
    private final TextValidator textValidator;

    public Validator(TextValidator textValidator) {
        this.textValidator = textValidator;
    }

    public boolean validate(String input) {
        return textValidator.execute(input);
    }

    public static void main(String[] args) {
        Validator numericValidator = new Validator(s -> s.matches("\\d+"));
        boolean b = numericValidator.validate("123");
        System.out.println(b);
    }
}
