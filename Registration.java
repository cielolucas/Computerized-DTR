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
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration extends JFrame implements ActionListener{  
	  JFrame f= new JFrame("Signup"); 
	  //frames
	  
	  JPanel panel=new JPanel(); 
	  JPanel panel2=new JPanel();
	  //panels
	  JLayeredPane pane = new JLayeredPane();
	  //panes
	 
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   Font fnt1 = new Font("Arial",Font.BOLD,25);
	   Font fnt2 = new Font("Arial",Font.BOLD,16);
	   Font fnt3 = new Font("Arial",Font.CENTER_BASELINE,25);
	   Font fnt4 = new Font("Arial",Font.BOLD,15);
	   Font fnt5 = new Font("Helvetica",Font.PLAIN,12);
	   //fonts
	   
	   JButton submit = new JButton("Sign Up");
	   JButton submit2 = new JButton("Login");
	   JButton logout = new JButton();
	   JButton about = new JButton();
	   JButton schedportal = new JButton();
	   JButton help = new JButton();
	   JButton see = new JButton("");
	   JButton see2 = new JButton("");
	   //buttons
	   
	   private JLabel website;
	 
	   JLabel user_label=new JLabel("Email");
	   JLabel password_label=new JLabel("Password");
	   JLabel fname_label=new JLabel("First Name");
	   JLabel lname_label=new JLabel("Last Name");
	   JLabel id_label=new JLabel("ID number"),message;
	   JLabel notname = new JLabel("");
	   JLabel incomplete = new JLabel("");
	   JLabel notpass = new JLabel("");
	   JLabel notid = new JLabel("");
	   JLabel label = new JLabel("Sign Up");
	   JLabel label0 = new JLabel("Schedule Portal");
	   JLabel label1 = new JLabel("Computerized DTR");
       JLabel label2 = new JLabel("A SECURE AND ORGANIZED SYSTEM");
       JLabel label3= new JLabel("FOR EDUCATORS OF PUP SAN JUAN CAMPUS");
       JLabel label4= new JLabel("MAKING LIFE EASIER THAN EVER BEFORE");
       JLabel label5 = new JLabel("Contact Us");
       JLabel emailexist = new JLabel("");
       
	   //labels
       JTextField fname = new JTextField();
       JTextField lname = new JTextField();
	   JTextField userName_text = new JTextField();
	   JTextField id = new JTextField();
	   JPasswordField password_text = new JPasswordField();
	   //fields

	   boolean validmail=false, validpass=false, valid_id=false, validname=false, auth=false, valname1=false, valname2=false;
	   //helm
	   String fullname="", forfname="", forlname="";
 

     public Registration()  
        {  
    	 try {f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("n.jpg")))));} catch (IOException e) {e.printStackTrace();}//background_image
          
         website = new JLabel();website.setBounds(1150, 20, 900, 20);
         website.setText("<html><a href=\"\">Contact Us</a></html>");
         website.setCursor(new Cursor(Cursor.HAND_CURSOR));
         f.add(website);
         goWebsite(website);
    	 //hyperlink
        
         label.setBounds(150, 0, 200, 80);
         label.setFont(fnt3);        
         
         submit.setBounds(42,450,150,40);
         submit2.setBounds(207,450,150,40);
         panel.setLayout(null); 
         panel.setBounds(680,90,400,510);  
         panel.setBackground(Color.white); 
         panel.add(label);
        
         BufferedImage buttonIcon, buttonIcon1;
		try {
			buttonIcon = ImageIO.read(new File("info.png"));
	         see = new JButton(new ImageIcon(buttonIcon));
	         see.setBorderPainted(false);
	         see.setFocusPainted(false);
	         see.setContentAreaFilled(false);
	         see.setBounds(315,320,30,15);
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
	         see2.setBounds(315,320,30,15);
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

         pane.setBounds(680,90,400,510);

 
         pane.add(fname,Integer.valueOf(0));fname.setBounds(50, 95, 300, 35); fname.requestFocus();
         pane.add(fname_label, Integer.valueOf(1));fname_label.setBounds(52,68, 150, 30);fname_label.setForeground(Color.gray);
        
         pane.add(lname,Integer.valueOf(0));lname.setBounds(50, 155, 300, 35); lname.requestFocus();
         pane.add(lname_label, Integer.valueOf(1));lname_label.setBounds(52, 128, 150, 30);lname_label.setForeground(Color.gray);
         pane.add(notname, Integer.valueOf(1));notname.setBounds(55,183,300, 30);notname.setForeground(Color.RED);notname.setFont(fnt5);

         pane.add(userName_text,Integer.valueOf(0));userName_text.setBounds(50, 230, 300, 35); 
         pane.add(user_label, Integer.valueOf(1));user_label.setBounds(52, 203, 150, 30);user_label.setForeground(Color.gray);
         pane.add(incomplete, Integer.valueOf(1));incomplete.setBounds(55,255, 250, 30);incomplete.setForeground(Color.RED);incomplete.setFont(fnt5);
         
         pane.add(password_text,Integer.valueOf(0));password_text.setBounds(50, 310, 300, 35);
         pane.add(password_label, Integer.valueOf(1));password_label.setBounds(52, 280, 150, 30);password_label.setForeground(Color.gray);
         pane.add(notpass, Integer.valueOf(1));notpass.setBounds(55,335,300, 30);notpass.setForeground(Color.RED);notpass.setFont(fnt5);
         
         pane.add(id,Integer.valueOf(0));id.setBounds(50, 385, 300, 35);
         pane.add(id_label, Integer.valueOf(1));id_label.setBounds(52, 359, 150, 30);id_label.setForeground(Color.gray);
         pane.add(notid, Integer.valueOf(1));notid.setBounds(55,415,300, 30);notid.setForeground(Color.RED);notid.setFont(fnt5);

         submit.addActionListener(this);
         submit2.addActionListener(this);
         panel.add(label);
         pane.add(panel, Integer.valueOf(0));
         //adding panel to pane

         message = new JLabel();
         message.setBounds(60,200,200,30); 
         panel.add(message);
         panel.add(submit);
         panel.add(submit2);
         
        
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setSize(600,450);    
         f.setLayout(null);    
         f.setVisible(true);
         f.add(pane);
         f.add(panel);
         f.add(label0);
         f.add(label1);
         f.add(label2);
         f.add(label3);
         f.add(label4); 
        
         f.setSize(1300,800); 
         f.setResizable(false);
         f.setLayout(null);    
         f.setVisible(true);       

    	
    	 
         label0.setBounds(120, 1, 600, 200);
         label0.setFont(fnt1);
         label0.setForeground(Color.white);
        
         label1.setBounds(120, 1, 600, 250);
         label1.setForeground(Color.white);

         
         label2.setBounds(120, 1, 600, 430);
         label2.setFont(fnt2);
         label2.setForeground(new Color(51,204,255));
         
         
         label3.setBounds(120, 1, 600, 500);
         label3.setFont(fnt2);
         label3.setForeground(Color.white);

         
         label4.setBounds(120, 1, 600, 550);
         label4.setFont(fnt2);
         label4.setForeground(Color.white);

         label5.setBounds(1100, 20, 900, 20);
         label5.setFont(fnt4);
         label5.setForeground(new Color(147,112,219));     
         
         panel2.setLayout(null); 
         panel2.setBounds(830,200,260,260);    
         panel2.setBackground(new Color(255,255,255));

       emailListener(); passListener(); idListener(); fListener();
               	
       
        }//constructor
     

     
     public static boolean isValid(String email)
     {
         String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                             "[a-zA-Z0-9_+&*-]+)*@" +
                             "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                             "A-Z]{2,7}$";
                               
         Pattern pat = Pattern.compile(emailRegex);
         if (email == null)
             return false;
         return pat.matcher(email).matches();
     }
     
     public static boolean
     isValidPassword(String password)
     {
   
         // Regex to check valid password.
         String regex = "^(?=.*[0-9])"
                        + "(?=.*[a-z])(?=.*[A-Z])"
                        + "(?=.*[@#$%^&+=!])"
                        + "(?=\\S+$).{8,20}$";
   
         // Compile the ReGex
         Pattern p = Pattern.compile(regex);
   
         // If the password is empty
         // return false
         if (password == null) {
             return false;
         }
   
         // Pattern class contains matcher() method
         // to find matching between given password
         // and regular expression.
         Matcher m = p.matcher(password);
   
         // Return if the password
         // matched the ReGex
         return m.matches();
     }
     
     public static boolean isValidName(String name,int option)
     {
   
         // Regex to check valid username.
         String regex="";
         if(option==1) {regex = "^[a-zA-Z ]+$";}
         if(option==2) {regex = "^[a-zA-Z]+$";}
         // Compile the ReGex
         Pattern p = Pattern.compile(regex);
   
         // If the username is empty
         // return false
         if (name == null) {
             return false;
         }
   
         // Pattern class contains matcher() method
         // to find matching between given username
         // and regular expression.
         Matcher m = p.matcher(name);
   
         // Return if the username
         // matched the ReGex
         return m.matches();
     }
     
        @SuppressWarnings("deprecation")
		public void actionPerformed(ActionEvent c)
        {
        	
			
        	
			
        	
        	
        	if(c.getSource()==submit) {
        		

       
        		
        		
        		
        	if(validname==true&&validmail==true&&validpass==true&&valid_id==true) {auth=true;}else {auth=false;}
        		
        	if(auth==true) {
        		Registration.SaveFile("register.txt", fullname, userName_text.getText().replaceAll(" ", "_"), password_text.getText(), id.getText(), true);
        		JOptionPane.showMessageDialog(null, "Registered Successfully");
        		
        	
        	}//auth_true
        	
        	}//submit button 
        	
        	
        	if(c.getSource()==submit2) {
        		f.setVisible(false); new login();
        	}//submit button 
        	
        }//action
    	
    		
    
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
 		 		    boolean dt=false;
 		    		String str=userName_text.getText();
 		    		try{	File file=new File("register.txt");
 		    		Scanner read=new Scanner(file);
 		    		read.useDelimiter("[,\n]+");
 		    		String fname1="",name1="", pass1="", id1="", data="";


 		    		while(read.hasNext()) 
 		    		{
 		    			fname1=read.next();name1=read.next();pass1=read.next();id1=read.next();

 		    			if(str.equals(id1)||str.equals(name1)){
 		    				incomplete.setForeground(Color.red);
 		    				incomplete.setText("Email already in used by another user.");dt=true;
 		    				data=str;read.close();}
 		    			
 		    		}//while

 		    		read.close();
 		    		}catch(Exception x){}
 		    		
 		    		if(Registration.isValid(userName_text.getText())==true&&dt==false) {
 		    		incomplete.setText("Accepted");incomplete.setForeground(Color.green);validmail=true;}
 		    		
 		    		if((!Registration.isValid(userName_text.getText())==true)&&dt==false)
 		    		{incomplete.setForeground(Color.blue);incomplete.setText("*Please enter a valid email address");validmail=false;}
 		    		
 		           }
 		   });

 	}//emailListener method
    	
    	void passListener(){

  		   password_text.addKeyListener(new KeyListener(){
  		        @Override
  		        public void keyPressed(KeyEvent e) {
  		        notpass.setText("");
  		        
  		        }

  		           @Override
  		           public void keyTyped(KeyEvent e) {
                     System.out.print("");
  		           }

  		           @SuppressWarnings("deprecation")
				@Override
  		           public void keyReleased(KeyEvent e) {
  		           notpass.setText("");
  		      	   if(Registration.isValidPassword(password_text.getText()))
  	    			{notpass.setForeground(Color.green);notpass.setText("Accepted");validpass=true;}
  	    			else{notpass.setForeground(Color.blue);notpass.setText("*Must contain 8-20 characters (A-Z a-z 0-9) & symbols");validpass=false;}
  		           }
  		   });

  	}//passListener method
     
    	void idListener(){

   		   id.addKeyListener(new KeyListener(){
   		        @Override
   		        public void keyPressed(KeyEvent e) {
   		        char in = e.getKeyChar();
   		        notid.setText("");
   		        
   		        }

   		           @Override
   		           public void keyTyped(KeyEvent e) {
                      System.out.print("");
   		           }

   		           @Override
   		           public void keyReleased(KeyEvent e) {
   		        	
 		 		    boolean dt=false;
 		    		String str=id.getText();
 		    		try{	File file=new File("register.txt");
 		    		Scanner read=new Scanner(file);
 		    		read.useDelimiter("[,\n]+");
 		    		String fname1="", name1="", pass1="", id1="";

 		    		while(read.hasNext()) 
 		    		{
 		    			fname1=read.next();name1=read.next();pass1=read.next();id1=read.next();

 		    			if(str.equals(id1)){
 		    				notid.setForeground(Color.red);
 		    				notid.setText("ID is already in used by another user.");dt=true;
 		    				read.close();}
 		    			
 		    		}//while

 		    		read.close();
 		    		}catch(Exception x){}
   		        	 
   		        	if(id.getText().matches("[0-9]+")&&id.getText().length()==6&&dt==false){notid.setForeground(Color.green);notid.setText("Accepted");valid_id=true;}
   	    			
   		        	else{
   	    				if(dt==false) {notid.setForeground(Color.blue);notid.setText("*Identification number length must be 6");valid_id=false;}
   	    				}
   		        	
   		           }//keyreleased
   		   });

   	}//passListener method
    	
    	
    	void fListener(){
    		
    		/*
     	   if(Registration.isValidName(fname.getText())&&Registration.isValidName(lname.getText()))
  			{notname.setForeground(Color.green);notname.setText("Accepted");validpass=true;}
  			else{notname.setForeground(Color.blue);notname.setText("*Must contain a valid full name");validname=false;*/
   		   fname.addKeyListener(new KeyListener(){
   		        @Override
   		        public void keyPressed(KeyEvent e) {
   		        notname.setText("");
   		        
   		        }

   		           @Override
   		           public void keyTyped(KeyEvent e) {
                      System.out.print("");
   		           }

   		           @SuppressWarnings("deprecation")
 				@Override
   		           public void keyReleased(KeyEvent e) {
   		           notname.setText("");
   		           if(Registration.isValidName(fname.getText(), 2)) {forfname=fname.getText();valname1=true;}
   		           else {valname1=false;}
   		           
   		           if(fname.getText().contains(" ")&&!fname.getText().substring(fname.getText().length()-1,fname.getText().length()).equals(" ")) {
   		        	if(Registration.isValidName(fname.getText(), 1)) {forfname=fname.getText();valname1=true;}
    		           else {valname1=false;}
   		           }
   		           
   		           
   		        if(!fname.getText().equals("")&&!lname.getText().equals("")&&valname1==true&&valname2==true) 
   	   			{fullname=fname.getText()+" "+lname.getText();notname.setForeground(Color.green);notname.setText("Accepted");validname=true;}
   	   			else{notname.setForeground(Color.blue);notname.setText("*Must contain a valid full name");validname=false;}
   		           }
   		   });
   		   
   		   lname.addKeyListener(new KeyListener(){
  		        @Override
  		        public void keyPressed(KeyEvent e) {
  		        notname.setText("");
  		        
  		        }

  		           @Override
  		           public void keyTyped(KeyEvent e) {
                     System.out.print("");
  		           }

  		           @SuppressWarnings("deprecation")
				@Override
  		           public void keyReleased(KeyEvent e) {
  		           notname.setText("");
  		           if(Registration.isValidName(lname.getText(), 2)) {forlname=lname.getText();valname2=true;}
  		           else {valname2=false;}
  		           
   		           if(lname.getText().contains(" ")&&!lname.getText().substring(lname.getText().length()-1,lname.getText().length()).equals(" ")) {
   		        	if(Registration.isValidName(lname.getText(), 1)) {forlname=lname.getText();valname2=true;}
    		           else {valname2=false;}
   		           }
  		           
  		         if(!fname.getText().equals("")&&!lname.getText().equals("")&&valname1==true&&valname2==true) 
  	   			{fullname=fname.getText()+" "+lname.getText();notname.setForeground(Color.green);notname.setText("Accepted");validname=true;}
  	   			else{notname.setForeground(Color.blue);notname.setText("*Must contain a valid full name");validname=false;}

  		           
  		           }
  		   });

   		
   			
   			   
   			   
   			   
   		   
   	}//nameListener method
    	
   

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

    	public static void SaveFile(String filename, String fullz, String name, String password, String userID,boolean append){
    		Registration.NewFile(filename);//if file exists
    		try{	 
    			File f=new File(filename);
    			FileWriter fw=new FileWriter(f,append);
    			PrintWriter pw=new PrintWriter(fw);
    			pw.print(fullz+","+name+","+password+","+userID+"\n");
    			pw.close();}//try

    		catch(IOException e){}//catch

    	}//SaveFile
    	
    	public static void NewFile(String filename){

    		File f=new File(filename);
    		if(f.isFile()){/*do nothing*/}
    		else{
    			try {
    				f.createNewFile();
    				FileWriter fw=new FileWriter(f);
    				PrintWriter pw=new PrintWriter(fw);
    				pw.close();

    			} catch (IOException e){}
    		}//create file
    	}//NewFile
    	
    	public static String CheckRecord(String filename,String str){


    		String data="";
    		try{	File file=new File(filename);
    		Scanner read=new Scanner(file);
    		read.useDelimiter("[,\n]+");
    		String fname1="", name1="", pass1="", id1="";


    		while(read.hasNext()) 
    		{
    			fname1=read.next();name1=read.next();pass1=read.next();id1=read.next();

    			if(str.equals(id1)||str.equals(name1)){
    				data=str;read.close();return data;}
    			
    		}//while

    		read.close();
    		}catch(Exception e){}

    		return data;
    	}//CheckRecord
    	
    	public static void main(String args[]) {
    		new Registration();

    		
    		
    		
    		
    	}
        
    }