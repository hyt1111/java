import javax.swing.*;//JFrame クラスを含む
import java.awt.event.*;//ActionListener インターフェースを含む
import java.awt.*;//Container クラス，FlowLayout クラスを含む

class JButtonSampleFlowLayout extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("Button was pushed!");
	}
	
	JButtonSampleFlowLayout(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//レイアウトマネージャーによるコンポーネントの配置
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new FlowLayout() );
		
		JButton btn1 = new JButton("Button-1");
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Button-2");
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("Button-3");
		btn3.addActionListener(this);
		contentPane.add(btn3);
	}

	public static void main(String [] args){
		//JFrame クラスのインスタンスを生成
		JButtonSampleFlowLayout fr = new JButtonSampleFlowLayout();
		//フレームをディスプレイ画面に表示します
		fr.setVisible(true);
	}
}
