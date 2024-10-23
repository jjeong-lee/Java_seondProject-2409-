package alone;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import chapter16.lambda.Add;

public class Card {

	
	JButton jb1;
	JButton jb2;
	JButton jb3;
	JButton jb4;
	private int cardNum;
	String answer;
	int count=0;
	
	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	
	public void createCard() {
		
		ImageIcon io = new ImageIcon("IMG/Oon.png");
		ImageIcon ix = new ImageIcon("IMG/Xon.png");

		jb1 = new JButton(io);
		jb2 = new JButton(io);
		jb3 = new JButton(ix);
		jb4 = new JButton(ix);
		
		
		
		
		
		
		jb1.add(jb1);
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				returnValue ("O");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				returnValue ("O");
				
			}
		});
		
	
	
	}

	
	public void returnValue(String a) {
		if(answer.equals(a)) {
			JOptionPane.showMessageDialog(null,"정답입니다!");
		}else {
			JOptionPane.showMessageDialog(null, "땡");
		}
		count++;
		
		if(count>4) {
			jb1.setEnabled(false);
			jb2.setEnabled(false);
			jb3.setEnabled(false);
			jb4.setEnabled(false);
		}
			
		
	}
	
	
	
}
