
package org.example.animals;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name == null ? "" : name.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name.trim();
    }

    public abstract String makeSound();
}
