package main.panels;

import main.app.MainFrame;
import javax.swing.*;
import java.awt.*;


public class DashBoardPanel {
    public DashBoardPanel(MainFrame mainFrame){
        setLayout(new BorderLayout());

        JLabel label = new JLabel("DashBoardPanel", SwingConstants.Center);
        add(label, BorderLayout.EAST);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);


    }
}
