package View;

import javax.swing.*;

import Controller.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuBookList {
    private JFrame frame;

    public MenuBookList(){
        showMainMenu();
    }

    public void showMainMenu(){
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // INIT TOOLKIT
        Dimension screenSize = toolkit.getScreenSize(); // GET MY SCREEN SIZE

        int screenWidth = screenSize.width; // GET PIXELS FOR WIDTH
        int screenHeight = screenSize.height; // GET PIXELS FOR HEIGHT

        final int FRAME_WIDTH = 300; // SET WIDTH
        final int FRAME_HEIGHT = 400; // SET WEIGHT

        int start_x = screenWidth / 2 - (FRAME_WIDTH / 2); // SET START LOCATION FOR X
        int start_y = screenHeight / 2 - (FRAME_HEIGHT / 2); // SET START LOCATION FOR Y
        
        frame = new JFrame("BOOK");
        frame.setBounds(start_x, start_y, FRAME_WIDTH, FRAME_HEIGHT); // SET FRAME BOUND
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);

        JButton transaksi = new JButton("Transaksi");
        transaksi.setBounds(50, 200, 200, 50);
        panel.add(transaksi);

        transaksi.addActionListener(e -> {
            frame.dispose();
            new MenuTransaksi();
        });

        JLabel judulField = new JLabel("JUDUL");
        judulField.setBounds(50, 100, 200, 50);
        judulField.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(judulField);

        JLabel authorField = new JLabel("AUTHOR");
        authorField.setBounds(50, 100, 200, 50);
        authorField.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(authorField);

        JLabel genreField = new JLabel("GENRE");
        genreField.setBounds(50, 100, 200, 50);
        genreField.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(genreField);

        JLabel priceField = new JLabel("PRICE");
        priceField.setBounds(50, 100, 200, 50);
        priceField.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(priceField);

        JButton buy = new JButton("buy book");
        buy.setBounds(50, 200, 200, 50);
        panel.add(buy);

        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String judul = judulField.getText();
                String author = authorField.getText();
                String genre = genreField.getText();
                String price = priceField.getText();
                
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
