package dtr;



import javax.imageio.ImageIO;

//gagawin mo pag pindot ng add schedule create new textfile 


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main extends JFrame  {//class
	static Calendar now = Calendar.getInstance();
	static int yr = now.get(Calendar.YEAR);
	int mt = now.get(Calendar.MONTH);
	static int dy = now.get(Calendar.DAY_OF_MONTH);
	static int click=99;
	static String year = String.valueOf(yr);
	static String days = String.valueOf(dy);
	static String ar="", arr="", drr="", dr="", uname="", umail="", upass="", uid="";
	static String sched="";
	

	private static JTextField day2 = new JTextField();
	private static JTextField arr2 = new JTextField();
	private static JTextField dep2 = new JTextField();
    private static JTextField min3 = new JTextField();
    private static JTextField min4 = new JTextField();
	//edit ^
    private static JTextField name = new JTextField();
    private static JTextField Day = new JTextField();
    private static JTextField arrive = new JTextField();
    private static JTextField depart = new JTextField();
    private static JTextField min1 = new JTextField();
    private static JTextField min2 = new JTextField();
    
    //text_fields
    
    private static JTable table = new JTable();
    //tables
    
    JFrame f=new JFrame("Add Schedule");
    //frames
    
    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    //tabbed_pane
    
    JScrollPane scrollPane = new JScrollPane();
    //Scroll_panes
    
    JPanel MainPanel = new JPanel(); 
    JPanel AddentryPanel = new JPanel();
    JPanel EditentryPanel = new JPanel();
    //panels
    
    JLabel day = new JLabel("Day:");
    JLabel incom = new JLabel("");
    JLabel arrtime = new JLabel("Arrival Time (AM):");
    JLabel notAMe = new JLabel("");
    JLabel deptime = new JLabel("Departure Time (PM):");
    JLabel notPMe = new JLabel("");
    JLabel clm3 = new JLabel(":");
    JLabel clm4 = new JLabel(":");
    //edit ^
    JLabel incomplete = new JLabel("");
    JLabel daylabel = new JLabel("Day:");
    JLabel notname = new JLabel("");
    JLabel namelabel = new JLabel("Fullname:");
    JLabel notAM = new JLabel("");
    JLabel arrivelabel = new JLabel("Arrival Time (AM):");
    JLabel notPM = new JLabel("");
    JLabel departlabel = new JLabel("Departure Time (PM):");
    JLabel notdate = new JLabel("");
    JLabel datelabel = new JLabel("Date:");
    JLabel hype = new JLabel("-");
    JLabel clm1 = new JLabel(":");
    JLabel clm2 = new JLabel(":");
    
    //labels
	
    static JButton AddEntrybutton = new JButton("Add");
    static JButton ClearButton = new JButton("Clear");
    static JButton curyear = new JButton(year);
    static JButton edit = new JButton("Add");
    static JButton clearx = new JButton("Clear");
    static JButton delx = new JButton("Delete File");
    //buttons
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileoption = new JMenu("Option");
    //menu_bars
    
    JMenuItem loadcontact = new JMenuItem("View Schedule");
    JMenuItem savecontact = new JMenuItem("Edit Schedule");
    JMenuItem close = new JMenuItem("Close");
    //menu_items
    
    Font fnt1 = new Font("Helvetica",Font.PLAIN,12);
    Font fnt2 = new Font("Arial",Font.BOLD,25);
    //fonts
    
    static String opt[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    String sdate="";
	static JComboBox<?> month=new JComboBox<Object>(opt);  
    static String num[]={"day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};        
	static JComboBox<?> numday=new JComboBox<Object>(num);
    static String num1[]={"day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};        
	static JComboBox<?> numday1=new JComboBox<Object>(num1);
	//combo_box
	
	static boolean dayval=false;
	static boolean arrivev=false;
	static boolean departv=false;
	static boolean min3valid=true;
	static boolean min4valid=true;
	//edit ^
    static boolean dayvalid=false;
	static boolean namevalid=false;
	static boolean arrivevalid=false;
	static boolean departvalid=false;
	static boolean min1valid=true;
	static boolean min2valid=true;
	 JPanel panel3=new JPanel();
	   JPanel panel5=new JPanel();
	   Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   
	   
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

    public Main() throws Exception  {
    	cur_user(); Main.adding();
    	for(int x=0;x<=opt.length;x++) {
    		if(x==mt) {month.setSelectedIndex(x);}
    	}
	
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      	int width = screenSize.width, height=screenSize.height;
        
      	f.setSize(1300, height);
  		f.setLocation(screenSize.width/2-f.getSize().width/2, screenSize.height/2-f.getSize().height/2);//center
  		//f.setResizable(false);
    	try {f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("gradient.jpg")))));
        } catch (IOException e) {e.printStackTrace();}//background design
    	

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
//centered
    	getContentPane().setLayout(null);
        getContentPane().add(tabbedPane);
        tabbedPane.setBackground(new Color(189, 183, 107));
        tabbedPane.setBounds(145, 160, 1000, 450);    
        scrollPane.setBounds(40, 60, 900, 250);
//main.java design
        
        
        MainPanel.add(scrollPane);
        MainPanel.setBackground(new Color(229, 234, 232));MainPanel.setLayout(null);
        tabbedPane.addTab("DTR", null, MainPanel, null);  
// the column in the table
        table.setBorder(UIManager.getBorder("DesktopIcon.border"));
        scrollPane.setViewportView(table);
        table.setModel(new DefaultTableModel(

                new Object[][] {
            },
            new String[] {
                "Day", "Arrival AM.", "Departure PM."
            }
        ));
// the main panel that hold the search bar and table
        

        AddentryPanel.setBackground(new Color(229, 234, 232));
        AddentryPanel.setBounds(0,0,100,200);
// add the entry tab for inputting information
        tabbedPane.addTab("Add to schedule", null, AddentryPanel, null); 
        AddentryPanel.setLayout(null);
// set absolute layout
        AddentryPanel.add(AddEntrybutton);AddentryPanel.add(ClearButton);
        AddentryPanel.add(Day);AddentryPanel.add(daylabel);AddentryPanel.add(incomplete);
        AddentryPanel.add(name);AddentryPanel.add(namelabel);AddentryPanel.add(notname);
        AddentryPanel.add(arrive);AddentryPanel.add(arrivelabel);AddentryPanel.add(notAM);
        AddentryPanel.add(depart);AddentryPanel.add(departlabel);AddentryPanel.add(notPM);
        AddentryPanel.add(month);AddentryPanel.add(datelabel);AddentryPanel.add(clm1);AddentryPanel.add(clm2);
        AddentryPanel.add(numday);AddentryPanel.add(numday1);AddentryPanel.add(hype);
        AddentryPanel.add(curyear);AddentryPanel.add(min1);AddentryPanel.add(min2);min1.setText("00");min2.setText("00");
        
        Day.setBounds(350, 60, 308, 34); Day.setColumns(10);
        daylabel.setForeground(Color.BLUE);
        daylabel.setBounds(352, 45, 99, 14);
        incomplete.setBounds(465,87,350,30);incomplete.setFont(fnt1);
        DayListener();
// add the day text field to the add entry panel
        
        name.setBounds(350, 120, 308, 34); name.setColumns(10);
        namelabel.setForeground(Color.BLUE);
        namelabel.setBounds(352, 105, 99, 14);
        name.setText(uname);
        notname.setBounds(465,147,350,30);notname.setFont(fnt1);
        nameListener();
// add the name text field to the add entry panel
        
        arrive.setBounds(350, 183, 250, 34); arrive.setColumns(30);clm1.setBounds(600,180,5,34);
        arrivelabel.setForeground(Color.BLUE);min1.setBounds(610,180,40,34);
        arrivelabel.setBounds(352, 170, 120, 14);
        notAM.setBounds(465,207,350,30);notAM.setFont(fnt1);
        arriveListener();min1Listener();
// add the arrive text field to the add entry panel
        
        depart.setBounds(350, 240, 250, 34); depart.setColumns(30);clm2.setBounds(600,240,5,34);
        departlabel.setForeground(Color.BLUE);min2.setBounds(610,240,40,34);
        departlabel.setBounds(350, 225, 120, 14);
        notPM.setBounds(352,267,350,30);notPM.setFont(fnt1);
        departListener();min2Listener();
// add the depart text field to the add entry panel
        
        month.setBounds(350, 295, 90, 34);numday.setBounds(440,295,60,34);hype.setBounds(505,295,10,34);hype.setFont(fnt2);
        datelabel.setForeground(Color.BLUE);numday1.setBounds(520,295,60,34);curyear.setBounds(580,295,70,34);
        datelabel.setBounds(352, 283, 120, 14);
        notdate.setBounds(465,325,350,30);notdate.setFont(fnt1);
        
// add the date to the add entry panel
        
        AddEntrybutton.setForeground(Color.GREEN);
        AddEntrybutton.setBounds(400, 375, 89, 23);
        if(!uname.equals("")) {notname.setForeground(Color.green);notname.setText("Accepted");namevalid=true;}else {notname.setText("");namevalid=false;}
        addListener();
        
        
        
// add and clear button to the entry panel 
        ClearButton.setForeground(Color.RED);
        ClearButton.setBounds(500, 375, 89, 23);
        ClearButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the field?", "Request", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                        == JOptionPane.YES_OPTION)
                    {
                	Day.setText("");
                	name.setText("");
                	arrive.setText("");
                	depart.setText("");
                	numday.setSelectedIndex(0);numday1.setSelectedIndex(0);
                	incomplete.setText("");notname.setText("");notAM.setText("");notPM.setText("");notdate.setText("");
                	incomplete.setForeground(Color.green);notname.setForeground(Color.green);
                	notAM.setForeground(Color.green);notPM.setForeground(Color.green);notdate.setForeground(Color.green);
                	min1.setText("00");min2.setText("00");
                	
                    }
                    else
                    {
                     //Go back to normal
                    }

            }
        });

      
        menuBar.setBounds(0, 0, 650, 21);
        getContentPane().add(menuBar);    
        menuBar.add(fileoption);
        fileoption.add(loadcontact);
        fileoption.add(savecontact);
        fileoption.add(close);

        table.getColumnModel().getColumn(2).setPreferredWidth(124);
        f.setTitle("Add Schedule");
        f.add(tabbedPane);
        f.add(panel3);
    	f.add(panel5);
    	f.add(panel6);
    	f.add(panel7);
    	f.add(panel8);
    	
        f.setLayout(null);
        f.setLocationRelativeTo(null); // Center the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        
     
        // add the add button to the entry panel 
       

 

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
        
    }
    public static void addListener() {
       AddEntrybutton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
            	 
            	Main.SaveAdd();

               	}//actionperformed
        });
    	
    }
    
    public static void adding() {
    	
        
  
        click=7;
        sched="";
    	sched = JOptionPane.showInputDialog("Note: Entering an existing filename will overwrite the file\nEnter Schedule name: ");
    	File gg=new File(sched+uid+".txt");
    	if(sched.equals("")) {JOptionPane.showMessageDialog(null, "Please enter a valid file name");Main.adding();}
    	else if(gg.isFile()){
       		click=JOptionPane.showConfirmDialog (null, "Schedule File already exists!\n\nDo you want to overwrite the file?"); 
       			if(click==JOptionPane.YES_OPTION) {try {
					gg.delete();gg.createNewFile();
				} catch (IOException we) {}}
       			else if(click==JOptionPane.NO_OPTION) {Main.adding();}
       			else if(click==JOptionPane.CANCEL_OPTION) {Main.adding();}
       	}//if existing file
       	
    	else{Main.NewFile(sched+uid+".txt");click-=99;}
        
    	JOptionPane.showMessageDialog(null,"Your schedule name: \n"+sched+uid+".txt is successfully created!", ar, JOptionPane.INFORMATION_MESSAGE);
        
    	
    	
        }
    
    
    public static void SaveAdd() {
    	
 
    	if(numday.getSelectedIndex()==0||numday1.getSelectedIndex()==0||dayvalid==false||namevalid==false||arrivevalid==false||departvalid==false){
            JOptionPane.showMessageDialog (null, "Please select a proper data");}
        // prompt if you are sure you want to add these information into the table
    	else if (
    			
    			JOptionPane.showConfirmDialog(null, "Would you like to add these field to table?", "Request", 
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.YES_OPTION)
            {

           	
           	DefaultTableModel dtm = (DefaultTableModel)table.getModel();

            dtm.addRow(new Object[] { Day.getText(), arrive.getText()+":"+min1.getText(), depart.getText()+":"+min2.getText()});
            
        String f =  name.getText();
        String m = "Month of:"+opt[month.getSelectedIndex()]+" "+num[numday.getSelectedIndex()]+"-"+num1[numday1.getSelectedIndex()]+", "+year;
        BufferedWriter bfw;
     //   JTable tt = new JTable(); 
		try {
			    
			String n = sched + uid + ".txt";
			bfw = new BufferedWriter(new FileWriter(n));  
		
			bfw.write("                                        Daily Time Record      ");	bfw.write("\n\n\n");
	
			bfw.write("                                              ");bfw.write(f);	bfw.write("\n");
			bfw.write("                         _____________________________________    \n");
			bfw.write("\n");
			bfw.write("                                  ");bfw.write(m);	bfw.write("\n\n\n\n");
			
        for(int i = 0 ; i < table.getColumnCount() ; i++)
        {
          bfw.write("\t\t");
          bfw.write(table.getColumnName(i));
          bfw.write("\t\t\t");
        }

        for (int i = 0 ; i < table.getRowCount(); i++)
        {
          bfw.newLine();
          for(int j = 0 ; j < table.getColumnCount();j++)
          { bfw.write("\t\t");
            bfw.write((String)(table.getValueAt(i,j)));
            bfw.write("\t\t\t\t");;
          }
        }
        bfw.write("\n");
      
        bfw.close();
    }  catch (IOException e1) {
			
			e1.printStackTrace();
		}
            }
    	
    	
    }
    
	public static void NewFile(String filename){

		File f=new File(filename);
		if(f.isFile()){
						
						}
		else{
			try {
				f.createNewFile();
				FileWriter fw=new FileWriter(f);
				PrintWriter pw=new PrintWriter(fw);
				pw.close();

			} catch (IOException e){}
		}//create file
	}//NewFile


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
    
	void DayListener(){

		   Day.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        incomplete.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
                  System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           incomplete.setText("");
		      	   if(Main.isValidDay(Day.getText())&&Day.getText().length()<=2&&Day.getText().length()>=1)
	    			{incomplete.setForeground(Color.green);
	    			 int x=Integer.parseInt(Day.getText());
	    			if(x>=1&&x<=31) {
	    			incomplete.setText("Accepted");
	    			dayvalid=true;
	    			}else{incomplete.setForeground(Color.blue);incomplete.setText("* Accepting 1-31 only");dayvalid=false;}
	    			
	    			
	    			}
	    			
		      	   else{incomplete.setForeground(Color.blue);incomplete.setText("*Accepting 1-31 only");dayvalid=false;}
	    			}
		   });

	}//DayListener method
	
	void Day1Listener(){

		   day2.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        incom.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
               System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           incom.setText("");
		      	   if(Main.isValidDay(day2.getText())&&day2.getText().length()<=2&&day2.getText().length()>=1)
	    			{incom.setForeground(Color.green);
	    			 int x=Integer.parseInt(day2.getText());
	    			if(x>=1&&x<=31) {
	    			incom.setText("Accepted");
	    			dayval=true;
	    			}else{incom.setForeground(Color.blue);incom.setText("* Accepting 1-31 only");dayval=false;}
	    			
	    			
	    			}
	    			
		      	   else{incom.setForeground(Color.blue);incom.setText("* Accepting 1-31 only");dayval=false;}
	    			}
		   });

	}//Day1Listener method
	
	void nameListener(){

		   name.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notname.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
                  System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notname.setText("");
		      	   if(Main.isValidName(name.getText()))
	    			{notname.setForeground(Color.green);notname.setText("Accepted");namevalid=true;}
	    			else{notname.setForeground(Color.blue);notname.setText("* Please enter a valid name.");namevalid=false;}
		           }
		   });

	}//passListener method
	
	void arriveListener(){

		   arrive.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notAM.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
               System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notAM.setText("");
		      	   if(Main.isValidDay(arrive.getText())&&arrive.getText().length()<=2&&arrive.getText().length()>=1)
	    			{notAM.setForeground(Color.green);
	    			 int x=Integer.parseInt(arrive.getText());
	    			if(x>=1&&x<=12) {
	    			notAM.setText("Accepted");
	    			if(min1valid==true) {arrivevalid=true; ar=arrive.getText()+":"+min1.getText();}
	    			}else{notAM.setForeground(Color.blue);notAM.setText("* Accepting 1-12 only");arrivevalid=false;}
	    			
	    			
	    			}
	    			
		      	   else{notAM.setForeground(Color.blue);notAM.setText("* Accepting 1-12 only");arrivevalid=false;}
	    			}
		   });

	}//arriveListener method
	void arrive1Listener(){

		   arr2.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notAMe.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
            System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notAMe.setText("");
		      	   if(Main.isValidDay(arr2.getText())&&arr2.getText().length()<=2&&arr2.getText().length()>=1)
	    			{notAMe.setForeground(Color.green);
	    			 int x=Integer.parseInt(arr2.getText());
	    			if(x>=1&&x<=12) {
	    			notAMe.setText("Accepted");
	    			if(min3valid==true) {arrivev=true; arr=arr2.getText()+":"+min3.getText();}
	    			}else{notAMe.setForeground(Color.blue);notAMe.setText("* Accepting 1-12 only");arrivev=false;}
	    			
	    			
	    			}
	    			
		      	   else{notAMe.setForeground(Color.blue);notAMe.setText("* Accepting 1-12 only");arrivev=false;}
	    			}
		   });

	}//arriveListener method
	
	void min3Listener(){

		   min3.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notAMe.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
         System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notAMe.setText("");
		      	   if(Main.isValidDay(min3.getText())&&min3.getText().length()<=2&&min3.getText().length()>=1||min3.getText().equals("00")&&!arr2.getText().equals(""))
	    			{notAMe.setForeground(Color.green);
	    			 int x=Integer.parseInt(min3.getText());
	    			if(x>=0&&x<=59) {
	    			notAMe.setText("Accepted");
	    			min3valid=true;
	    			}else{notAMe.setForeground(Color.blue);notAMe.setText("* Please input a valid minute value");min3valid=false;}
	    			
	    			
	    			}
	    			
		      	   else{notAMe.setForeground(Color.blue);notAMe.setText("* Please input a valid minute value");min3valid=false;}
	    			}
		   });

	}//arriveListener method
	
	void min1Listener(){

		   min1.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notAM.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
            System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notAM.setText("");
		      	   if(Main.isValidDay(min1.getText())&&min1.getText().length()<=2&&min1.getText().length()>=1||min1.getText().equals("00")&&!arrive.getText().equals(""))
	    			{notAM.setForeground(Color.green);
	    			 int x=Integer.parseInt(min1.getText());
	    			if(x>=0&&x<=59) {
	    			notAM.setText("Accepted");
	    			min1valid=true;
	    			}else{notAM.setForeground(Color.blue);notAM.setText("* Please input a valid minute value");min1valid=false;}
	    			
	    			
	    			}
	    			
		      	   else{notAM.setForeground(Color.blue);notAM.setText("* Please input a valid minute value");min1valid=false;}
	    			}
		   });

	}//arriveListener method
	
	void departListener(){

		   depart.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notPM.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
            System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notPM.setText("");
		      	   if(Main.isValidDay(depart.getText())&&depart.getText().length()<=2&&depart.getText().length()>=1)
	    			{notPM.setForeground(Color.green);
	    			 int x=Integer.parseInt(depart.getText());
	    			if(x>=1&&x<=12) {
	    			notPM.setText("Accepted");
	    			if(min2valid==true) {departvalid=true; dr=depart.getText()+":"+min2.getText();}
	    			}else{notPM.setForeground(Color.blue);notPM.setText("* Accepting 1-12 only");departvalid=false;}
	    			
	    			
	    			}
	    			
		      	   else{notPM.setForeground(Color.blue);notPM.setText("*Accepting 1-12 only");departvalid=false;}
	    			}
		   });

	}//departListener method
	
	void depart1Listener(){

		   dep2.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notPMe.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
         System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notPMe.setText("");
		      	   if(Main.isValidDay(dep2.getText())&&dep2.getText().length()<=2&&dep2.getText().length()>=1)
	    			{notPMe.setForeground(Color.green);
	    			 int x=Integer.parseInt(dep2.getText());
	    			if(x>=1&&x<=12) {
	    			notPMe.setText("Accepted");
	    			if(min4valid==true) {departv=true; drr=dep2.getText()+":"+min4.getText();}
	    			}else{notPMe.setForeground(Color.blue);notPMe.setText("* Accepting 1-12 only");departv=false;}
	    			
	    			
	    			}
	    			
		      	   else{notPMe.setForeground(Color.blue);notPMe.setText("*Accepting 1-12 only");departv=false;}
	    			}
		   });

	}//departListener method
	
	void min4Listener(){

		   min4.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notPMe.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
      System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notPMe.setText("");
		      	   if(Main.isValidDay(min4.getText())&&min4.getText().length()<=2&&min4.getText().length()>=1||min4.getText().equals("00")&&!dep2.getText().equals(""))
	    			{notPMe.setForeground(Color.green);
	    			 int x=Integer.parseInt(min4.getText());
	    			if(x>=0&&x<=59) {
	    			notPMe.setText("Accepted");
	    			min4valid=true;
	    			}else{notPMe.setForeground(Color.blue);notPMe.setText("* Please input a valid minute value");min4valid=false;}
	    			
	    			
	    			}
	    			
		      	   else{notPMe.setForeground(Color.blue);notPMe.setText("* Please input a valid minute value");min4valid=false;}
	    			}
		   });

	}//arriveListener method
	void min2Listener(){

		   min2.addKeyListener(new KeyListener(){
		        @Override
		        public void keyPressed(KeyEvent e) {
		        notPM.setText("");
		        
		        }

		           @Override
		           public void keyTyped(KeyEvent e) {
         System.out.print("");
		           }

				@Override
		           public void keyReleased(KeyEvent e) {
		           notPM.setText("");
		      	   if(Main.isValidDay(min2.getText())&&min2.getText().length()<=2&&min2.getText().length()>=1||min2.getText().equals("00")&&!depart.getText().equals(""))
	    			{notPM.setForeground(Color.green);
	    			 int x=Integer.parseInt(min2.getText());
	    			if(x>=0&&x<=59) {
	    			notPM.setText("Accepted");
	    			min2valid=true;
	    			}else{notPM.setForeground(Color.blue);notPM.setText("* Please input a valid minute value");min2valid=false;}
	    			
	    			
	    			}
	    			
		      	   else{notPM.setForeground(Color.blue);notPM.setText("* Please input a valid minute value");min2valid=false;}
	    			}
		   });

	}//arriveListener method
    
    public static boolean
    isValidDay(String password)
    {
  
        // Regex to check valid password.
        String regex = "[0-9]+";
  
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
    
    public static boolean
    isValidName(String password)
    {
  
        // Regex to check valid password.
        String regex = "[ A-Za-z.]+";
  
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
    
public static void main(String[] args) throws Exception {
         new Main();
      
      

    }
}