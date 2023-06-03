import javax.swing.*;

public class Main{
    public static void main(String[] args)
    {
        Login form = new Login();

        form.setContentPane(form.loginPanel);
        form.setVisible(true);
        form.setSize(500, 500);
        form.setTitle("Tela de Login");

    }
}