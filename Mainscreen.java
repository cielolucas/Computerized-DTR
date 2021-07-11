package dtr;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Mainscreen {  
	  JFrame f= new JFrame("Computerized Daily Time record System"); 
	  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int width = screenSize.width, height=screenSize.height;
	   JButton submit, calendar, delete;
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt2 = new Font("Times New Roman",Font.BOLD,60);
	   Font fnt1 = new Font("Arial",Font.PLAIN,15);
	   Font fnt3 = new Font("Arial",Font.PLAIN,40);
	   
	   JPanel panel=new JPanel(); 
	   JPanel panel1=new JPanel();
	   JPanel panel2=new JPanel();
	   JPanel panel3=new JPanel();
	   JPanel panel4=new JPanel();
	   JPanel panel5=new JPanel();
	   JPanel panel6=new JPanel();
	   JPanel panel7=new JPanel();
	   JPanel panel8=new JPanel();
	   JPanel panelv=new JPanel();
	   static JLabel label2 = new JLabel(); 
	   JButton logout = new JButton();
	   JButton about = new JButton();
	   JButton schedportal = new JButton();
	   JButton help = new JButton();
	   JButton contact = new JButton();
	   JButton view = new JButton();
	   static JLabel label3 = new JLabel();

     Mainscreen() {  
    	 try {
             f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("gradient.jpg")))));
         } 
    	 
    	 catch (IOException e) {
             e.printStackTrace();
         }
    	 
    	f.getContentPane().setBackground(Color.WHITE);

		logout = new JButton("Logout");
		logout.setBackground(new Color(102,120,153));
		logout.setForeground(Color.white);
		logout.setOpaque(true);
		logout.setBorderPainted(false);
		logout.setBounds(0,0,140,70);
		panel3.setLayout(null); 
		panel3.setBounds(1145,0,1300,70);    
		panel3.setBackground(new Color(102,0,153)); //bg
		panel3.add(logout);
	     
		about = new JButton("About");
		about.setBackground(Color.white);
		about.setForeground(Color.black);
		about.setOpaque(true);
		about.setBorderPainted(false);
		about.setBounds(0,0,100,70);
		panel5.setLayout(null); 
		panel5.setBounds(845,0,100,70);
		panel5.setBackground(Color.white); //bg
		panel5.add(about);        
		
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
		  
		help = new JButton("Help");
		help.setBackground(Color.white);
		help.setForeground(Color.black);
		help.setOpaque(true);
		help.setBorderPainted(false);
		//delete.addActionListener(this);
		help.setBounds(0,0,100,70);
		panel7.setLayout(null); 
		panel7.setBounds(945,0,100,70);
		panel7.setBackground(Color.white); //bg
		panel7.add(help);
		 
		contact = new JButton("");
		contact.setBackground(Color.white);
		contact.setForeground(Color.black);
		contact.setOpaque(true);
		contact.setBorderPainted(false);
		//delete.addActionListener(this);
		contact.setBounds(0,0,100,70);
		panel8.setLayout(null); 
		panel8.setBounds(1045,0,100,70);
		panel8.setBackground(Color.white); //bg
		panel8.add(contact);
	       
		panel4.setLayout(null);
	    panel4.setBounds(0,100,1300,230);
	    panel4.setBackground(new Color(255,255,255,150));
		
        submit = new JButton("ADD");
        submit.setBackground(new Color(0,0,102));
        submit.setForeground(Color.white);
        submit.setOpaque(true);
        submit.setBorderPainted(false);
        submit.setFont(new Font("Arial", Font.BOLD, 16));
        submit.setBounds(10,190,240,60);  
        panel.setLayout(null); 
        panel.setBounds(50,410,260,260);    
      //  panel.setBackground(new Color(255,255,255,150)); //bg
        panel.add(submit);
 	
        delete = new JButton("EDIT");
        delete.setBackground(new Color(0,0,102));
        delete.setForeground(Color.white);
        delete.setOpaque(true);
        delete.setBorderPainted(false);
        delete.setFont(new Font("Arial", Font.BOLD, 16));
        delete.setBounds(10,190,240,60);  
        panel1.setLayout(null); 
        panel1.setBounds(360,410,260,260);    
        panel1.setBackground(new Color(255,255,255,150)); //bg
        panel1.add(delete);
        
        

        view = new JButton("VIEW");
        view.setBackground(new Color(0,0,102));
        view.setForeground(Color.white);
        view.setOpaque(true);
        view.setBorderPainted(false);
        view.setFont(new Font("Arial", Font.BOLD, 16));
        view.setBounds(10,190,240,60);  
        panelv.setLayout(null); 
        panelv.setBounds(670,410,260,260);    
       // panelv.setBackground(new Color(255,255,255,150)); //bg
        panelv.add(view);
        
        calendar = new JButton("CALENDAR");
        calendar.setBackground(new Color(0,0,102));
        calendar.setForeground(Color.white);
        calendar.setOpaque(true);
        calendar.setBorderPainted(false);
        calendar.setFont(new Font("Arial", Font.BOLD, 16));
        calendar.setBounds(10,190,240,60);       
        panel2.setLayout(null); 
        panel2.setBounds(970,410,260,260);    
        panel2.setBackground(new Color(255,255,255,150));
        panel2.add(calendar);
      
        
        JLabel label0 = new JLabel("Computerized Daily Time Record");
        label0.setBounds(205, 1, 1200, 109);
        label0.setFont(fnt2);
        label0.setForeground(Color.white);
        //texts
        JLabel label1 = new JLabel("Computerized Daily Time Record");
        label1.setBounds(204, 1, 1200, 114);
        label1.setFont(fnt2);
        label1.setForeground(new Color(0,0,153));
        
        JLabel label2 = new JLabel("OPTIONS");
        label2.setBounds(563, 1, 1200, 750);
        label2.setFont(fnt3);
        label2.setForeground(Color.white);
       
      
        JLabel desc = new JLabel ("This system will provide a computerized DTR for the professors which can also help in");
        JLabel desc1 = new JLabel("back tracking their schedules and save time. The data inputted in the system will be kept");
        JLabel desc2 = new JLabel("in their respective accounts which they can use as a reference for their salary process.");
        JLabel desc3 = new JLabel("");
        
        desc.setBounds(360, 1, 600, 250);
        desc.setFont(fnt1);
        desc.setForeground(Color.black);
      
        desc1.setBounds(360, 1, 600, 300);
        desc1.setFont(fnt1);
        desc1.setForeground(Color.black);
      
        desc2.setBounds(360, 1, 600, 350);
        desc2.setFont(fnt1);
        desc2.setForeground(Color.black);
      
        desc3.setBounds(360, 1, 600, 400);
        desc3.setFont(fnt1);
        desc3.setForeground(Color.black);
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             //   f.setSize(1300,800);   
             f.setSize(1300, height);
			f.setLocation(screenSize.width/2-f.getSize().width/2, screenSize.height/2-f.getSize().height/2); 
                f.setLayout(null);    
                f.setVisible(true);
                //panel.setBounds(0, 0, 600, 450);
                //panel4.add(panel);
                //panel4.add(panel2);
                f.add(panel);
                f.add(panel1);
                f.add(panel2);
                f.add(panel4); 
            	f.add(panel3);
            	f.add(panel5);
            	f.add(panel6);
            	f.add(panel7);
            	f.add(panel8);
            	  f.add(panelv);
            	
            	f.add(label2);
            	 ImagePanel i = new ImagePanel(
        new ImageIcon("add.png").getImage());
            	
        
         ImagePanel x = new ImagePanel(
        new ImageIcon("edit.png").getImage());

         
         ImagePanel y = new ImagePanel(
        new ImageIcon("calendar.png").getImage());
         ImagePanel n = new ImagePanel(
 		        new ImageIcon("view.png").getImage());
         f.setResizable(false);
   				 panel.add(i);
   				  panel1.add(x);
   				  panel2.add(y);
   				  panelv.add(n);
   				// f.pack();
            	panel4.add(label0);
            	panel4.add(label1);
            	panel4.add(label3);
            	panel4.add(desc);
            	panel4.add(desc1);
            	panel4.add(desc2);
            	panel4.add(desc3);
            	 
            	
            	/*delete.addActionListener(new ActionListener() {
                    
              	  @Override
                    public void actionPerformed(ActionEvent ae) 
                    {f.setVisible(false); new Test();}
                        });
                        
                submit.addActionListener(new ActionListener() {
                    
                  @Override
                    public void actionPerformed(ActionEvent ae) 
                    {f.setVisible(false); new SchedulePortal();}
                        });
                          
                */
                help.addActionListener(new ActionListener() {
                    
              	  @Override
                    public void actionPerformed(ActionEvent ae) 
                    {f.setVisible(false); new help();}
                        });
                   logout.addActionListener(new ActionListener() {
                    
              	  @Override
                    public void actionPerformed(ActionEvent ae) 
                    {f.setVisible(false); new login();}
                        }); 
                calendar.addActionListener(new ActionListener() {
                	@Override
                	public void actionPerformed(ActionEvent ae) 
                	{f.setVisible(false); new calendar();}
        				});
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
                view.addActionListener(new ActionListener() {
                	@Override
                	public void actionPerformed(ActionEvent ae)
                	{f.setVisible(false); new view();}
                	});
               submit.addActionListener(new ActionListener() {
                	@Override
                	public void actionPerformed(ActionEvent ae) 
                	{f.setVisible(false); try {
						new Main();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
        				});
                
                delete.addActionListener(new ActionListener() {
                	@Override
                	public void actionPerformed(ActionEvent ae)
                	{f.setVisible(false); try {
						new Edit().main(null);
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}
                	});
             
        } 
         class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }

}
        public static void main(String args[])  {  
        new Mainscreen();  
        } 
    }