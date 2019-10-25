package com.jashnimje;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator implements ActionListener {
    static double a = 0, b = 0, result = 0;
    static int operator = 0;
    JFrame f;
    JTextField t1, t2, t3;
    JButton bdiv, bmul, bsub, badd;

    Calculator() {
        f = new JFrame("Calculator");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        JLabel title = new JLabel("Calculator");
        title.setBounds(30, 50, 280, 30);

        bdiv = new JButton("/");
        bmul = new JButton("*");
        bsub = new JButton("-");
        badd = new JButton("+");


        t1.setBounds(30, 110, 280, 30);
        t2.setBounds(30, 180, 280, 30);
        t3.setBounds(100, 250, 140, 30);

        badd.setBounds(40, 310, 50, 40);
        bsub.setBounds(110, 310, 50, 40);
        bmul.setBounds(180, 310, 50, 40);
        bdiv.setBounds(250, 310, 50, 40);

        f.add(title);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(badd);
        f.add(bsub);
        f.add(bmul);
        f.add(bdiv);

        t3.setEditable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 450);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
    }

    public static void main(String... s) {
        new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        String s2 = t2.getText();
        String s3 = t3.getText();
        a = Double.parseDouble(t1.getText());
        b = Double.parseDouble(t2.getText());

        if (e.getSource() == badd) {
            operator = 1;
        }

        if (e.getSource() == bsub) {
            operator = 2;
        }

        if (e.getSource() == bmul) {
            operator = 3;
        }

        if (e.getSource() == bdiv) {
            operator = 4;
        }

        switch (operator) {
            case 1:
                result = a + b;
                break;

            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;

            case 4:
                result = a / b;
                break;

            default:
                result = 0;
        }
        String d = String.valueOf(result);
        t3.setText(d);
    }
}
