/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibFigures;

import java.awt.*;
/**
 *
 * @author anatoli
 */
public class Circle extends ScalableFigure {
    
    Circle(Graphics g, Color bgColor,int r){
        graphics=g;
        this.bgColor = bgColor;
        size=r;
    }
    
    @Override
    public void show(){
        Color OldC = graphics.getColor();
        graphics.setColor(Color.BLACK);
        graphics.drawOval(x, y, size, size);
        graphics.setColor(OldC);
    }
    
    @Override
    public void hide(){
        Color OldC = graphics.getColor();
        graphics.setColor(bgColor);
        graphics.drawOval(x, y, size, size);
        graphics.setColor(OldC);
        
    }
}
