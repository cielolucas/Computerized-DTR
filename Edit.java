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



public class Edit extends JFrame  {//class
	static Calendar now = Calendar.getInstance();
	static int yr = now.get(Calendar.YEAR);
	static int mt = now.get(Calendar.MONTH);
	static int dy = now.get(Calendar.DAY_OF_MONTH);
	static int click=99;
	static String year = String.valueOf(yr);
	static String days = String.valueOf(dy);
	static String ar="", arr="", drr="", dr="", uname="", umail="", upass="", uid="";
	static String sched1="";
	

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
    static int clickerz=0;
    private static JTable table = new JTable();
    //tables
    
    static JFrame f=new JFrame("Computerized Daily Time record System");
    //frames
    
    static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
    //tabbed_pane
    
    static JScrollPane scrollPane = new JScrollPane();
    //Scroll_panes
    
    static JPanel MainPanel = new JPanel(); 
  
    static JPanel EditentryPanel = new JPanel();
    //panels
    static JPanel panel3=new JPanel();
    static   JPanel panel5=new JPanel();
    static    Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   
	   
    static    JPanel panel6=new JPanel();
    static    JPanel panel7=new JPanel();
    static    JPanel panel8=new JPanel();
    static    JPanel panel9=new JPanel();
    static    JPanel panel10=new JPanel();
    static    JPanel panel11=new JPanel();
	   static JLabel label2 = new JLabel(); 
	   static    JButton logout = new JButton();
	   static   JButton about = new JButton();
	   static    JButton schedportal = new JButton();
	   static    JButton help = new JButton();
	   static    JButton contact = new JButton();
	   static JLabel label3 = new JLabel();
	   static  JLabel day = new JLabel("Day:");
	   static   JLabel incom = new JLabel("");
    static   JLabel arrtime = new JLabel("Arrival Time (AM):");
    static    JLabel notAMe = new JLabel("");
    static    JLabel deptime = new JLabel("Departure Time (PM):");
    static   JLabel notPMe = new JLabel("");
    static   JLabel clm3 = new JLabel(":");
    static   JLabel clm4 = new JLabel(":");
    //edit ^
    static  JLabel incomplete = new JLabel("");
    static   JLabel daylabel = new JLabel("Day:");
    static   JLabel notname = new JLabel("");
    static   JLabel namelabel = new JLabel("Fullname:");
    static   JLabel notAM = new JLabel("");
    static   JLabel arrivelabel = new JLabel("Arrival Time (AM):");
    static  JLabel notPM = new JLabel("");
    static  JLabel departlabel = new JLabel("Departure Time (PM):");
    static   JLabel notdate = new JLabel("");
    static   JLabel datelabel = new JLabel("Date:");
    static   JLabel hype = new JLabel("-");
    static    JLabel clm1 = new JLabel(":");
    static     JLabel clm2 = new JLabel(":");
    
    //labels
	
    static JButton AddEntrybutton = new JButton("Add");
    static JButton ClearButton = new JButton("Clear");
    static JButton curyear = new JButton(year);
    static JButton edit = new JButton("Add");
    static JButton clearx = new JButton("Clear");
    static JButton delx = new JButton("Delete File");
    //buttons
    
    static    JMenuBar menuBar = new JMenuBar();
    static    JMenu fileoption = new JMenu("Option");
    //menu_bars
    
    static   JMenuItem loadcontact = new JMenuItem("View Schedule");
    static   JMenuItem savecontact = new JMenuItem("Edit Schedule");
    static   JMenuItem close = new JMenuItem("Close");
    //menu_items
    
    static   Font fnt1 = new Font("Helvetica",Font.PLAIN,12);
    static  Font fnt2 = new Font("Arial",Font.BOLD,25);
    //fonts
    
    static String opt[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
    static  String sdate="";
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

    
    public static void Editz() throws Exception  {
    
    	for(int x=0;x<=opt.length;x++) {
    		if(x==mt) {month.setSelectedIndex(x);}
    	}
	
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      	int width = screenSize.width, height=screenSize.height;
        
      	f.setSize(1300, height);
  		f.setLocation(screenSize.width/2-f.getSize().width/2, screenSize.height/2-f.getSize().height/2);//center
    	try {f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("d.jpg")))));
        } catch (IOException e) {e.printStackTrace();}//background design
    	
    	
    	 String sched=sched1;
     
     	
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
        


