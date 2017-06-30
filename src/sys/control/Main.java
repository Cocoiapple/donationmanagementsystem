package sys.control;

import javax.swing.JFrame;

import sys.GetResourceClass;
import sys.view.HeadPanel;
import sys.view.MainFrame;


public class Main {

	public static void main(String[] args){
		
		
		
		JFrame frame=new MainFrame();
		HeadPanel headPanel=new HeadPanel(GetResourceClass.class.getResource("image/head_bg.png"));
		frame.getContentPane().add(headPanel);
		frame.setVisible(true);
		System.out.println(frame.getContentPane().getWidth()+","+frame.getContentPane().getHeight());
	}
}
