package main.panels;
import main.app.MainFrame;
import javax.swing.*;
import java.awt.*;

public class BDOPanel extend JPanel{
    public BDOPanel(MainFrame mainFrame) {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("BDO Panel", SwingConstraints.CENTER);
        add(label, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);
    }
}
