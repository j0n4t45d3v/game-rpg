package com.example.ui;

import javax.swing.JFrame;
import javax.swing.Timer;

import com.example.entity.Player;

import java.awt.Dimension;

public class Window extends JFrame {

  private static final String TITLE = "Rpg Game";
  private static final int WIDTH = 1400;
  private static final int HEIGHT = 900;

  public Window() {
    this.setTitle(TITLE);
    Dimension dimension = new Dimension(WIDTH, HEIGHT);
    this.setSize(dimension);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    Player player = new Player(WIDTH / 2, HEIGHT / 2);
    GamePainel gamePainel = new GamePainel(player);
    this.add(gamePainel);

    new Timer(16, (e) -> {
      gamePainel.repaint();
    });
  }

}
