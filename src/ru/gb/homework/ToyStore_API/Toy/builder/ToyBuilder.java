package ru.gb.homework.ToyStore_API.Toy.builder;

import ru.gb.homework.ToyStore_API.Toy.Toy;

public class ToyBuilder {
    public Toy build(String name, double weight) {
        return new Toy(name, weight);
    }
}
