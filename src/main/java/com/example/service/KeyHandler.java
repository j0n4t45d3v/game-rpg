package com.example.service;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean up, down, left, right;

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                this.up = true;
                break;
            case KeyEvent.VK_S:
                this.down = true;
                break;
            case KeyEvent.VK_D:
                this.right = true;
                break;
            case KeyEvent.VK_A:
                this.left = true;
                break;
            default:
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                this.up = false;
                break;
            case KeyEvent.VK_S:
                this.down = false;
                break;
            case KeyEvent.VK_D:
                this.right = false;
                break;
            case KeyEvent.VK_A:
                this.left = false;
                break;
            default:
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
