package View;

import javax.swing.*;

import Controller.DBController;

import java.awt.*;

public class MenuLogin {
    private JFrame frame;

    public MenuLogin(){
        showLogin();
    }

    public void showLogin(){
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // INIT TOOLKIT
        Dimension screenSize = toolkit.getScreenSize(); // GET MY SCREEN SIZE

        int screenWidth = screenSize.width; // GET PIXELS FOR WIDTH
        int screenHeight = screenSize.height; // GET PIXELS FOR HEIGHT

        final int FRAME_WIDTH = 350; // SET WIDTH
        final int FRAME_HEIGHT = 400; // SET WEIGHT

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2); // SET START LOCATION FOR X
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2); // SET START LOCATION FOR Y
        
        frame = new JFrame("LOGIN");
        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT); // SET FRAME BOUND
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JLabel emailLabel = new JLabel("email");
        emailLabel.setBounds(10, 50, 100, 20);
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(120, 50,200,50);
        panel.add(emailField);

        JLabel passwordLabel = new JLabel("password");
        passwordLabel.setBounds(10, 100, 100, 20);
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(passwordLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 100, 200, 50);
        panel.add(passField);

        JButton login = new JButton("LOGIN");
        login.setBounds(50, 200, 200, 50);
        panel.add(login);

        login.addActionListener(e -> {
            if (!emailField.getText().isEmpty()) {
                if (DBController.getLogin(null, null) != null){
                    frame.dispose();
                    new MenuBookList();
                } else {
                    JOptionPane.showMessageDialog(null, "Login gagal. Periksa email/password Anda.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    new MenuLogin();
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
