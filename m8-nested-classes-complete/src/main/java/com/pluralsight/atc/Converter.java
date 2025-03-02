package com.pluralsight.atc;

@FunctionalInterface
public interface Converter<InputType, OutputType> {
    OutputType convert(InputType input);
}
