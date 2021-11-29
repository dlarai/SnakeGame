import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.w3c.dom.css.RGBColor;
public class Main {

	public Main() {
	
	    JFrame frame = new JFrame();
	    Spielfeld spielfeld = new Spielfeld();
	    
	    
	    frame.add(spielfeld);		
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setTitle("CLEAN CODE SNAKEGAME");
	   
	 
	    
	    frame.pack();
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	
	}
	
	public static void main(String[] args) {
		
	new Main ();
}
}