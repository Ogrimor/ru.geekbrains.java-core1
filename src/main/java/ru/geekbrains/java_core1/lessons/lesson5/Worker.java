package ru.geekbrains.java_core1.lessons.lesson5;

public class Worker {

    private String fullName;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    public int age;

    public Worker(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printWorker() {
        System.out.printf("This %s work is %s, phone - %s, email %s, salary %d, age:  %d \n", this.fullName, this.post, this.phoneNumber, this.email, this.salary, this.age);
    }

    @Override
    public String toString() {
        return  "This " + fullName + ", work is " + post + ", email " + email + ", phoneNumber " + phoneNumber + ", salary=" + salary + ", age=" + age;
    }
}

