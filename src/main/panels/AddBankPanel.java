package main.panels;

import main.app.MainFrame;
import main.model.Bank;

import javax.swing.*;
import java.awt.*;

public class AddBankPanel extends JPanel {

    private MainFrame mainFrame;

    public  AddBankPanel(MainFrame mainFrame){
        this.mainFrame = mainFrame;

        setLayout(new GridLayout(4,2));


    }
}
