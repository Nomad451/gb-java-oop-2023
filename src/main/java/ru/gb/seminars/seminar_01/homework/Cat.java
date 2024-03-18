package ru.gb.seminars.seminar_01.homework;

public class Cat extends Animals {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void voice() {
        System.out.println(name + " мяу!");
    }

    @Override
    public void eat() {
        System.out.println(name + " кушает...");
    }

    @Override
    public void walk() {
        System.out.println(name + " гуляет...");
    }

    @Override
    public void sleep() {
        System.out.println(name + " спит...");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул!");
    }
}
