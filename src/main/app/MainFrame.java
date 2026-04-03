package main.app;
import main.service.FirebaseService;

public class MainFrame {
    public static void main(String[] args) {
        FirebaseService.initialize();
        FirebaseService.test();
    }
}