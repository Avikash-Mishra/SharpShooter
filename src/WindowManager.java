import java.awt.Color;
import java.awt.Frame;
import javax.swing.*;

public class WindowManager {
	public static void main (String[] args){
		JFrame j = new JFrame("Title");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FrameManager theFrame = new FrameManager();
		j.add(theFrame);
		j.setSize(400,250);
		j.setExtendedState(Frame.MAXIMIZED_BOTH);
		j.setVisible(true);	
		j.setResizable(true);
		j.setBackground(Color.black);
		
		
	}
}
