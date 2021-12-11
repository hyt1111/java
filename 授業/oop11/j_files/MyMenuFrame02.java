import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyMenuFrame02 extends JFrame implements ActionListener{

	protected JMenuBar menuBar = new JMenuBar();
	protected JMenu menu = new JMenu("File"); 

	private JMenuItem saveItem = new JMenuItem("Save");		
	private JMenuItem printItem = new JMenuItem("Print...");		
	private JMenuItem exitItem = new JMenuItem("Exit");
	
	MyMenuFrame02(String title){
		setTitle(title);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setJMenuBar(menuBar);
		menuBar.add(menu);
		
		menu.add(saveItem);
		menu.add(printItem);
		menu.add(exitItem);

		saveItem.addActionListener(this);
		printItem.addActionListener(this);
		exitItem.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e){
		
		JMenuItem selectedItem = (JMenuItem)e.getSource();
		if(selectedItem == saveItem){
			JOptionPane.showMessageDialog(null, "\"Save\" is unsupported.");
		}else if(selectedItem == printItem){
			JOptionPane.showMessageDialog(null, "\"Print...\" is unsupported.");
		}else if(selectedItem == exitItem){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		MyMenuFrame02 mfr = new MyMenuFrame02("MyMenuFrame02");
		mfr.setVisible(true);
	}
}
