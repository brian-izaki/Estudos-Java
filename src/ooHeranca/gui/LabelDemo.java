package ooHeranca.gui;

import javax.swing.*;
import java.awt.*;

public class LabelDemo {
    public static void main(String[] args) {
        JLabel northLabel = new JLabel("North");

        // ImageIcon é uma imagem que pode ser exibida em uma JLabel.
        // pode carregar imagens GIF, JPEG, PNG
        ImageIcon labelIcon = new ImageIcon("ooHeranca/gui/image.png");
        JLabel centerLabel = new JLabel(labelIcon);
        JLabel southLabel = new JLabel(labelIcon);

        southLabel.setText("South");

        // renderiza os labels
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // explica que o JFrame deve terminar qnd fechar

        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        application.setSize(600, 600);
        application.setVisible(true);
    }
}
