import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class MyMouseSample02_19rd142 extends JPanel{
	int clickCounter;	
	int xPanelSize;
	int yPanelSize;	
	int count=0;
	int x,y;
	Dimension size;

	MyMouseSample02_19rd142(int xPanelSize, int yPanelSize){
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
    }
   
	public static void main( String [] args ){
		MyMouseSample02_19rd142 panel = new MyMouseSample02_19rd142(500,400);
		panel.setPreferredSize(new Dimension(panel.xPanelSize, panel.yPanelSize));
		
		//JFrame fr = new JFrame();
		//MyMenuFrame02 fr = new MyMenuFrame02("MyMouseSample01");
		MyMenuFrame03 fr = new MyMenuFrame03("MyMouseSample01");
		
		fr.add(panel);
		fr.pack();
		fr.setVisible(true);	
	}
}

