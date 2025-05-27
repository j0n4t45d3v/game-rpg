package com.example.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.example.entity.Player;

public class GamePainel extends JPanel {

  private final Player player;

  public GamePainel(Player player) {
    this.player = player;
    this.setBackground(Color.WHITE);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D graphics2d = (Graphics2D) g;
    this.player.draw(graphics2d);
  }

}
