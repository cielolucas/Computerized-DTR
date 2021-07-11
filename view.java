package dtr;
///Users/cielolucas/eclipse-workspace/DTR


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class view extends JFrame{

	JFrame f = new JFrame();
	//main frame
	static String printData = "";
	JPanel vpanel = new JPanel();
	//panel
	JButton print= new JButton("Print");

		
	
	static String uname="", umail="", upass="", uid="";
	//strings
	
    Font fnt1 = new Font("Helvetica",Font.PLAIN,12);
    Font fnt2 = new Font("Arial",Font.BOLD,15);
    //fonts
	
	JLabel vlabel = new JLabel("Current User : ");
	JLabel nlabel = new JLabel("");
	JLabel slabel = new JLabel("Select schedule to view: ");
	//labels
	
	int numfiles=0;
	//int
    static String fs[];
	static JComboBox<?> listfile; 
	//comboBox
	
	
	   JPanel panel=new JPanel(); 
	   JPanel panel1=new JPanel();
	   JPanel panel2=new JPanel();
	   JPanel panel3=new JPanel();
	   JPanel panel4=new JPanel();
	   JPanel panel5=new JPanel();
	   JPanel panel55=new JPanel();
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	  
	   JPanel panel6=new JPanel();
	   JPanel panel7=new JPanel();
	   JPanel panel8=new JPanel();
	   JPanel panel9=new JPanel();
	   JPanel panel10=new JPanel();
	   JPanel panel11=new JPanel();
	JTextArea info=new JTextArea();
	//textArea
	   static JLabel label2 = new JLabel(); 
	   JButton logout = new JButton();
	   JButton about = new JButton();
	   JButton schedportal = new JButton();
	   JButton help = new JButton();
	   JButton contact = new JButton();
	   static JLabel label3 = new JLabel();
	view(){cur_user();
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      	int width = screenSize.width, height=screenSize.height;
      	f.setSize(1300, height);
  		f.setLocation(screenSize.width/2-f.getSize().width/2, screenSize.height/2-f.getSize().height/2);//center
    	try {f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("d.jpg")))));
        } catch (IOException e) {e.printStackTrace();}//background design
		f.setTitle("View Schedule");
        f.setLayout(null);
        f.setLocationRelativeTo(null); // Center the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(vpanel);
       
//frame initialization
       

        

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
        
        
        vpanel.setBackground(new Color(229, 234, 232));
        vpanel.setBounds(160,80,1000,height-230);
        vpanel.setLayout(null);
        vpanel.add(vlabel);vpanel.add(nlabel);
        vpanel.add(slabel);vpanel.add(info);vpanel.add(print);
