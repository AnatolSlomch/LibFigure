/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibFigures;

/**
 *
 * @author anatol
 */
public abstract class StretchableFigure extends Figure {
    int width;
    int hight;
    
    public void setSize(int width,int hight){
        hide();
        this.width=width;
        this.hight=hight;
        show();
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHight(){
        return hight;
    }
}
