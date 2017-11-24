import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{

	Hello(String title){

		setTitle(title);
		setSize(200,200);
		setLocation(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Click");
		JPanel pnl = new JPanel();
		pnl.add(btn);

		Container cp = getContentPane();
		cp.add(pnl,BorderLayout.CENTER);

	}
		public static void main(String[] args){
			Hello hello = new Hello("aloha");
			hello.setVisible(true);
	}

}
