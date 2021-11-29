import java.awt.Dimension;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class Spielfeld extends JPanel implements Runnable{

	
	private static final long serialVersionUID = 1L;
	
	private static final int WIDTH = 400, HEIGHT = 400;

	
	private Thread thread; 
	
	private boolean running;
	
	public Spielfeld() {
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	    
}
	public void start () {
		running = true;
		thread  = new Thread (this);
		thread.start();
	}
	public void stop () {
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void tick () {
		
	}
	public void paint (DebugGraphics g, Object Color) {
		g.clearRect(0, 0, WIDTH, HEIGHT);
		g.setColor(getBackground());
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		for(int i = 0 ; i < WIDTH/10 ; i++) {
			g.drawLine(i * 10, 0, i *10, HEIGHT);
		}
		for(int i = 0 ; i < WIDTH/10 ; i++) {
			g.drawLine(0, i * 10 ,HEIGHT, i *10);
			

		}
	}
		
		
	@Override
	public void run() {
	  while (running) {
		  tick();
		  repaint();
	  }
		
	}
}