package main.app;

import main.panels.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {
        setTitle("Bank Dashboard");
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // CardLayout Panel
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Add Panels
        mainPanel.add(new DashBoardPanel(this), "dashboard");
        mainPanel.add(new BDOPanel(this), "bdo");
        mainPanel.add(new BPIPanel(this), "bpi");
        mainPanel.add(new MayaPanel(this), "maya");
        mainPanel.add(new AboutPanel(this), "about");

        add(mainPanel);

        cardLayout.show(mainPanel, "dashboard");
    }

    public void showPanel(String name) {
        cardLayout.show(mainPanel, name);
    }
}