package app;

import panels.*;

import javax.swing.*;
import java.awt.*;

import main.service.FirebaseService;

public class MainFrame {
    public static void main(String[] args) {
        FirebaseService.initialize();
        FirebaseService.test();
    }

    public void showPanel(String name){

    }

}