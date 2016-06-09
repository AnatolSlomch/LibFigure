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
public abstract class Figure {
    public int x=0;
    public int y=0;
    Color color;
    Graphics graphics;
    Color bgColor;
    
    public abstract void hide();
    public abstract void show();
    
    public void moveTo(int x, int y){
        hide();
        this.x = x;
        this.y = y;
        show();
    }
}
