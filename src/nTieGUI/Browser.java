package nTieGUI;

import javax.swing.*;
import java.awt.event.*;

public class Browser {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		final JTextField url = new JTextField(20);
		url.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					OpenBrowser.openURL(url.getText().trim());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}}});
		JButton button = new JButton("Hentaiify");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					OpenBrowser.openURL(url.getText().trim());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(new JLabel("Sauce:"));
		panel.add(url);
		panel.add(button);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(300, 100);
		frame.setResizable(false);
		frame.setTitle("Baka, Hentai!");
	}
}