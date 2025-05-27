package com.example.entity;

import java.awt.Color;
import java.awt.Graphics2D;

public class Player {

  private final Position position;
  private final int size;
  private final int speed;

  public Player(Position position) {
    this.position = position;
    this.size = 40;
    this.speed = 4;
  }

  public Player(int x, int y) {
    this.size = 40;
    this.position = new Position(x - this.size, y - this.size);
    this.speed = 4;
  }

  public void draw(Graphics2D g) {
    g.setColor(Color.BLACK);
    g.fillRect(this.position.getX(), this.position.getY(), this.size, this.size);
  }

  public void moveUp() {
    this.position.addY(this.speed * (-1));
  }

  public void moveDown() {
    this.position.addY(this.speed);
  }

  public void moveLeft() {
    this.position.addX(this.speed);
  }

  public void moveRight() {
    this.position.addX(this.speed * (-1));
  }

  public Position getPosition() {
    return position;
  }

  public int getSize() {
    return size;
  }

  public int getSpeed() {
    return speed;
  }

}
