package org.example;

public class Toy {
    int id;
    String name;
    int probability;

    public Toy(int id, String name, int probability) {
        this.id = id;
        this.name = name;
        this.probability = probability;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProbability() {
        return probability;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", probability=" + probability +
                '}'+ "\n";
    }
}
