//Made with help from a youtube video by Bro Code https://youtu.be/bI6e6qjJ8JQ?si=0ssaqhbCrTBOORgO
// Added various functionalities such as preventing apples from spawning on squares that the snake's trail is currently on
import javax.swing.JFrame;

public class SnakeFrame extends JFrame{

	SnakeFrame(){
			
		this.add(new SnakePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
