package main.panels;

import main.app.MainFrame;

import javax.swing.*;
import java.awt.*;

public class AddBankPanel extends JPanel {

    private MainFrame mainFrame;

    public  AddBankPanel(MainFrame mainFrame){
        this.mainFrame = mainFrame;

        JPanel header = new JPanel();
        header.setBackground(Color.decode("C4B98B"));
        header.setPreferredSize(new Dimension(400,80));

        JLabel title = new JLabel("ADD BANK");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        header.add(title);
        add(header, BorderLayout.NORTH);

        JPanel form = new JPanel();
        form.setLayout(new GridLayout(5, 2, 10, 10));
        form.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));



    }
}
