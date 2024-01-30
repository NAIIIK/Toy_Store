package ru.gb.homework.FileHandler;

import ru.gb.homework.ToyStore_API.Toy.Toy;
import ru.gb.homework.ToyStore_API.ToyStore.ToyStore;

import java.io.Serializable;
import java.util.List;

public interface Writable {
    boolean save(String string, String path);
}
