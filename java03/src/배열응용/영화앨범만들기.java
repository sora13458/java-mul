package 배열응용;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화앨범만들기 {

	//전체 영역에서 변수 사용하기 위해 현재 위치를 알려주는 함수를 넣어줘야함
	static int start = 2; //전역변수 설정
	
	public static void main(String[] args) {
		
		String[] title = {"공조", "아바타2", "육사오", "정직한 후보" ,"헌트"};
		String[] img = {"공조.jpg", "아바타2.jpg", "육사오.jpg", "정직한 후보.jpg" ,"헌트.jpg"};
		double[] score = {8.03, 9.57, 8.71, 7.81, 8.50};
		
		JFrame f = new JFrame();
		f.setBackground(new Color(175, 223, 243));
		f.setSize(600, 600);
		
		JLabel top = new JLabel("육사오");
		top.setBackground(new Color(175, 223, 243));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel under = new JLabel("8.71");
		under.setBackground(new Color(175, 223, 243));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//왼쪽 버튼 클릭 시 처리하고 싶은 내용 넣기
				//제목이 표시된 라벨,포스터,평점 변겅해야함
				if (start > 0) {
					start = start - 1;
					top.setText(title[start]);
					under.setText(score[start] + "점");
					//가운데 사진 바꿔끼는 방법
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "끝입니다");
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 4) {
					start = start + 1;
					top.setText(title[start]);
					under.setText(score[start] + "점");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "끝입니다");
				}
				
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 128));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);
		
	}

}
