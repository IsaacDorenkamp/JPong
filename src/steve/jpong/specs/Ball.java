package steve.jpong.specs;

import steve.jpong.framework.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

public class Ball extends Sprite {
	public Ball(){
		super(0, 0);
	}
	public void adjust(JComponent jf){
		move( jf.getWidth() / 2, jf.getHeight() / 2 );
	}
	public void paint(Graphics grfx){
		grfx.setColor( Color.GRAY );
		grfx.fillOval(getX(),getY(),10,10);
	}
}
