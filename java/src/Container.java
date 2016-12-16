/**
 * 
 */

/**
 * @author kleber
 *
 */
public class Container {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Container(int x, int y, int width, int height) {
		this.x1=x;
		this.y1=y;
		this.x2=x1+width-1;
		this.y2=y2+height-1;
	}
	@Override
	public String toString(){
		String retorno="Container at ("+this.x1+","+this.y1+") to ("+this.x2+","+this.y2+")";
		return retorno;
	}
	public boolean collidesWith(Ball ball){
		if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() + ball.getRadius() >= this.x2) {
				ball.reflectHorizontal();
				return true;
		}
		if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() + ball.getRadius() >= this.y2) {
				ball.reflectVertical();
				return true;
		}		
		return false;
	}
}
