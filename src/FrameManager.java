import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.Random;

public class FrameManager extends JPanel implements ActionListener, KeyListener {

	Player p = new Player();
	int createNewRowEnemyTimer = 120;
	ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	ArrayList<Enemy> enemies = new ArrayList<Enemy>();
	Rectangle bullet;
	Rectangle enemy;
	
	public void paintComponent(Graphics g){		
		super.paintComponent(g);
		createNewRowEnemyTimer++;
		if(createNewRowEnemyTimer >=120){
			for(int i=5;i<1750;i+=70){
				enemies.add(new Enemy(i+70));
			}
			createNewRowEnemyTimer = 0;
		}
		p.draw(g);
		
		for(Bullet b : bullets){
			b.draw(g);
		}
		for(Bullet b : bullets){
			b.move();
		}
		
		for(Enemy e : enemies){
			e.draw(g);
			e.move();
		}
		Enemy toRemove_enemy = null;
		Bullet toRemove_bullet = null;
		for(Bullet b : bullets){
			for(Enemy e : enemies){
				bullet = new Rectangle(b.getXpos(),b.getYpos(),5,5);
				enemy = new Rectangle(e.getXpos(),e.getYpos(),60,60);
				if(enemy.intersects(bullet)){
					toRemove_bullet = b;
					toRemove_enemy = e;
					g.setColor(Color.magenta);
					g.fillRect(b.getXpos(), b.getYpos(), b.getSize(), b.getSize());
					g.fillRect(e.getXpos(), e.getYpos(), e.getSize(), e.getSize());
				}
			}
		}
		if(toRemove_bullet!= null && toRemove_enemy != null){
			bullets.remove(toRemove_bullet);
			enemies.remove(toRemove_enemy);
		}
		this.setBackground(Color.black);
		try { Thread.sleep(50); } catch (Exception e) {System.out.println("error"); }
		repaint();
	}
	public FrameManager(){
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);		
	}
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP){
			p.move(1);
		}
		else if(code == KeyEvent.VK_DOWN){
			p.move(2);
		}
		else if(code == KeyEvent.VK_LEFT){
			p.move(3);
		}
		else if(code == KeyEvent.VK_RIGHT){
			p.move(4);			
		}
		else if (code == KeyEvent.VK_SPACE){
			bullets.add(new Bullet(p.getXpos() + (p.getSize()/2),p.getYpos()-p.getSize()-5));
		}
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
