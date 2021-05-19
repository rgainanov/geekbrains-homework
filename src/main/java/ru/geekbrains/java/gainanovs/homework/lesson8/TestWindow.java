package ru.geekbrains.java.gainanovs.homework.lesson8;

import javax.swing.*;
import java.awt.*;

public class TestWindow extends JFrame {
    public TestWindow() {
        setTitle("test window");
        setBounds(300, 300, 300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        add(mainPanel);

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        JButton button1 = new JButton("button1");
        gbc.gridx = 0;
        gbc.gridy = 0;
//        gbc.weightx = 2.0;
        gbc.weighty = 1.0;
        mainPanel.add(button1, gbc);

        JButton button2 = new JButton("button2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(button2, gbc);

        JButton button3 = new JButton("button3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(button3, gbc);

        JButton button4 = new JButton("button4");
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(button4, gbc);

        JTextField textField = new JTextField();
        textField.setText("text field");
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        mainPanel.add(textField, gbc);

        JPanel buttonPannel = new JPanel(new GridLayout(1, 3));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        mainPanel.add(buttonPannel, gbc);
        mainPanel.setBackground(Color.darkGray);

        for (int i = 1; i <= 3; i++) {
            JButton button = new JButton(String.valueOf(i));
            buttonPannel.add(button);
        }

        JButton button5 = new JButton("button5");
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 4;
        mainPanel.add(button5, gbc);


        setVisible(true);
    }
}
