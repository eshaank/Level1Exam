import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Level1ExamCoding implements ActionListener {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
public static void main(String[] args){
	Level1ExamCoding hi = new Level1ExamCoding();
	hi.ColorTeacher();
}
void ColorTeacher(){
frame.setVisible(true);
frame.setSize(700, 100);
frame.setTitle("Color Teacher");
	frame.add(panel);
	panel.add(label);
	panel.add(button1);
	button1.setBackground(Color.yellow);
	button1.setOpaque(true);
	button1.addActionListener(this);
	
	panel.add(button2);
	button2.setBackground(Color.RED);
	button2.setOpaque(true);
	button2.addActionListener(this);
	
	panel.add(button3);
	button3.setBackground(Color.BLUE);
	button3.setOpaque(true);
	button3.addActionListener(this);
	
	panel.add(button4);
	button4.setBackground(Color.GREEN);
	button4.setOpaque(true);
	button4.addActionListener(this);
	
	frame.pack();
}

void speak(String words){
	try{
		Runtime.getRuntime().exec("say " + words);
	} catch(IOException e){
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == button1){
	speak("yellow");
}
else if (e.getSource() == button2){
	speak("red");
}
else if (e.getSource() == button3){
	speak("blue");
}
else{
	speak("green");
}
}
}
