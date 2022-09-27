package ru.moscow.bank;

public interface Converter<S, T>{

    T convert(S source);
}
