/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package desain;

import java.awt.Color;
import java.awt.Font;

public class Button extends usu.widget.ButtonGlass{
   
    public Button(){
        super();
        setFont(getFont().deriveFont(Font.BOLD));
        setForeground(Color.BLACK);
        setRoundRect(true);
    }
}
