package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

//To store variables of player class and etc.
public class Entity {
    public int worldX;
    public int worldY;
    public int speed;

    public String direction;
    public BufferedImage up1;
    public BufferedImage up2;
    public BufferedImage down1;
    public BufferedImage down2;
    public BufferedImage left1;
    public BufferedImage left2;
    public BufferedImage right1;
    public BufferedImage right2;

    public int spriteCounter = 0;
    public int spriteNum = 1;

    public Rectangle solidArea;
    public boolean collisionOn = false;
}