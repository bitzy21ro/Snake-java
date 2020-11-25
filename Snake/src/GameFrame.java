import javax.swing.JFrame;

public class GameFrame extends JFrame {
	GameFrame(){
		
		this.add(new GamePannel());
		this.setTitle("Slate");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
//		https://youtu.be/bI6e6qjJ8JQ?t=279
	}
}
