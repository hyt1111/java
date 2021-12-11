import javax.swing.*;//JFrame クラスを含む
import java.awt.event.*;//ActionListener インターフェースを含む
import java.awt.*;//Container クラス，BorderLayout クラスを含む

class JButtonSampleBorderLayout extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was pushed!");
	}

	JButtonSampleBorderLayout(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//レイアウトマネージャーによるコンポーネントの配置
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout() );
		
		//ボタンの生成
		JButton btn1 = new JButton("Button-NORTH");
		btn1.addActionListener(this);
		contentPane.add(btn1,BorderLayout.NORTH);
		
		JButton btn2 = new JButton("Button-EAST");
		btn2.addActionListener(this);
		contentPane.add(btn2,BorderLayout.EAST);
		
		JButton btn3 = new JButton("Button-WEST");
		btn3.addActionListener(this);
		contentPane.add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("Button-SOUTH");
		btn4.addActionListener(this);
		contentPane.add(btn4,BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("Button-CENTER");
		btn5.addActionListener(this);
		contentPane.add(btn5,BorderLayout.CENTER);
	}

	public static void main(String [] args){
		//JFrame クラスのインスタンスを生成
		JButtonSampleBorderLayout fr = new JButtonSampleBorderLayout();
		//フレームをディスプレイ画面に表示します
		fr.setVisible(true);
	}
}
