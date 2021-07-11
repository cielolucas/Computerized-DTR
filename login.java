package dtr;
import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class login extends JFrame implements ActionListener{  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame f= new JFrame("login"); 
	   JButton calendar, delete;
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt2 = new Font("Arial",Font.BOLD,16);
	   Font fnt1 = new Font("Arial",Font.BOLD,25);
	   Font fnt4 = new Font("Arial",Font.BOLD,15);
	   Font fnt5 = new Font("Helvetica",Font.PLAIN,12);
	   JButton submit = new JButton("LOGIN");
	   private JLabel website;
	   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width, height=screenSize.height;
	   JPanel panel2=new JPanel();
	  
	   JButton logout = new JButton();
	   JButton about = new JButton();
	   JButton schedportal = new JButton();
	   JButton help = new JButton();

	   static JLabel label3 = new JLabel();
	   JLabel user_label=new JLabel("Email"), password_label=new JLabel("Password"),message;
	   JButton back=new JButton("< Back");
	   JTextField userName_text = new JTextField();
	   
	   
	   
	   
	   
	   
	   
	   
		 
	   JPasswordField password_text = new JPasswordField();
		 
	   Font fnt3 = new Font("Arial",Font.CENTER_BASELINE,25);
	   JPanel panel=new JPanel();  
	   JLayeredPane pane = new JLayeredPane();
	   JLabel incomplete = new JLabel("");
	   JButton see = new JButton("");
	   JButton see2 = new JButton("");
	   
	   boolean validmail=false, validpass=false, valid_id=false, validname=false, auth=false, valname1=false, valname2=false;

     login()  
        {  
    	 try {
             f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg.png")))));
          
         } catch (IOException e) {
             e.printStackTrace();
           
         }
    	
          
           website = new JLabel();
         
           website.setBounds(1150, 20, 900, 20);

         
           website.setText("<html><a href=\"\">Contact Us</a></html>");
           website.setCursor(new Cursor(Cursor.HAND_CURSOR));

           
           BufferedImage buttonIcon, buttonIcon1;
   		try {
   			buttonIcon = ImageIO.read(new File("info.png"));
   	         see = new JButton(new ImageIcon(buttonIcon));
   	         see.setBorderPainted(false);
   	         see.setFocusPainted(false);
   	         see.setContentAreaFilled(false);
   	         see.setBounds(315,255,30,15);
   	         pane.add(see);
   	         see.addActionListener(new ActionListener() {
   	        	    public void actionPerformed(ActionEvent e) {
   	        	    	password_text.setEchoChar((char)0);
   	        	    	see.setVisible(false);see2.setVisible(true);
   	        	    	// {password_text.setEchoChar('•');}
   	        	    }
   	        	});
   		} catch (IOException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
		try {
			buttonIcon1 = ImageIO.read(new File("info.png"));
	         see2 = new JButton(new ImageIcon(buttonIcon1));
	         see2.setBorderPainted(false);
	         see2.setFocusPainted(false);
	         see2.setContentAreaFilled(false);
	         see2.setBounds(315,255,30,15);
	         pane.add(see2);
	         see2.addActionListener(new ActionListener() {
	        	    public void actionPerformed(ActionEvent e) {
	        	    	password_text.setEchoChar('•');see2.setVisible(false);see.setVisible(true);
	        	    }
	        	});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
         f.add(website);
         goWebsite(website);
         submit.setBounds(126,340,150,40);  
         back.setBounds(35,35,150,40); 
         panel.setLayout(null); 
         panel.setBounds(450,90,400,510); 
         panel.setBackground(Color.white); 
         JLabel label = new JLabel("Login");
         panel.add(label);
         label.setBounds(150, 80, 200, 80);
         label.setFont(fnt3);
         
         pane.add(incomplete, Integer.valueOf(1));incomplete.setBounds(55,290, 250, 30);incomplete.setForeground(Color.RED);incomplete.setFont(fnt5);
         
         pane.add(userName_text,Integer.valueOf(0));userName_text.setBounds(50, 180, 300, 35); userName_text.requestFocus();
         pane.add(user_label, Integer.valueOf(1));user_label.setBounds(52, 158, 150, 30);user_label.setForeground(Color.gray);
   
         pane.add(password_text,Integer.valueOf(0));password_text.setBounds(50, 245, 300, 35);
         pane.add(password_label, Integer.valueOf(1));password_label.setBounds(52, 220, 150, 30);password_label.setForeground(Color.gray);
         
                
         
         panel.add(label);
         pane.add(panel, Integer.valueOf(0));
        submit.addActionListener(this);
        back.addActionListener(this);

         message = new JLabel();
         message.setBounds(60,200,200,30); 
         panel.add(message);
         panel.add(submit);
         f.add(back);
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f.setSize(600,450);    
         f.setLayout(null);    
         f.setVisible(true);
         pane.setBounds(450,90,400,510);
         f.add(pane);
         f.add(panel);
        
         f.setSize(1280, height);
        
			f.setLocation(screenSize.width/2-f.getSize().width/2, screenSize.height/2-f.getSize().height/2); 
			 f.setResizable(false);
         f.setLayout(null);    
         f.setVisible(true);
         
         emailListener();
               	
        } 
         
        public static void main(String args[])  
        {  

        new login();  
        }
     
        @Override
        public void actionPerformed(ActionEvent c) {
 
        	if(c.getSource()==submit) {
        			emailListener();
		 		    boolean dt=false, dt1=false;
		    		String str=userName_text.getText(), str1=password_text.getText();
		    		try{	File file=new File("register.txt");
		    		Scanner read=new Scanner(file);
		    		read.useDelimiter("[,\n]+");
		    		String fname1="",name1="", pass1="", id1="";

		    		while(read.hasNext()) 
		    		{
		    			fname1=read.next();name1=read.next();pass1=read.next();id1=read.next();
		    			
		    			
		    			if(str.equals(name1)){
		    				dt=true;		
		    				if(str1.equals(pass1)){
			    				dt1=true;
			    				login.SaveFile("current_user.txt", fname1,name1,pass1,id1, false);	
		    				}
			    			}
		    			
		    	
		    			
		    		}//while
		    		
		    		read.close();
		    		}catch(Exception x){}
        		
		    		if(dt==true&&dt1==true) {
		    			incomplete.setForeground(Color.green);
	    				incomplete.setText("Login Success");
	    				f.setVisible(false);
	    				new Mainscreen();
		    		}else {
		    			incomplete.setForeground(Color.red);
	    				incomplete.setText("Email address is not registered.");
	    				if(dt==true&&dt1==false) {
	    					incomplete.setText("*Incorrect Password.");
	    				}
		    		}
        	
        	
        	}
        	
        	if(c.getSource()==back) {
        		f.setVisible(false); new Registration();
        	}
        	
        }
        
    	void emailListener(){

  		   userName_text.addKeyListener(new KeyListener(){
  		        @Override
  		        public void keyPressed(KeyEvent e) {
  		        incomplete.setText("");
  		       
         		
  		        
  		        }//keypressed

  		           @Override
  		           public void keyTyped(KeyEvent e) {
  		        	  incomplete.setText("");

  		           }

  		           @Override
  		           public void keyReleased(KeyEvent e) {
  		 		     incomplete.setText("");

  		    		
  		    		if(Registration.isValid(userName_text.getText())==true) {
  		    		incomplete.setText("");}
  		    		
  		    		if((!Registration.isValid(userName_text.getText())==true))
  		    		{incomplete.setForeground(Color.blue);incomplete.setText("*Please enter a valid email address");validmail=false;}
  		    		
  		           }
  		   });

  	}//emailListener method
        
    		
    

     

        private void goWebsite(JLabel website) {
            website.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.pup.edu.ph/"));
                    } catch (URISyntaxException | IOException ex) {
                        //It looks like there's a problem
                    }
                }
            });
        }

    	public static void SaveFile(String filename, String fullz, String email, String pass, String id, boolean append){
    		Registration.NewFile(filename);//if file exists
    		try{	 
    			File f=new File(filename);
    			FileWriter fw=new FileWriter(f,append);
    			PrintWriter pw=new PrintWriter(fw);
    			pw.print(fullz+","+email+","+pass+","+id+"\n");
    			pw.close();}//try

    		catch(IOException e){}//catch

    	}//SaveFile
        
    }