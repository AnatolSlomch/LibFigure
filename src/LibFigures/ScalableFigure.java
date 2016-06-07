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
public abstract class ScalableFigure extends Figure {
    
    int size;
    
    public void setSize(int size){
        hide();
        this.size = size;
        show();
    }
    
    public int getSize(){
        return size;
    }
    
}
