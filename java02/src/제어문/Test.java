package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Test {

		public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setSize(400, 400);
			
			JButton btnNewButton = new JButton("목록");
			btnNewButton.setFont(new Font("배달의민족 연성", Font.BOLD, 14));
			f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
			
			JButton btnNewButton_1 = new JButton("선택");
			btnNewButton_1.setBackground(new Color(128, 64, 64));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
			
			JButton btnNewButton_2 = new JButton("New button");
			btnNewButton_2.setBackground(new Color(255, 128, 128));
			f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
			
			JButton btnNewButton_3 = new JButton("패널2");
			f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
			f.setVisible(true);
		}

	}