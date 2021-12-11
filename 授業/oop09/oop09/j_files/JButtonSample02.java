import javax.swing.*;//JFrame クラスを含む
import java.awt.event.*;//ActionListener インターフェースを含む
import java.awt.*;//Container クラス，FlowLayout クラスを含む

class JButtonSample02 extends JFrame implements ActionListener{
	JButton btn1 = new JButton("Button-1");
	JButton btn2 = new JButton("Button-2");
	JButton btn3 = new JButton("Button-3");
	
	public void actionPerformed(ActionEvent e){
		//押されたボタンの参照をselectedButton に代入する
		//Object obj = e.getSource();
		//JButton selectedButton = (JButton)obj;
		JButton selectedButton = (JButton)e.getSource();
		
		if(selectedButton==btn1){
			System.out.println("Button-1 was pushed!");
		}else if(selectedButton==btn2){
			System.out.println("Button-2 was pushed!");
		}else{
			System.out.println("Button-3 was pushed!");
		}
	}

	JButtonSample02(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//レイアウトマネージャーによるコンポーネントの配置
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout() );
		
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		btn3.addActionListener(this);
		contentPane.add(btn3);
	}

	public static void main(String [] args){
		JButtonSample02 fr = new JButtonSample02();
		fr.setVisible(true);
	}
}
