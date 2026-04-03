package main.app;

import main.panels.*;

import javax.swing.*;
import java.awt.*;

import main.service.FirebaseService;

public class MainFrame {
    public static void main(String[] args) {
        FirebaseService.initialize();
        FirebaseService.test();
    }
}