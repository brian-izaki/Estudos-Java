package instrucoes_de_controle.guiDesenho;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    // realiza o desenho
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // pega o tamanho do panel criado para o quadro.
        int width = getWidth();
        int height = getHeight();

        // está sendo utilizado para desenha linhas.
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }

}
