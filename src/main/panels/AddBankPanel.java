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


    }
}
