
package org.example.animals;

public final class Dog extends Animal {
    public Dog(String name) { super(name); }

    @Override public String makeSound() { return "Гав!"; }
}
