/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paraadventure.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author ngan
 */
public class Tile {
    //STATIC STUFF HERE
    
    public static Tile[] tiles  = new Tile[256];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile rockTile = new RockTile(2);
    
    //CLASS
    public static final int TILEWIDTH = 32, TILEHEIGHT = 32;
    
    protected BufferedImage texture;
    protected final int id;
    
    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;
        
        tiles[id] = this;
    }
    public void tick(){
        
    }
    public void render(Graphics g,int x, int y){
        g.drawImage(texture, x, y,TILEWIDTH, TILEHEIGHT, null);
    }
    
    public boolean isSolid(){
        return false;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public int getId() {
        return id;
    }
}