//panel initialization
        print.setBounds(470, height-264, 80, 20);
        vlabel.setBounds(45,20,100,34);vlabel.setForeground(Color.blue);
        nlabel.setBounds(140,20,200,34);nlabel.setText(uname);nlabel.setFont(fnt2);
        slabel.setBounds(520,20,200,34);slabel.setForeground(Color.blue);
        
        info.setEditable(false);
      
       JScrollPane scroll = new JScrollPane(info); scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

               
                vpanel.add(scroll);

                scroll.setBounds(25,70,950,420);
             


        f.add(panel3);
    	f.add(panel5);
    	f.add(panel6);
    	f.add(panel7);
    	f.add(panel8);
    	 f.setResizable(false);
    	
    	   print.addActionListener(new ActionListener() {
               
               @Override
               public void actionPerformed(ActionEvent y) {
            	   String Sched = fs[listfile.getSelectedIndex()];
            	   BufferedWriter bfw;
            	   if(y.getSource()==print){y.setSource(null);String n = Sched;File flz=new File(n);
            	   if(flz.isFile()){
            		   try {
            		   String f =  uname;
              		 //  bfw = new BufferedWriter(new FileWriter(flz));  


              			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(flz, true)));
              			writer.write("\n\n\n");
              			writer.write("           I certify on my honor that the above is a true and correct \n");
              			writer.write("           report of the hours of work performed, record of which was \n");
              			writer.write("           made daily at the time of arrival and departure from office.\n\n");
              			writer.write("                                              ");writer.write(f);	writer.write("\n");
              			writer.write("                         _____________________________________    \n");
              			writer.write("                   VERIFIED as to the prescribed office hours:\n\n");
              			 writer.close();
              		   }catch (Exception e) {
                             System.err.println("Error: " + e.getMessage());
                             JOptionPane.showMessageDialog(null, e.getMessage(), "File I/O Error", JOptionPane.ERROR_MESSAGE);
                         }
            		   y.setSource(null);
            		
            	   ArrayList<String> listFileContents = new ArrayList<String>();
                   
                   try {
                       // Get the latest file in folder,  Open the file:
                       FileInputStream fstream = new FileInputStream(n);
                       
                       // Get the object of DataInputStream
                       DataInputStream in = new DataInputStream(fstream);
                       BufferedReader br = new BufferedReader(new InputStreamReader(in));
                       String strLine;
                       //Read File Line By Line
                       while ((strLine = br.readLine()) != null) {
                           listFileContents.add(strLine);
                       }
                       //Close the input stream
                       in.close();
                       printToPrinter(listFileContents);
                    
                   
                   } catch (Exception e) {
                       System.err.println("Error: " + e.getMessage());
                       JOptionPane.showMessageDialog(null, e.getMessage(), "File I/O Error", JOptionPane.ERROR_MESSAGE);
                   }

               }else {Sched="";y.setSource(null);}}
                     
                   //   if(y.getSource()==back) {f.dispose(); new Printer_Test();}           
               }          
             });//back_button   
    	   
    	   
    	 schedportal.addActionListener(new ActionListener() {
    	      	@Override
    	      	public void actionPerformed(ActionEvent ae) 
    	      	{f.dispose(); new Mainscreen();}
    					});
    		  about.addActionListener(new ActionListener() {
    	       	@Override
    	       	public void actionPerformed(ActionEvent ae)
    	       	{f.dispose(); }
    	       	});
    		 
    		   logout.addActionListener(new ActionListener() {
    	          
    	      	  @Override
    	            public void actionPerformed(ActionEvent ae) 
    	            {f.dispose(); new login();}
    	                }); 
    	   help.addActionListener(new ActionListener() {
    	       
    	   	  @Override
    	         public void actionPerformed(ActionEvent ae) 
    	         {f.dispose(); }
    	             });  
        File file=new File("/Users/cielolucas/eclipse-workspace/DTR");
        File files[]=  file.listFiles();numfiles=0;
        for(File f:files){
            if(f.getName().contains(uid+".txt")){
                numfiles++;
            }
        }fs=new String[numfiles+1];
        int i=1;
        fs[0]="default";
        for(File f:files){
            if(f.getName().contains(uid+".txt")){
                fs[i]=f.getName();i++;
            }
        }listfile=new JComboBox<Object>(fs);vpanel.add(listfile);
        
        listfile.setBounds(675,20,300,34);
        listfile.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	String cz=listfile.getSelectedItem().toString();
            	File cx=new File(cz);String grab="",spc="", tmp="";int line=0;
            	if(cx.isFile()) {
             		try{	File file=new File(cz);
             		Scanner read=new Scanner(file);
             		read.useDelimiter("[\n]+");
             		
             		while(read.hasNextLine()) 
             		{line++;
             		if(line==1) {spc="\t\t\t\t";}
             		if(line==2) {spc="\t\t";}
             		if(line==3) {spc="\t\t";}
             		if(line==4) {spc="\t\t\t\t";}
             		if(line==5) {spc="\t\t\t\t";}
             		if(line==6) {spc="\t\t\t";}
             		if(line==7) {spc="\t\t\t\t";}
             		if(line==8) {spc="\t\t";}
             		if(line==9) {spc="\t\t";}
             		
             		if(line>10) {spc="";}
             		if(line==10) {tmp=read.nextLine();grab=grab+"\n";}
             		if(line!=10) {grab=grab+spc+read.nextLine()+"\n";spc="";}
             			
             		}//while

             		read.close();
             		}catch(Exception x){}
                	info.setText(grab);
            	}

            }
        });
        
        
	}//constructor
	
	
    void cur_user() {
 		
 		try{	File file=new File("current_user.txt");
 		Scanner read=new Scanner(file);
 		read.useDelimiter("[,\n]+");


 		while(read.hasNext()) 
 		{
 			uname=read.next();umail=read.next();upass=read.next();uid=read.next();
 			
 		}//while

 		read.close();
 		}catch(Exception x){}
    	
    	
    }
	
	public static void main(String[]args) {
		
		new view();
		
	}
	  public static void printToPrinter(ArrayList<String> listOfFileContents) {
          // Calling a method for getting all diag info out of jlstDiagnostic loaded contents:
        

          // Make a String out of the Arraylist<String>:
          String printData = "";
          Iterator<String> it =  listOfFileContents.iterator();
          while (it.hasNext()) {
              printData = printData + it.next();
              printData = printData + "\r\n";
          }

          // Feed the data to be printed to the PrinterJob instance:
          PrinterJob job = PrinterJob.getPrinterJob();
          job.setPrintable(new OutputPrinter(printData));
          boolean doPrint = job.printDialog();
          if (doPrint) {
              try {
                  job.print();
              } catch (PrinterException e) {
                  // Print job did not complete.
              }
          }
      }
}
