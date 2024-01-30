package ru.gb.homework.ToyStore_API.Service;

import ru.gb.homework.FileHandler.FileWriter;
import ru.gb.homework.FileHandler.Writable;
import ru.gb.homework.ToyStore_API.Toy.Toy;
import ru.gb.homework.ToyStore_API.Toy.builder.ToyBuilder;
import ru.gb.homework.ToyStore_API.ToyStore.ToyStore;

import java.util.List;

public class Service {
    private ToyStore toyStore;
    private ToyBuilder toyBuilder;
    private Writable writable;

    public Service() {
        this.toyStore = new ToyStore();
        this.toyBuilder = new ToyBuilder();
        this.writable = new FileWriter();
    }

    public void addToy(String name, double weight) {
        Toy newToy = toyBuilder.build(name, weight);
        toyStore.addToy(newToy);
    }

    public void editToyWeight(int id, double weight) {
        toyStore.editToyWeight(id, weight);
    }

    public Toy play() {
        return toyStore.play();
    }

    public String getToyStoreInfo() {
        return toyStore.toString();
    }

    public List<Toy> getToys() {
        return toyStore.getToys();
    }

    public List<Toy> getPrizeToy() {
        return toyStore.getPrizeToy();
    }

    public String getPrizeToysInfo() {
        return toyStore.getPrizeToysInfo();
    }

    public String getPrizesInfo() {
        return toyStore.getPrizesInfo();
    }

    public boolean save(String s, String fileName) {
        return writable.save(s, fileName);
    }
}
