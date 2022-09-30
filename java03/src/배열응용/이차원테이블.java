package 배열응용;

import javax.jws.Oneway;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class 이차원테이블 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500,300);
		
		String[] header = {"a", "b", "c"};
		String[][] contents = {
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"}				
		};
		
		contents[0][0] = "999";
		contents[7][0] = "999";
		
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
			
		
		f.setVisible(true);
		
		
		for (int i = 0; i < contents.length; i++) {//행 출력해주는 for문
			for (int j = 0; j < contents[i].length; j++) {// 열 출력해주는 for문
				System.out.print(contents[i][j] + " " );
			}
			System.out.println();
		}
	}

}
