import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Icon;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Graphics;


public class MyWork extends JFrame implements KeyListener{
JLabel label;	
MyWork(){	
	
	
	
	
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500,500);
this.setLayout(null);
this.addKeyListener(this);
this.setVisible(true);

label = new JLabel();

label.setBounds(0, 0, 100, 100);
label.setBackground(Color.blue);
label.setOpaque(true);




this.add(label);
this.setVisible(true);

}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	switch(e.getKeyCode()) {
	case 37: label.setLocation(label.getX()-10, label.getY());
	   break;
	}
	switch(e.getKeyCode()) {
	case 38: label.setLocation(label.getX(), label.getY()-10);
	   break;
	}
	switch(e.getKeyCode()) {
	case 39: label.setLocation(label.getX()+10, label.getY());
	   break;
	}
	switch(e.getKeyCode()) {
	case 40: label.setLocation(label.getX(), label.getY()+10);
	   break;
	}
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	//public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY());
		   break;
		}
		switch(e.getKeyCode()) {
		case 38: label.setLocation(label.getX(), label.getY()-10);
		   break;
		}
		switch(e.getKeyCode()) {
		case 39: label.setLocation(label.getX()+10, label.getY());
		   break;
		}
		switch(e.getKeyCode()) {
		case 40: label.setLocation(label.getX(), label.getY()+10);
		   break;
		}
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	//System.out.println("you released key char : " + e.getKeyChar());
	System.out.println("you released key code : " + e.getKeyCode());

}
}