package instrucoes_de_controle.guiDesenho;

import javax.swing.*;
import java.awt.*;

public class DrawHalfPanel extends JPanel {

    final int LINES = 15;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int counterLine = 0;

        int larguraAndante = 0;
        int alturaAndante = height;

        while (counterLine < LINES) {
            g.drawLine(0, 0, larguraAndante, alturaAndante  );

            larguraAndante += width / LINES;
            alturaAndante -= height / LINES;

            counterLine++;
        }

    }

}
