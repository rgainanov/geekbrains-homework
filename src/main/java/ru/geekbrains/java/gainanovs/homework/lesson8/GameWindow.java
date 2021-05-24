package ru.geekbrains.java.gainanovs.homework.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {
    private JTextField textField;
    private int randomNumber;
    private int gameI = 1;
    private int rounds = 3;
    private boolean endGame = false;


    public GameWindow() {
        this.randomNumber = (int) (Math.random() * 10) + 1;
        System.out.println(randomNumber);


        setTitle("Игра. Угадай числою");
        setBounds(600, 300, 600, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JButton newGameButton = new JButton("Новая Игра");
        add(newGameButton, BorderLayout.EAST);
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                randomNumber = (int) (Math.random() * 10) + 1;
                endGame = false;
                rounds = 3;
                textField.setText("Программа загадала число от 1 до 10. Попыток: " + rounds);
            }
        });

        textField.setText("Программа загадала число от 1 до 10. Попыток: " + rounds);
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 20);
        textField.setFont(font);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);

            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tryToAnswer(buttonIndex);
                }
            });
        }

        setVisible(true);
    }

    private void tryToAnswer(int answer) {
        rounds--;

        if (endGame) {
            return;
        }

        if (rounds < 1 && answer != randomNumber) {
            textField.setText("У вас закончились попытки. Вы не угадали. Конец игры.");
            endGame = true;
            return;
        }

        if (answer == randomNumber) {
            textField.setText("Вы угадали!!! Ответ: " + randomNumber);
            endGame = true;
        } else if (answer > randomNumber) {
            textField.setText("Не угадали! Загаданное число меньше, чем " + answer + ". Попыток: " + rounds);
        } else {
            textField.setText("Не угадали! Загаданное число больше, чем " + answer + ". Попыток: " + rounds);
        }

    }
}
