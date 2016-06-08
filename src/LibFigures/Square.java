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
public class Square extends ScalableFigure {
    
   Square(Graphics g,Color bgColor,int r){
       graphics=g;
       this.bgColor=bgColor;
       size=r;
   } 
   
   /**Рисование квадрата
    * 
    */
   @Override
   public void show(){
       Color oldC=graphics.getColor();
       graphics.setColor(Color.BLACK);
       graphics.drawRect(x, y, size, size);
       graphics.setColor(oldC);
   }
   
    /**Метод убирает квадрат с полотна
     *
     */
    @Override
   public void hide(){
       Color oldC=graphics.getColor();
       graphics.setColor(bgColor);
       graphics.drawRect(x, y, size, size);
       graphics.setColor(oldC);
       
   }
    
}
