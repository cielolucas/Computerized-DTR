package dtr;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class help {  
	   JFrame f= new JFrame("Help"); 
	   JButton calendar;
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt2 = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt1 = new Font("Times New Roman",Font.PLAIN,16);
	   Font fnt3 = new Font("Times New Roman",Font.BOLD,70);
	   Font fnt4 = new Font("Arial",Font.BOLD,35);
	   Font fnt5 = new Font("Arial",Font.BOLD,40);
	   Font fnt6 = new Font("Arial",Font.PLAIN,13);
	   
	   JPanel panel=new JPanel(); 
	   JPanel panel1=new JPanel();
	   JPanel panel2=new JPanel();
	   JPanel panel3=new JPanel();
	   JPanel panel4=new JPanel();
	   JPanel panel44=new JPanel();
	   JPanel panel5=new JPanel();
	   JPanel panel55=new JPanel();
	   
	   JPanel panel6=new JPanel();
	   JPanel panel7=new JPanel();
	   JPanel panel8=new JPanel();
	   JPanel panel9=new JPanel();
	   JPanel panel10=new JPanel();
	   JPanel panel11=new JPanel();


	   static JLabel label2 = new JLabel(); 
	   JButton logout = new JButton();
	   JButton about = new JButton();
	   JButton schedportal = new JButton();
	   JButton help = new JButton();
	   JButton contact = new JButton();
	   static JLabel label3 = new JLabel();

     help() {  
    	 try {
             f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("gradient2.png")))));} 
    	 
    	 catch (IOException e) {
             e.printStackTrace();}
    	 
    	JLabel label0 = new JLabel("How can we help you?");
        label0.setBounds(450, 50, 700, 100);
        label0.setFont(fnt5);
        label0.setForeground(Color.white); 
    	 
    	logout = new JButton("Logout");
 		logout.setBackground(new Color(102,120,153));
 		logout.setForeground(Color.white);
 		logout.setOpaque(true);
 		logout.setBorderPainted(false);
 		logout.setBounds(0,0,140,70);
 		panel11.setLayout(null); 
 		panel11.setBounds(1145,0,1300,70);    
 		panel11.setBackground(new Color(102,0,153)); //bg
 		panel11.add(logout);
 	     
 		about = new JButton("About");
 		about.setBackground(Color.white);
 		about.setForeground(Color.black);
 		about.setOpaque(true);
 		about.setBorderPainted(false);
 		about.setBounds(0,0,100,70);
 		panel8.setLayout(null); 
 		panel8.setBounds(845,0,100,70);
 		panel8.setBackground(Color.white); //bg
 		panel8.add(about);   
 		
 		help = new JButton("Help");
		help.setBackground(Color.white);
		help.setForeground(Color.black);
		help.setOpaque(true);
		help.setBorderPainted(false);
		//delete.addActionListener(this);
		help.setBounds(0,0,100,70);
		panel9.setLayout(null); 
		panel9.setBounds(945,0,100,70);
		panel9.setBackground(Color.white); //bg
		panel9.add(help);
		 
		contact = new JButton("");
		contact.setBackground(Color.white);
		contact.setForeground(Color.black);
		contact.setOpaque(true);
		contact.setBorderPainted(false);
		//delete.addActionListener(this);
		contact.setBounds(0,0,100,70);
		panel10.setLayout(null); 
		panel10.setBounds(1045,0,100,70);
		panel10.setBackground(Color.white); //bg
		panel10.add(contact);
    	 
    	f.getContentPane().setBackground(Color.WHITE);
	     
    	   schedportal = new JButton("Schedule Portal");
   		schedportal.setBackground(Color.white);
   		schedportal.setFont(fnt);
   		schedportal.setForeground(Color.black);
   		schedportal.setOpaque(true);
   		schedportal.setBorderPainted(false);
   		schedportal.setBounds(0,0,400,70);
   		panel6.setLayout(null);
   		panel6.setBounds(0,0,1300,70);
   		panel6.setBackground(Color.white);
   		panel6.add(schedportal);
		
		//BG
		//panel3.setLayout(null);
		//panel3.setBounds(695,220,550,130);
		//panel3.setBackground(Color.white);
		
		
		//Q1
		panel5.setLayout(null);
		panel5.setBounds(50,150,500,250);
		panel5.setBackground(Color.white);
		
        panel4.setLayout(null);
        panel4.setBounds(29,130,550,290);
        panel4.setBackground(new Color(255,255,255,150));
    
        	JLabel top = new JLabel("Q.");
        	JLabel top1 = new JLabel("A.");
        	top.setBounds(50,1,600,80);
        	top1.setBounds(50,1,600,230);
        	top.setFont(fnt4);
        	top1.setFont(fnt4);
        	top.setForeground(new Color(128,0,128));
        	top1.setForeground(Color.LIGHT_GRAY);
        
        //Q2
        panel55.setLayout(null);
		panel55.setBounds(50,440,500,230);
		panel55.setBackground(Color.white);
		
		panel44.setLayout(null);
		panel44.setBounds(27,430,550,250);
		panel44.setBackground(new Color(255,255,255,150));
        
			JLabel top2 = new JLabel("Q.");
			JLabel top22 = new JLabel("A.");
			top2.setBounds(10,1,600,60);
			top22.setBounds(10,1,600,200);
			top2.setFont(fnt4);
			top22.setFont(fnt4);
			top2.setForeground(new Color(128,0,128));
			top22.setForeground(Color.LIGHT_GRAY);
        
        JLabel desc = new JLabel ("How can I add schedule?");
        JLabel desc1 = new JLabel("STEP 1: Add schedule by clicking the ''ADD'' Button on the main screen.");
        JLabel desc2 = new JLabel("STEP 2: Enter name of file schedule. This will automatically create a textfile.");
        JLabel desc3 = new JLabel("STEP 3: Input required details for your Daily Time Record.");
        JLabel desc4 = new JLabel("STEP 4: You can view your DTR on the main screen or textfile you created.");
        JLabel desc5 = new JLabel("STEP 5: You have the option to edit the details you have inputted.");
        
        JLabel desc6 = new JLabel("How can I delete schedule?");
        JLabel desc7 = new JLabel("STEP 1: Delete schedule by clicking the ''ADD'' Button on the main screen.");
        JLabel desc8 = new JLabel("STEP 2: Enter the name of schedule you created");
        JLabel desc9 = new JLabel("STEP 3: Select the ''EDIT'' tab");
        JLabel desc10 = new JLabel("STEP 4: Then click ''DELETE'' button");
        
        desc.setBounds(50,1,600,150);
        desc1.setBounds(50,1,600,300);
        desc2.setBounds(50,1,600,350);
        desc3.setBounds(50,1,600,400);
        desc4.setBounds(50,1,600,455); 
        desc5.setBounds(50,1,600,500);
        
        desc6.setBounds(10,1,600,130);
        desc7.setBounds(10,1,600,270);
        desc8.setBounds(10,1,600,320);
        desc9.setBounds(10,1,600,370);
        desc10.setBounds(10,1,600,420);
    
        desc.setFont(fnt6);
        desc1.setFont(fnt6);
        desc2.setFont(fnt6);
        desc3.setFont(fnt6);
        desc4.setFont(fnt6);
        desc5.setFont(fnt6);
        
        desc6.setFont(fnt6);
        desc7.setFont(fnt6);
        desc8.setFont(fnt6);
        desc9.setFont(fnt6);
        desc10.setFont(fnt6);
   
        desc.setForeground(Color.black);
        desc1.setForeground(Color.black);
        desc2.setForeground(Color.black);
        desc3.setForeground(Color.black);
        desc4.setForeground(Color.black);
        desc5.setForeground(Color.black);
        
        desc6.setForeground(Color.black);
        desc7.setForeground(Color.black);
        desc8.setForeground(Color.black);
        desc9.setForeground(Color.black);
        desc10.setForeground(Color.black);

        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(1300,800);    
                f.setLayout(null);    
                f.setVisible(true);
                //panel.setBounds(0, 0, 600, 450);
                panel4.add(panel);
                panel4.add(panel1);
                panel4.add(panel2);
                panel44.add(panel);
                panel44.add(panel1);
                panel44.add(panel2);
                f.add(panel4); 
                f.add(panel3);
            	f.add(panel5);
            	
            	f.add(panel55);
            	 f.setResizable(false);
            	f.add(panel6);
            	f.add(panel7);
            	f.add(panel8);
            	f.add(panel9);
            	f.add(panel10);
            	f.add(panel11);
            	f.add(panel55);
            	f.add(panel44);
            	f.add(label0);
            	
            	//panel4.add(label0);
            	//panel4.add(label1);
       
            	panel4.add(label3);
            	panel4.add(label2);
            	panel4.add(desc);
            	panel4.add(desc1);
            	panel4.add(desc2);
            	panel4.add(desc3);
            	panel4.add(desc4);
            	panel4.add(desc5);
            	panel55.add(desc6);
            	panel55.add(desc7);
            	panel55.add(desc8);
            	panel55.add(desc9);
            	panel55.add(desc10);
            	
            	panel4.add(top);
            	panel4.add(top1);
            	
            	panel55.add(top2);
            	panel55.add(top22);
            	
            	
            	 schedportal.addActionListener(new ActionListener() {
                   	@Override
                   	public void actionPerformed(ActionEvent ae) 
                   	{f.setVisible(false); new Mainscreen();}
           				});
            	  about.addActionListener(new ActionListener() {
                    	@Override
                    	public void actionPerformed(ActionEvent ae)
                    	{f.setVisible(false); new about();}
                    	});
            	 
            	   logout.addActionListener(new ActionListener() {
                       
                   	  @Override
                         public void actionPerformed(ActionEvent ae) 
                         {f.setVisible(false); new login();}
                             }); 
                help.addActionListener(new ActionListener() {
                    
                	  @Override
                      public void actionPerformed(ActionEvent ae) 
                      {f.setVisible(false); new help();}
                          });
                    
                  calendar.addActionListener(new ActionListener() {
                  	@Override
                  	public void actionPerformed(ActionEvent ae) 
                  	{f.setVisible(false); new calendar();}
          				});
                 
                  
                
               
        } 
         
        public static void main(String args[])  {  
        new help();  
        }

        
    }