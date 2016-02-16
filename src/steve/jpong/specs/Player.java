package steve.jpong.specs;

public abstract class Player {
	protected Paddle player_paddle;
	public abstract boolean check_collisions(Ball b);
	public abstract void initialize_paddle();
	public Player(){
		player_paddle = new Paddle( 15, 10, 75 );
		initialize_paddle();
	}
	public Paddle getPaddle(){
		return player_paddle;
	}
	protected boolean in_range(int x, int low, int high){
		if( x >= low && x <= high ){
			return true;
		}
		return false;
	}
}