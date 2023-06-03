import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JTextField textUser;
    private JTextField textSenha;
    private JButton entrarButton;
    private JPanel panelLogin;
    public JPanel loginPanel;

    public Login() {
    entrarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Usuarios novoUsuario= new Usuarios();
            novoUsuario.setUsuario(textUser.getText());
            novoUsuario.setSenha(textSenha.getText());

            JOptionPane.showMessageDialog(null,"Logado com sucesso");
        }
    });
}
}
