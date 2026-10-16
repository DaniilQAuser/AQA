package org.example;

public class User {
    String name;
    int age;
    String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    void printInfo() {
        System.out.println("Пользователь: " + name + ", возраст: " + age + ", email: " + email);
    }

    String greeting() {
        return "Привет, меня зовут " + name + "!";
    }
}
