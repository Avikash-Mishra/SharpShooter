import java.awt.Color;
import java.awt.Graphics;


public class Bullet {
	
	int Xpos = 0;
	int Ypos = 0;
	int size = 5;

	public Bullet(int x, int y) {
		this.Xpos = x;
		this.Ypos = y;
	}
	
	public void move(){
		int step = 10;
		this.Ypos -= step;
	}
	
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.drawRect(this.Xpos, this.Ypos, size, size);
		
	}
	public int getSize(){return this.size;}
	public int getXpos(){return this.Xpos;}
	public int getYpos(){return this.Ypos;}
	
	

}
