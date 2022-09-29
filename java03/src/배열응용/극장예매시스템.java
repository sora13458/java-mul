package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(750, 600);

		FlowLayout flow = new FlowLayout(); // 버튼 위치 일일히 지정해주지 않기 위해 왼쪽부터 알아서 붙는 부품을 만들어줌
		f.setLayout(flow);

		int[] seat = new int[500];

		for (int i = 0; i < 500; i++) {
			JButton b = new JButton(i + "");
			f.add(b);

			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();// 버튼 위의 글자를 가져다 주는 문장
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false); // 한번 누른 버튼 더 못누르게 하는 법
					b.setBackground(Color.gray);
					int index = Integer.parseInt(s);
					seat[index] = 1; // 예약 완료되면 1을 배열에 집어넣어줌

					int count = 0;
					for (int i = 0; i < seat.length; i++) {
						if (i == 1) {
							count++;
						}
					}

					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개");

					// 한자리당 금액은 13,000 결제금액을 출력해주세요
					int pay = 13000;
					JOptionPane.showMessageDialog(f, "예매 총액은 " + pay + "원");

				}
			});
		}

		f.setVisible(true);

	}

}
