package instrucoes_de_controle.guiDesenho;

import javax.swing.*;

public class DrawPanelTest {

    public static void main(String[] args) {
        // cria um panel com os desenhos com coordenadas
//        DrawPanel panel = new DrawPanel();
        DrawHalfPanel panel = new DrawHalfPanel();

        // cria um quadro pro panel
        JFrame application = new JFrame();

        // qnd fechar encerra a aplicação.
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250, 250);
        // exibe nosso quadro
        application.setVisible(true);
    }

}
