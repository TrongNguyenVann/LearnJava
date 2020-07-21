
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainClass extends JFrame {
	private JButton clickMeButton;
	private JButton clickMeButton2;

	int clickedCount1 = 0;
	int clickedCount2 = 0;


	public MainClass() {
		// Create a panel
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(new JLabel("Test Button 1"));
		clickMeButton = new JButton("Click me to count");
		panel.add(clickMeButton);
		panel.add(new JLabel("Test Button 2"));
		clickMeButton2 = new JButton("Click2 me to count");
		panel.add(clickMeButton2);

		// Listen for event from button 1
		// clickMeButton.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {
		// 		JOptionPane.showMessageDialog(null, "I am button 1");
		// 	}
		// });
		clickMeButton.addActionListener(new Button1Handler());

		// Listen for event from button 2
		// clickMeButton2.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {
		// 		JOptionPane.showMessageDialog(null, "I am button 2");
		// 	}
		// });
		clickMeButton2.addActionListener(new Button2Handler());

		this.setContentPane(panel);
		// Set window size
		this.setSize(640, 480);

		// Exit after closing window
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Show window
		this.setVisible(true);
	}

	private class Button1Handler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clickMeButton.setText("Clicked " + ++clickedCount1);
		}
	}

	private class Button2Handler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			clickMeButton2.setText("Clicked " + ++clickedCount2);
		}
	}

	public static void main(String[] args) {
		MainClass myWindow = new MainClass();
		// my
	}
}