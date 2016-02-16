package steve.jpong.gui;

import steve.jpong.gui.*;
import steve.jpong.specs.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;

public class GameCanvas extends JComponent {
	//Game Data
	private ArrayList<Player> players = new ArrayList<Player>();
	private Ball b;
	public GameCanvas(JFrame jf){
		final int wdt = jf.getWidth();
		players.add( new Player(){
			public boolean check_collisions(Ball b){
				if( in_range( b.getX(), player_paddle.getX(), player_paddle.getX() + player_paddle.getWidth() ) && in_range( b.getY(), player_paddle.getY(), player_paddle.getY() + player_paddle.getHeight()) ){
					return true;
				}
				return false;
			}
			public void initialize_paddle(){}
		} );
		players.add(new Player(){
			public boolean check_collisions(Ball b){
				if( in_range( b.getX(), player_paddle.getX(), player_paddle.getX() + player_paddle.getWidth() ) && in_range( b.getY(), player_paddle.getY(), player_paddle.getY() + player_paddle.getHeight()) ){
					return true;
				}
				return false;
			}
			public void initialize_paddle(){
				player_paddle = new Paddle(wdt - 30, 10, 75);
			}
		});
		b = new Ball();
	}
	public void paintComponent( Graphics grfx ){
		for( Player p : players ){
			if( p != null ){
				p.getPaddle().paint( grfx );
			}
		}
		b.paint( grfx );
	}
	public Ball getBall(){
		return b;
	}
	public ArrayList<Player> getPlayers(){
		return players;
	}
}