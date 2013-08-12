import java.awt.Color;
import java.awt.Graphics;


public class Enemy {
	
	int Xpos = 10;
	int Ypos = 5;
	int size = 60;
	
	public Enemy(int x){
		this.Xpos = x;
		
	}
	
	public void move(){
		this.Ypos += 1;	
	}
	
	public void draw(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(Xpos, Ypos, size, size);
		
	}
	
	public int getSize(){return this.size;}
	public int getXpos(){return this.Xpos;}
	public int getYpos(){return this.Ypos;}
	
}
