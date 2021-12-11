import javax.swing.*;//JFrame クラスを含む
import java.awt.*;//Container クラス，BorderLayout クラスを含む

class JPanelSampleBorderLayout extends JFrame{
	JPanelSampleBorderLayout(){
		setSize(500, 400);
		setTitle("Frame title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//レイアウトマネージャーによるコンポーネントの配置
		Container contentPane = this.getContentPane();
		contentPane.setLayout(new BorderLayout() );
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLUE);
		contentPane.add(panel1,BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		contentPane.add(panel2,BorderLayout.EAST);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.GREEN);
		contentPane.add(panel3,BorderLayout.WEST);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.ORANGE);
		contentPane.add(panel4,BorderLayout.SOUTH);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(Color.white);
		contentPane.add(panel5,BorderLayout.CENTER);
	}

	public static void main(String [] args){
		//JFrame クラスのインスタンスを生成
		JPanelSampleBorderLayout fr = new JPanelSampleBorderLayout();
		//フレームをディスプレイ画面に表示します
		fr.setVisible(true);
	}
}