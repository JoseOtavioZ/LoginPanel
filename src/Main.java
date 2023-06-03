import javax.swing.*;

public class Main{
    public static void main(String[] args)
    {
        Login form = new Login();

        form.setContentPane(form.loginPanel);
        form.setVisible(true);
        form.pack();
        form.setTitle("Tela de Login");

    }
}