/*import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
class MyCanvas extends JComponent {
	  float x,y;
	  int radios;
	  public MyCanvas(float x,float y,int radios){
		  this.x=x;
		  this.y=y;
		  this.radios=radios;
	  }
	  public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval((int)(this.x-this.radios), (int)(this.y-this.radios), (int)(this.radios), (int)(this.radios) );
		g.setColor(Color.BLUE);
	    g.drawRect (50, 50, 300, 300);  
	  }
}*/
public class Test {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(0, 0, 100, 100);*/
		Ball ball = new Ball(50, 50, 5, 10, 30);
		Container box = new Container(0, 0, 100, 100);
		for (int step = 0; step < 100; ++step) {
			ball.move();
			box.collidesWith(ball);		
			//window.getContentPane().add(new MyCanvas(ball.getX(),ball.getY(),ball.getRadius()));			
			System.out.println(ball); // manual check the position of the ball
		}		
		//window.setVisible(true);
	}
}

