import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;
import java.util.LinkedList;


class MyMouseSample03_19rd142 extends JPanel{
	int clickCounter;	
	int xPanelSize;
	int yPanelSize;	
	int count=0;
	int x,y;
	List<Integer> x_1 = new LinkedList<Integer>();
	List<Integer> y_1 = new LinkedList<Integer>();
	Dimension size;

	MyMouseSample03_19rd142(int xPanelSize, int yPanelSize){
		clickCounter=0;	
		this.xPanelSize = xPanelSize;
		this.yPanelSize = yPanelSize;
		
		addMouseMotionListener(new MyMouseMotionListener());
		addMouseListener(new MyMouseActionListener()); 
	}
	
	class MyMouseMotionListener extends MouseMotionAdapter{
		public void mouseMoved(MouseEvent evt){
			x = evt.getX();
			y = evt.getY();

			repaint();
		}
	} 
	class MyMouseActionListener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			x_1.add(count,x);
			y_1.add(count,y);
			count++;
    			System.out.println(+count+"âÒñ⁄");
			System.out.println("ç¿ïW( "+x+" , "+y+" )");
    			repaint();
  		}
	}

    protected void paintComponent(Graphics g) {
    	super.paintComponent(g); 
		size = getSize();
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, size.width, size.height);
		
		g.setColor(Color.GREEN);
		g.drawLine(x, 0, x, size.height);
		g.drawLine(0, y, size.width, y);
		for(int i = 0; i < count; i++)
		g.fillOval(x_1.get(i), y_1.get(i), 10, 10);
    
	}
   
	public static void main( String [] args ){
		MyMouseSample03_19rd142 panel = new MyMouseSample03_19rd142(500,400);
		panel.setPreferredSize(new Dimension(panel.xPanelSize, panel.yPanelSize));
		
		//JFrame fr = new JFrame();
		//MyMenuFrame02 fr = new MyMenuFrame02("MyMouseSample01");
		MyMenuFrame03 fr = new MyMenuFrame03("MyMouseSample01");
		
		fr.add(panel);
		fr.pack();
		fr.setVisible(true);	
	}
}

