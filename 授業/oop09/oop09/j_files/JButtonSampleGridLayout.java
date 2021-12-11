import javax.swing.*;//JFrame クラスを含む
import java.awt.event.*;//ActionListener インターフェースを含む
import java.awt.*;//Container クラス，GridLayout クラスを含む

class JButtonSampleGridLayout extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was pushed!");
	}

	JButtonSampleGridLayout(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//レイアウトマネージャーによるコンポーネントの配置
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new GridLayout(3,2) );
		
		JButton btn1 = new JButton("Button-1");
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Button-2");
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Button-3");
		btn3.addActionListener(this);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("Button-4");
		btn4.addActionListener(this);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("Button-5");
		btn5.addActionListener(this);
		contentPane.add(btn5);
	}
	
	public static void main(String [] args){
		//JFrame クラスのインスタンスを生成
		JButtonSampleGridLayout fr = new JButtonSampleGridLayout();
		//フレームをディスプレイ画面に表示します
		fr.setVisible(true);
	}
}
