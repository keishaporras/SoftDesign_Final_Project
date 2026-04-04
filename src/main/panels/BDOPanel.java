package panels;

import app.MainFrame;
import javax.swing.*;
import java.awt.*;

public class BDOPanel extends JPanel {

    public BDOPanel(MainFrame mainFrame) {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("BDO Panel", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);
    }
}