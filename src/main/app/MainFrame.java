package main.app;

import main.panels.*;
import main.service.FirebaseService;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {

        setTitle("Bank Setting");
        setSize(400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        //mainPanel.add(new DashBoardPanel(this), "dashboard");
        mainPanel.add(new BDOPanel(this), "bdo");
        mainPanel.add(new BPIPanel(this), "bpi");
        //mainPanel.add(new MayaPanel(this), "maya");
        mainPanel.add(new AboutPanel(this), "about");
        mainPanel.add(new AddBankPanel(this), "addbank");

        add(mainPanel);

        cardLayout.show(mainPanel, "Dashboard");
    }

    public void showPanel(String name) {
        cardLayout.show(mainPanel, name);
    }

    public static void main(String[] args) {
        FirebaseService.initialize();
        FirebaseService.test();

        SwingUtilities.invokeLater(() -> {
                new MainFrame().setVisible(true);
        });
    }
}
