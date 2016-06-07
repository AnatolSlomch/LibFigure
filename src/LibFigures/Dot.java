/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibFigures;

import java.awt.*;

/**
 *
 * @author anatol
 */
public class Dot extends Figure {
 
    public Dot(Graphics graphics,Color bgColor){
        
        this.graphics = graphics;
        this.bgColor = bgColor;
    }    
    @Override
    public void show(){
        Color oldC = graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x, y, x, y);
        graphics.setColor(oldC);
    }  
    @Override
    public void hide(){
        Color oldC = graphics.getColor();
        graphics.setColor(bgColor);
        graphics.drawLine(x, y, x, y);
        graphics.setColor(oldC);
        
    }
        
    
}