// add and clear button to the entry panel 
        ClearButton.setForeground(Color.RED);
        ClearButton.setBounds(633, 375, 89, 23);
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
   	 schedportal.addActionListener(new ActionListener() {
      	@Override
      	public void actionPerformed(ActionEvent ae) 
      	{reset();new Mainscreen();}
				});
	  about.addActionListener(new ActionListener() {
       	@Override
       	public void actionPerformed(ActionEvent ae)
       	{reset();}
       	});
	 
	   logout.addActionListener(new ActionListener() {
          
      	  @Override
            public void actionPerformed(ActionEvent ae) 
            {reset(); new login();}
                }); 
   help.addActionListener(new ActionListener() {
       
   	  @Override
         public void actionPerformed(ActionEvent ae) 
         {reset(); }
             });  
        
        //edit panel
        /* For editing schedule. append information: Arrival time, departure time.*/
       
        EditentryPanel.setBackground(new Color(229, 234, 232));EditentryPanel.setForeground(Color.GREEN);
        tabbedPane.addTab("Edit Schedule", null, EditentryPanel, null); 
        EditentryPanel.setLayout(null); 
        EditentryPanel.add(edit);EditentryPanel.add(clearx);
        EditentryPanel.add(day2);EditentryPanel.add(day);EditentryPanel.add(incom);
        EditentryPanel.add(arr2);EditentryPanel.add(arrtime);EditentryPanel.add(notAMe);EditentryPanel.add(clm3);
        EditentryPanel.add(dep2);EditentryPanel.add(deptime);EditentryPanel.add(notPMe);EditentryPanel.add(clm4);
		EditentryPanel.add(min3);EditentryPanel.add(min4);min3.setText("00");min4.setText("00");
		EditentryPanel.add(edit); EditentryPanel.add(clearx);EditentryPanel.add(delx);
        
		
		
		day2.setBounds(350, 120, 308, 34); day2.setColumns(10);
        day.setForeground(Color.BLUE);
        day.setBounds(352, 105, 99, 14);
        incom.setBounds(463,147,350,30);incom.setFont(fnt1);
        Day1Listener();
// add the day text field to the edit entry panel

        arr2.setBounds(350, 183, 250, 34); arr2.setColumns(30);clm3.setBounds(600,180,5,34);
        arrtime.setForeground(Color.BLUE);min3.setBounds(610,180,40,34);
        arrtime.setBounds(352, 170, 120, 14);
        notAMe.setBounds(465,207,350,30);notAMe.setFont(fnt1);
        arrive1Listener();min3Listener();
// add the arrive text field to the edit entry panel
      
        dep2.setBounds(350, 240, 250, 34); dep2.setColumns(30);clm4.setBounds(600,240,5,34);
        deptime.setForeground(Color.BLUE);min4.setBounds(610,240,40,34);
        deptime.setBounds(350, 225, 120, 14);
        notPMe.setBounds(352,267,350,30);notPMe.setFont(fnt1);
        depart1Listener();min4Listener();
