package ru.geekbrains.java.gainanovs.homework.lesson5;

public class Employee {
    private String nameSurname;
    private String occupation;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(
            String nameSurname,
            String occupation,
            String email,
            String phoneNumber,
            double salary,
            int age) {
        this.nameSurname = nameSurname;
        this.occupation = occupation;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println("ФИО: " + nameSurname + ", должность: " +
                occupation + ", email: " + email + ", телефон: " + phoneNumber +
                ", зарплата: " + salary + ", возраст: " + age + ".");
    }
}
