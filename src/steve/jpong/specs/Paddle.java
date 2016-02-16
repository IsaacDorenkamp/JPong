package steve.jpong.specs;

import steve.jpong.framework.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JComponent;

public class Paddle extends Sprite {
	private int x;
	
	private int width;
	private int height;
	private int vel_y = 0;
	public Paddle( int x, int w, int h ){
		super(x,0);
		this.x = x;
		width = w;
		height = h;
	}
	public Paddle( int x ){
		this( x, 10, 75 );
	}
	public void adjust(JComponent jf){
		move( x, (jf.getHeight() / 2) - (height / 2) );
	}
	public void paint(Graphics grfx){
		grfx.setColor( Color.WHITE );
		grfx.fillRect(getX(), getY(), width, height);
	}
	
	public void setVelocityY(int vy){
		vel_y = vy;
	}
	public int getVelocityY(){
		return vel_y;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
}
