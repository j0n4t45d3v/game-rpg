package com.example.ui;

import java.awt.*;

import javax.swing.*;

import com.example.entity.Player;
import com.example.entity.Position;
import com.example.service.KeyHandler;

public class GamePainel extends JPanel {

  private final Player player;
  private final KeyHandler keyHandler = new KeyHandler();

  public GamePainel(Player player) {
    this.player = player;
    this.setBackground(Color.WHITE);
    this.setFocusable(true);
    this.addKeyListener(this.keyHandler);
    this.setLayout(null);

    PlayerStatus status = new PlayerStatus(player);
    Dimension dimension = new Dimension(200, 40);
    status.setSize(dimension);
    status.setLocation(10, 10);
    this.add(status);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D graphics2d = (Graphics2D) g;
    this.player.draw(graphics2d);
  }

  public void movePlayer() {
    Position playerPosition = this.player.getPosition();
    boolean isMaxXPosition = playerPosition.getX() > Window.WIDTH - 80;
    boolean isMaxYPosition = playerPosition.getY() > Window.HEIGHT - 100;
    boolean isMinXPosition = playerPosition.getX() <= 10;
    boolean isMinYPosition = playerPosition.getY() <= 20;
    if(this.keyHandler.up && !isMinYPosition) {
      this.player.moveUp();
    }else if(this.keyHandler.down && !isMaxYPosition) {
      this.player.moveDown();
    }else if(this.keyHandler.left && !isMinXPosition) {
      this.player.moveLeft();
    }else if(this.keyHandler.right && !isMaxXPosition) {
      this.player.moveRight();
    }
  }
}
