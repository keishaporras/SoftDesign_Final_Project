package main.panels;

import main.app.MainFrame;

import javax.swing.*;
import java.awt.*;

public class MayaPanel extends JPanel {

    public MayaPanel(MainFrame mainFrame) {

        setLayout(new BorderLayout());

        JLabel label = new JLabel("Maya Panel", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);
    }
}