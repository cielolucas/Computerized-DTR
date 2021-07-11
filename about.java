package dtr;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class about {  
	   JFrame f= new JFrame("About"); 
	   JButton calendar;
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt2 = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt1 = new Font("Times New Roman",Font.PLAIN,16);
	   Font fnt3 = new Font("Times New Roman",Font.BOLD,70);
	   Font fnt4 = new Font("Arial",Font.BOLD,35);
	   Font fnt5 = new Font("Arial",Font.BOLD,60);
	   Font fnt6 = new Font("Arial",Font.BOLD,40);
	   
	   JPanel panel=new JPanel(); 
	   JPanel panel1=new JPanel();
	   JPanel panel2=new JPanel();
	   JPanel panel3=new JPanel();
	   JPanel panel4=new JPanel();
	   JPanel panel5=new JPanel();
	   JPanel panel55=new JPanel();
	   
	   JPanel panel6=new JPanel();
	   //JPanel panel7=new JPanel();
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

     about() {  
    	 try {
             f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("gradient.png")))));} 
    	 
    	 catch (IOException e) {
             e.printStackTrace();}
    	 
    	JLabel label0 = new JLabel("About us");
        label0.setBounds(550, 50, 700, 100);
        label0.setFont(fnt6);
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
		schedportal.setBounds(0,0,380,70);
		panel6.setLayout(null);
		panel6.setBounds(0,0,1300,70);
		panel6.setBackground(Color.white);
		panel6.add(schedportal);
		
		
	
		
		panel5.setLayout(null);
		panel5.setBounds(80,160,580,175);
		panel5.setBackground(Color.white);

		panel55.setLayout(null);
		panel55.setBounds(80,360,580,280);
		panel55.setBackground(Color.white);
		
        panel4.setLayout(null);
        panel4.setBounds(55,140,630,600);
        panel4.setBackground(new Color(255,255,255,150));
    

        JLabel top = new JLabel("Problem");
        JLabel top1 = new JLabel("Objective");
        top.setBounds(45,1,600,110);
        top1.setBounds(45,1,600,500);
        top.setFont(fnt4);
        top1.setFont(fnt4);
        top.setForeground(Color.black);
        top1.setForeground(Color.black);
        
        JLabel desc = new JLabel ("Each professor in the PUP San Juan Branch has to create a daily time record in their");
        JLabel desc1 = new JLabel("own computers which can be time consuming. They have no official system wherein ");
        JLabel desc2 = new JLabel("professors can input their data without any difficulties in an automatically");
        JLabel desc3 = new JLabel("computerized format of the daily time record.");
        
        JLabel desc4 = new JLabel("This DTR System provides a user-friendly environment that would ensure both quality");
        JLabel desc5 = new JLabel("and easy manipulation. It will speed up and effortlessly make a schedule save as");
        JLabel desc6 = new JLabel("Portable Document Format (PDF) by just clicking the ''Generate'' navigation button.");
        
        JLabel desc7 = new JLabel("This will also help professors in keeping eye of their monthly salary, because of the");
        JLabel desc8 = new JLabel("organized time schedule the system provides. Moreover, the use of papers in scheduling");
        JLabel desc9 = new JLabel("will be minimized and will give a secure, accurate, organized system that helps them on");
        JLabel desc10 = new JLabel("arranging their timetable. ");
        JLabel desc11 = new JLabel("");
        JLabel desc12 = new JLabel("");
        
        desc.setBounds(45,1,600,180);
        desc1.setBounds(45,1,600,230);
        desc2.setBounds(45,1,600,280);
        desc3.setBounds(45,1,600,330);
        
        desc4.setBounds(45,1,600,575); 
        desc5.setBounds(45,1,600,620);
        desc6.setBounds(45,1,600,675);
        
        desc7.setBounds(45,1,600,750);
        desc8.setBounds(45,1,600,800);
        desc9.setBounds(45,1,600,850);
        desc10.setBounds(45,1,600,900);
    
        
        desc.setFont(fnt1);
        desc1.setFont(fnt1);
        desc2.setFont(fnt1);
        desc3.setFont(fnt1);
        desc4.setFont(fnt1);
        desc5.setFont(fnt1);
        
        desc6.setFont(fnt1);
        desc7.setFont(fnt1);
        desc8.setFont(fnt1);
        desc9.setFont(fnt1);
        desc10.setFont(fnt1);
   
        
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
                f.add(panel4); 
                f.add(panel3);
            	f.add(panel5);
            	f.add(panel55);
            	 f.setResizable(false);
            	f.add(panel6);
            	//f.add(panel7);
            	f.add(panel8);
            	f.add(panel9);
            	f.add(panel10);
            	f.add(panel11);
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
            	panel4.add(desc6);
            	panel4.add(desc7);
            	panel4.add(desc8);
            	panel4.add(desc9);
            	panel4.add(desc10);
            	panel4.add(desc11);
            	panel4.add(desc12);
            	
            	panel4.add(top);
            	panel4.add(top1);
            	 

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
        new about();  
        }

        
    }