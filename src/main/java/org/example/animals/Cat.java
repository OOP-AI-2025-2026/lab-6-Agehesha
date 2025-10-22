
package org.example.animals;

public final class Cat extends Animal {
    public Cat(String name) { super(name); }

    @Override public String makeSound() { return "Мяу!"; }
}
