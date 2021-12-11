import javax.swing.*;//JFrame クラスを含む
import java.awt.event.*;//ActionListener インターフェースを含む
import java.awt.*;//Container クラス，FlowLayout クラスを含む
class JButtonSample03 extends JFrame implements ActionListener{
	JButton btn1 = new JButton("Button-1");
	JButton btn2 = new JButton("Button-2");
	JButton btn3 = new JButton("Button-3");
	JButton btn4 = new JButton("Button-4");
	JButton btn5 = new JButton("Button-5");
	JButton btn6 = new JButton("Button-6");

	public void actionPerformed(ActionEvent e){
		//押されたボタンの参照をselectedButton に代入する
		JButton selectedButton = (JButton)e.getSource();
		if(selectedButton==btn1){
			System.out.println("Button-1 was pushed!");
		}else if(selectedButton==btn2){
			System.out.println("Button-2 was pushed!");
		}else if(selectedButton==btn3){
			System.out.println("Button-3 was pushed!");
		}else if(selectedButton==btn4){
			System.out.println("Button-4 was pushed!");
		}else if(selectedButton==btn5){
			System.out.println("Button-5 was pushed!");
		}else{
			System.out.println("Button-6 was pushed!");
		}
	}
	
	JButtonSample03(){
		setSize(500, 300); 
		setTitle("Frame title"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		JPanel panel1 = new JPanel();
		panel1.setLayout(null);

		btn1.setBounds(0,100, 100, 100);
		panel1.add(btn1);

		btn2.setBounds(100,100,  100, 100);
		panel1.add(btn2);

		btn3.setBounds(200,100,  100, 100);
		panel1.add(btn3);
		
		btn4.setBounds(400,100, 100,100/3);
		panel1.add(btn4);

		btn5.setBounds(400,400/3,100,100/3);
		panel1.add(btn5);
	
		btn6.setBounds(400,500/3,100,100/3);
		panel1.add(btn6);

		getContentPane().add(panel1, BorderLayout.CENTER);
	}
	
	public static void main(String [] args){
		JButtonSample03 fr = new JButtonSample03();
		fr.setVisible(true);
		fr.setResizable(false);
	}
}