// add the depart text field to the edit entry panel
     // add and clear button to the entry panel 
        delx.setForeground(Color.blue);
        clearx.setForeground(Color.RED);
        edit.setForeground(Color.GREEN);
        edit.setBounds(350, 315, 89, 23);
        clearx.setForeground(Color.RED);
        clearx.setBounds(450, 315, 89, 23);
        delx.setBounds(550, 315, 105, 23);
        clearx.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure you want to clear the field?", "Request", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                        == JOptionPane.YES_OPTION)
                    {
                	day2.setText("");
                	arr2.setText("");
                	dep2.setText("");
                	incom.setText("");notAMe.setText("");notPMe.setText("");
                	incom.setForeground(Color.green);notAMe.setForeground(Color.green);notPMe.setForeground(Color.green);
                	min3.setText("00");min4.setText("00");
                	
                    }
                    else
                    {
                     //Go back to normal
                    }

            }
        });
        
        delx.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (
                		JOptionPane.showConfirmDialog(null, "This will permanently delete "+sched+uid+".txt"+"\nDo you want to continue?", "Request", 
                        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                        == JOptionPane.YES_OPTION)
                    {
                	e.setSource(null);
                	File zz=new File(sched+uid+".txt");
                	zz.delete();
                	JOptionPane.showMessageDialog(null, "The file "+sched+uid+".txt has been deleted");
                	
                    }
                    else
                    {
                     //Go back to normal
                    	e.setSource(null);
                    }

            }
        });
        
        
        edit.addActionListener(new ActionListener() {
        	  public void actionPerformed(ActionEvent e) {
        		 
        		  if(e.getSource()==edit) {
        		   if(arrivev==false||departv==false||dayval==false){ e.setSource(null);
                       JOptionPane.showMessageDialog (null, "Make sure all text field are filled"); 
                   }
        		   // prompt if you are sure you want to add these information into the table
                   else 
                       { e.setSource(null);
                	   clickerz=JOptionPane.showConfirmDialog(null, "Would you like to add these field to table?", "Request", 
                               JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                	   if(clickerz==JOptionPane.YES_OPTION) {
                       DefaultTableModel dtm = (DefaultTableModel)table.getModel();

                       dtm.addRow(new Object[] { day2.getText(), arr2.getText()+":"+min3.getText(), dep2.getText()+":"+min4.getText()});
                       
                  
                 //  BufferedWriter bfw;
    				try {
    					String n = sched+uid+ ".txt";
    				//	bfw = new BufferedWriter(new FileWriter(n));
    					File file = new File(n);
    					PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
    					
                 
            
    				   writer.write("\t\t");
    				   writer.write(day2.getText());
                  	   writer.write("\t\t\t\t\t\t");
                  	   writer.write(arr2.getText()+":"+min3.getText());
                  	   writer.write("\t\t\t\t\t\t");
                  	   writer.write(dep2.getText()+":"+min4.getText());
                  	   writer.write("\t\t\t\t\t");
                  	   writer.write("\n");
                   
                   writer.close();
               }  catch (IOException e1) {
    					e1.printStackTrace();
               }}else {clickerz-=99;}
                	   
                       }
        	  } }
       });
     

        // add the add button to the entry panel 
       

 
        
        
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


  
	static void Day1Listener(){

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
		      	   if(Edit.isValidDay(day2.getText())&&day2.getText().length()<=2&&day2.getText().length()>=1)
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
		      	   if(Edit.isValidName(name.getText()))
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
		      	   if(Edit.isValidDay(arrive.getText())&&arrive.getText().length()<=2&&arrive.getText().length()>=1)
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
	static void arrive1Listener(){

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
		      	   if(Edit.isValidDay(arr2.getText())&&arr2.getText().length()<=2&&arr2.getText().length()>=1)
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
	
	static void min3Listener(){

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
		      	   if(Edit.isValidDay(min3.getText())&&min3.getText().length()<=2&&min3.getText().length()>=1||min3.getText().equals("00")&&!arr2.getText().equals(""))
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
		      	   if(Edit.isValidDay(min1.getText())&&min1.getText().length()<=2&&min1.getText().length()>=1||min1.getText().equals("00")&&!arrive.getText().equals(""))
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
		      	   if(Edit.isValidDay(depart.getText())&&depart.getText().length()<=2&&depart.getText().length()>=1)
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
	
	static void depart1Listener(){

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
		      	   if(Edit.isValidDay(dep2.getText())&&dep2.getText().length()<=2&&dep2.getText().length()>=1)
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
	
	static void min4Listener(){

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
		      	   if(Edit.isValidDay(min4.getText())&&min4.getText().length()<=2&&min4.getText().length()>=1||min4.getText().equals("00")&&!dep2.getText().equals(""))
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
	
	static void reset() {
		
		day2.setText("");
    	arr2.setText("");
    	dep2.setText("");
    	incom.setText("");notAMe.setText("");notPMe.setText("");
    	incom.setForeground(Color.green);notAMe.setForeground(Color.green);notPMe.setForeground(Color.green);
    	min3.setText("00");min4.setText("00");
    	f.dispose();EditentryPanel.setEnabled(false);
    	arrivev=false;departv=false;dayval=false;clickerz-=99;
	}
	
	
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
		      	   if(Edit.isValidDay(min2.getText())&&min2.getText().length()<=2&&min2.getText().length()>=1||min2.getText().equals("00")&&!depart.getText().equals(""))
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
    static void cur_user() {
 		
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
public static void main(String[] args) throws Exception {
	cur_user();
    sched1="";
 	sched1 = JOptionPane.showInputDialog("Note: Entering the same name for adding schedule will overwrite the current file \n\nEnter Schedule name: ");
	File checks=new File(sched1+uid+".txt");
	System.out.print(sched1);
	
	if(!sched1.equals("")) {
	if(checks.isFile()) {
 	Edit.Editz();}//nakita ang file
	else if(!checks.isFile()){
		int clicks=JOptionPane.showConfirmDialog(null, "File not found!\nTry Again?");
		if(clicks==JOptionPane.YES_OPTION) {
			clicks-=99;Edit.main(null);
		}
		else {System.exit(0);}
	  }//else if hindi natakita ang file
	}//if may ininput
	else {
		int clickz=JOptionPane.showConfirmDialog(null, "Invalid Input!\nTry Again?");
		if(clickz==JOptionPane.YES_OPTION) {
			clickz-=99;Edit.main(null);
			
		}
		else {clickz-=99;System.exit(0);}
	}//else walang ininput
	
      
      

    }
}