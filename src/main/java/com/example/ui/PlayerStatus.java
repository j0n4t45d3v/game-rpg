package com.example.ui;

import com.example.entity.Player;
import java.awt.*;
import javax.swing.*;

public class PlayerStatus extends JPanel {

    private final JLabel lifeLabel = new JLabel("Vida: ");
    private final Player player;

    public PlayerStatus(Player player) {
        this.player = player;
        this.setBackground(Color.BLACK);
        Dimension dimension = new Dimension(200, 40);
        this.setPreferredSize(dimension);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight()); // fundo

        g2d.setColor(Color.WHITE);

        g2d.setFont(lifeLabel.getFont());
        g2d.drawString("Vida:", 10, 25); // texto

        int barX = 60;
        int barY = 15;
        int barWidth = 100;
        int barHeight = 10;

        g2d.setColor(Color.WHITE);
        g2d.fillRect(barX, barY, barWidth, barHeight); // barra "cheia"

        g2d.setColor(Color.GREEN);
        g2d.fillRect(barX, barY, player.getCurrentLife(), barHeight); // barra atual

        g2d.setColor(Color.BLACK);
        g2d.drawString(String.format("%d/%d", player.getCurrentLife(), player.getLife()), barX + 5, barY + 20);
    }
}
