package ru.geekbrains.java.gainanovs.homework.lesson5;

public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Romans Gainanovs", "BIE", "roman@email.com", "00441234567890", 300023.34, 30);
        employees[1] = new Employee("Petr Ivanov", "Engineer", "petr@email.com", "003712123455", 15000.99, 18);
        employees[2] = new Employee("Ivan Petrov", "Cleaner", "ivan@email.com", "003712123456", 20000.20, 41);
        employees[3] = new Employee("Boris Zajcev", "Driver", "boris@email.com", "003712123457", 21000.34, 40);
        employees[4] = new Employee("Gleb Sidorov", "Pilot", "gleb@email.com", "003712123458", 1300023.34, 42);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].employeeInfo();
            }
        }
    }
}
