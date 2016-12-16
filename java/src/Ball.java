public class Ball {
	private float x,y;
	private int radius;
	private float xDelta;
	private float yDelta;
	public Ball(float x,float y,int radius,int speed,int direction) {
		this.y=y;
		this.x=x;
		this.radius=radius;
		this.xDelta=(float) ((float)speed*Math.cos(Math.toRadians(direction)));
		this.yDelta=(float) ((float)-speed*Math.sin(Math.toRadians(direction)));
		
	}
	public void move(){
		this.x=this.x+this.xDelta;
		this.y=this.y+this.yDelta;
	}
	public void reflectHorizontal(){
		this.xDelta=-this.xDelta;
	}
	public void reflectVertical(){
		this.yDelta=-this.yDelta;
	}	
	@Override
	public String toString(){
		String retorno="Ball at ("+this.x+","+this.y+") of velocity ("+this.xDelta+","+this.yDelta+")";
		return retorno;
		
	}
	
	public float getxDelta() {
		return this.xDelta;
	}
	public float getyDelta() {
		return this.yDelta;
	}
	public float getX() {
		return this.x;
	}
	public float getY() {
		return this.y;
	}
	public int getRadius() {
		return this.radius;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}
