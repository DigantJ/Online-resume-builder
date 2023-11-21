
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LandingPage extends JFrame implements ActionListener {
	public JLabel l1;
	public JButton b1,b2;
	public Font f;
	
	public LandingPage() {
		ImageIcon image = new ImageIcon("rb-logo.png"); 
		this.setIconImage(image.getImage());                
		this.getContentPane().setBackground(new Color(0X6666ff)); 
		this.setTitle("Resume Builder");    
		f = new Font("SansSerif", Font.BOLD, 40); 

		l1 = new JLabel("Resume Builder");
		l1.setForeground(new Color(0X000075));
		l1.setFont(f);
		b1=new JButton("Login"); 
		b2=new JButton("Sign Up");  
		b1.setFocusable(false);
		b2.setFocusable(false);
		b1.setForeground(Color.white); 
		b1.setFont(new Font("SansSerif",Font.PLAIN,17)); 
		b2.setFont(new Font("SansSerif",Font.PLAIN,17));
		b1.setBackground(new Color(0X000075)); 
		b2.setForeground(Color.white);
		b2.setBackground(new Color(0X000075));

		
		l1.setBounds(85, 50, 400, 100);
		b1.setBounds(120,200,100,50);
		b2.setBounds(240,200,100,50);

		
		add(l1);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);

		setLayout(null); 
		setSize(500,500);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);    
		this.setLocationRelativeTo(null);
		setVisible(true);   

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getSource())==b1) {   
			new LoginUI();      
			this.dispose();     
		}
		else{                   
			new SignupUI();     
			this.dispose();    
		}

	}
}

//end of the landing page
