import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainForm.setLocationByPlatform(true);
        mainForm.setTitle("Регистрация");
        mainForm.pack();
        mainForm.setVisible(true);
    }
}