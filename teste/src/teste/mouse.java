package teste;

import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;
import java.awt.PointerInfo;
import java.awt.Toolkit;

public class mouse {
	
	public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        
        
        for(int i=0; i<1; i++) {
        	System.out.print("X = " + (int)MouseInfo.getPointerInfo().getLocation().getX());
        	System.out.print(" Y = " + (int)MouseInfo.getPointerInfo().getLocation().getY());
        	Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        	//System.out.println(screen.getSize());
        	robot.mouseMove(random.nextInt((int)screen.getWidth()), random.nextInt((int)screen.getHeight()));
        	//robot.mousePress(InputEvent.BUTTON3_MASK);
            //robot.mouseRelease(InputEvent.BUTTON3_MASK);
        	robot.delay(3000);
        }
	
	}

}
