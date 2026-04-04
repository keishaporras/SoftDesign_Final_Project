package main.panels;

import main.app.MainFrame;
import javax.swing.*;
import java.awt.*;

public class AboutPanel extends JPanel {

    public AboutPanel(MainFrame mainFrame) {

        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel ("About this System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        add(titleLabel, BorderLayout.NORTH);

        JTextArea aboutText = new JTextArea();
        aboutText.setText(
                "This system is designed to help users automatically\n\n" +
                "Real time total calculation\n" +
                        "Easy to Select Bank\n\n" +
                        "User friendly Interface"
        );

        aboutText.setEditable(false);
        aboutText.setFont(new Font("Arial", Font.PLAIN, 14));
        aboutText.setLineWrap(true);
        aboutText.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(aboutText);
        add(scrollPane, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);
    }
}
// update1.1