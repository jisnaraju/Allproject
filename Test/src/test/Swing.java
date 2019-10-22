package test;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class Swing {

	public static void main(String[] args) {
		 JFrame f=new JFrame();  
	  
		    JButton b=new JButton("Submit");  
		    b.setBounds(150,350,100,20); 
		    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
		    l=new JLabel("REGISTERATION");
		    l.setBounds(50,10, 100,30);
		    l1=new JLabel("First Name :");  
		    l1.setBounds(50,50, 100,30); 
		    l2=new JLabel("Last Name :");  
		    l2.setBounds(50,100, 100,30);
		    l3=new JLabel("Password :");
		    l3.setBounds(50,150, 100,30);
		    l4=new JLabel("Re-Password :");
		    l4.setBounds(50,200, 100,30);
		    l5=new JLabel("Mob :");
		    l5.setBounds(50,250, 100,30);
		    l6=new JLabel("Email : ");
		    l6.setBounds(50,300, 100,30);
		    l7=new JLabel();
		    l7.setBounds(50,400, 100,30);
		    l8=new JLabel();
		    l8.setBounds(50,450, 100,30);
		    l9=new JLabel();
		    l9.setBounds(50,500, 100,30);
		    l10=new JLabel();
		    l10.setBounds(50,550, 100,30);
		    l11=new JLabel();
		    l11.setBounds(50,600, 100,30);
		    l12=new JLabel();
		    l12.setBounds(50,650, 100,30);
		    JTextField tf1=new JTextField();  
		    tf1.setBounds(150,50, 150,20); 
		    
		    JTextField tf2=new JTextField();  
		    tf2.setBounds(150,100, 150,20); 
		    
		    JTextField tf3=new JTextField();
		    tf3.setBounds(150,150, 150,20);
		    
		    JTextField tf4=new JTextField();
		    tf4.setBounds(150,200, 150,20);
		    
		    JTextField tf5=new JTextField();
		    tf5.setBounds(150,250, 150,20);
		    
		    JTextField tf6=new JTextField();
		    tf6.setBounds(150,300, 150,20);
		   // JTextField tf7=new JTextField();
		    //tf7.setBounds(150,400, 150,20);
		    b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e){  
		             l7.setText(tf1.getText());
		             l8.setText(tf2.getText());
		             l9.setText(tf3.getText());
		             l10.setText(tf4.getText());
		             l11.setText(tf5.getText());
		             l12.setText(tf6.getText());
		          
				        }  
				    });  
		    
		    
		    f.add(l1); f.add(l2);f.add(l3);f.add(l4); f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);f.add(l12);
		    f.add(b);f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);f.add(l);
		    
		    f.setSize(400,500);  
		    f.setLayout(null);  
		    f.setVisible(true);  
	}
}