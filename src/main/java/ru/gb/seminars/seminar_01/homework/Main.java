package ru.gb.seminars.seminar_01.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        Cat cat = new Cat("Мурзик", 3);
        Dog dog = new Dog("Шарик", 5);
        Cow cow = new Cow("Милка", 2);
        animals.add(cat);
        animals.add(dog);
        animals.add(cow);

        for (Animals a : animals) {
            a.voice();
            a.eat();
            a.walk();
            a.jump();
        }
    }
}
