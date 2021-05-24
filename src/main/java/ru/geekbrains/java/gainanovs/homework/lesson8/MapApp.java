package ru.geekbrains.java.gainanovs.homework.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MapApp extends JFrame {
    private int x = 100;
    private int y = 100;
    private int size = 20;

    JPanel rectPanel = new JPanel();

    public MapApp() {
        setTitle("Карта");
        setBounds(600, 200, 600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.decode("#008800"));
        add(mainPanel, BorderLayout.CENTER);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 4));
        buttonsPanel.setPreferredSize(new Dimension(1, 40));
        add(buttonsPanel, BorderLayout.SOUTH);

        rectPanel = new JPanel();
        rectPanel.setBounds(x, y, size, size);
        rectPanel.setBackground(Color.WHITE);
        mainPanel.add(rectPanel);

        JButton buttonUp = new JButton("Up");
        buttonsPanel.add(buttonUp);
        buttonUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y -= 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });

        JButton buttonDown = new JButton("Down");
        buttonsPanel.add(buttonDown);
        buttonDown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                y += 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });

        JButton buttonLeft = new JButton("Left");
        buttonsPanel.add(buttonLeft);
        buttonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });
        JButton buttonRight = new JButton("Right");
        buttonsPanel.add(buttonRight);
        buttonRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x += 20;
                rectPanel.setBounds(x, y, size, size);
            }
        });

        mainPanel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
                    x += 20;
                    rectPanel.setBounds(x,y,size, size);
                } else if(e.getKeyCode()== KeyEvent.VK_LEFT) {
                    x -= 20;
                    rectPanel.setBounds(x,y,size, size);
                }
                else if(e.getKeyCode()== KeyEvent.VK_DOWN) {
                    y += 20;
                    rectPanel.setBounds(x,y,size, size);
                } else if(e.getKeyCode()== KeyEvent.VK_UP) {
                    y -= 20;
                    rectPanel.setBounds(x,y,size, size);
                }
            }
        });

        mainPanel.setFocusable(true);
        setVisible(true);
    }
}
