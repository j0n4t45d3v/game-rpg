package com.example.entity;

public class Position {

  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void addX(int x) {
    this.x += x; 
  }

  public void addY(int y) {
    this.y += y;
  }


}
