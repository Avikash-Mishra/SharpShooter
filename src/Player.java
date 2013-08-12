import java.awt.*;

public class Player {
	int Xpos = 915;
	int Ypos = 500;
	int size = 35;
	
	
	
	
	/*Constructor for the player class**/
	public Player (){}
	
	
	public void draw(Graphics g){
		//draw the center square
		g.setColor(Color.yellow);
		g.fillRect(this.Xpos, this.Ypos, this.size, this.size);
		
		//draw the left square
		g.setColor(Color.red);
		g.fillRect(this.Xpos-this.size, this.Ypos, this.size, this.size);
		
		//draw the right square
		g.fillRect(this.Xpos+this.size, this.Ypos, this.size, this.size);
		
		//draw the top square
		g.fillRect(this.Xpos, this.Ypos-this.size, this.size, this.size);
		
	}
	
	
	
	public int getSize(){return this.size;}
	public int getXpos(){return this.Xpos;}
	public int getYpos(){return this.Ypos;}

	/*Method call to move the player, requires string**/
	public void move(int dir) {
		int step = 15;
		switch(dir){
		case 1 :{
			this.Ypos = this.Ypos - step;
			break;
		}
		
		case 2 :{
			if(this.Ypos + step > 968)
			{
				break;
			}
			else{
				this.Ypos = this.Ypos + step;
			}
			break;
		}
		
		case 3 :{
			if(this.Xpos - step < 50){
				break;
			}
			else{
				this.Xpos = this.Xpos - step;
			}
			break;
		}
		case 4 :{
			if(this.Xpos + step > 1810){
				break;
			}
			else{
				this.Xpos = this.Xpos + step;
			}
			break;
		}
		default: {
			break;
		}
		
		
		}
		
	}
	
	
}
