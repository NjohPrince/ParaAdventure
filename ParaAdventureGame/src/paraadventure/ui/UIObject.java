/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paraadventure.ui;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

/**
 *
 * @author Suprememajor
 */
public abstract class UIObject {
    protected float x, y;
    protected int width,height;
    protected boolean hovering = false;
    protected Rectangle bounds;

    public UIObject(float x, float y ,int width, int height){
    
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        bounds = new Rectangle((int) x , (int) y , width, height);
    }
    public abstract void tick();
    
    public abstract void render(Graphics g);  
    
    public abstract void onClick();
    
    public void onMouseMove(MouseEvent e){
        if(bounds.contains(e.getX(), e.getY()))
            hovering = true;
        else 
            hovering = false;
    }
    public void onMouseRelease(MouseEvent e){
        if(hovering)
            onClick();
    }
    
    //GETTERS AND SETTERS
    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHovering(boolean hovering) {
        this.hovering = hovering;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
