package dtr;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SchedulePortal extends JFrame implements ItemListener, ActionListener {
	
	
	
	private static final long serialVersionUID = 1L;
	JPanel panel=new JPanel(); 
	static String printData = "";
	Font fnt = new Font("Times New Roman",Font.BOLD,60);
	Font fnt1 = new Font("Helvetica",Font.PLAIN,15);
	//fonts
	
	JFrame f=new JFrame("Computerized Daily Time record System");
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int width = screenSize.width, height=screenSize.height;
	//setFrame
   
	JLabel label = new JLabel(); 
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel(); 
	JLabel label3 = new JLabel(); 
	JLabel label4 = new JLabel();
	JLabel label5 = new JLabel();
	JLabel label6 = new JLabel();
	JLabel label7 = new JLabel();
	JLabel label8 = new JLabel();
	JLabel label9 = new JLabel();
	JLabel label10 = new JLabel();
	JLabel label11 = new JLabel();
	
	//labels
   
	JButton back= new JButton("Print");

	
	public static void printToPrinter(ArrayList<String> listOfFileContents) {
       // Calling a method for getting all dialog info out of jlstDiagnostic loaded contents:
      

        // Make a String out of the Arraylist<String>:
		 Iterator<String> it =  listOfFileContents.iterator();
		 while (it.hasNext()) 
		 {
            printData = printData + it.next();
            printData = printData + "\r\n";
		 }

        // Feed the data to be printed to the PrinterJob instance:
      
    }//print to printer
	
	 JButton btnCompute = new JButton("Submit");
		JButton btnClose = new JButton("Close");
		String branch [] = {"Paranaque City","Quezon City","San Juan City","Sta Mesa, Manila","Taguig City"};
		String load [] = {"Full time","Part time"};
		String tClass [] = {"2 Unit","3 Unit","4 Unit"};
		String day [] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String month [] = {"January","February","March","April","May","June","July","August","September","Octuber","November","December"};
		String timein [] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String in_unit [] = {"am","pm"};
		String timeout [] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String out_unit [] = {"am","pm"};
	
		JCheckBox chk10 = new JCheckBox("First");
		JCheckBox chk20 = new JCheckBox("Second");
		JCheckBox chk30 = new JCheckBox("Third");
		
		
		JComboBox<Object> comboBranch = new JComboBox<Object>(branch);
		JComboBox<Object> comboLoad = new JComboBox<Object>(load);
		JComboBox<Object> comboTClass = new JComboBox<Object>(tClass);
		JComboBox<Object> comboDay = new JComboBox<Object>(day);
		JComboBox<Object> comboMonth = new JComboBox<Object>(month);
		JComboBox<Object> comboTimein = new JComboBox<Object>(timein);
		JComboBox<Object> comboIn_Unit = new JComboBox<Object>(in_unit);
		JComboBox<Object> comboTimeOut = new JComboBox<Object>(timeout);
		JComboBox<Object> comboOut_Unit = new JComboBox<Object>(out_unit);
	
		
		JTextField txtBranch = new JTextField(10);
		JTextField txtLoad = new JTextField(10);
		JTextField txtClass = new JTextField(10);
		JTextField txtSem = new JTextField(10);
		JTextField txtDay = new JTextField(10);
		JTextField txtMonth = new JTextField(10);
		JTextField txtTimein = new JTextField(10);
		JTextField txtIn = new JTextField(10);
		JTextField txtTimeout = new JTextField(10);
		JTextField txtOut = new JTextField(10);
		JTextField txtCourse = new JTextField(10);
		JTextField txtRoom = new JTextField(10);
		JTextField txtSched= new JTextField(10);
		
		
		String remBranch;
		String remLoad;
		String remClass;
		String remSem;
		String remDay;
		String remMonth;
		String remTimein;
		String remIn;
		String remTimeout;
		String remOut;
		String remCourse;
		String remRoom;
		String remSched;


   
	SchedulePortal(){    

   	
			f.add(comboBranch);comboBranch.addItemListener(this);
			f.add(comboLoad);comboLoad.addItemListener(this);
			f.add(comboTClass);comboTClass.addItemListener(this);
			f.add(comboDay);comboDay.addItemListener(this);
			f.add(comboMonth);comboMonth.addItemListener(this);
			f.add(comboTimein);comboTimein.addItemListener(this);
			f.add(comboIn_Unit);comboIn_Unit.addItemListener(this);
			f.add(comboTimeOut);comboTimeOut.addItemListener(this);
			f.add(comboOut_Unit);comboOut_Unit.addItemListener(this);
			
			
			
			f.add(chk10);chk10.addItemListener(this);
			f.add(chk20);chk20.addItemListener(this);
			f.add(chk30);chk30.addItemListener(this);
			
			
			f.add(txtCourse); txtCourse.addActionListener(this);
			f.add(txtRoom); txtRoom.addActionListener(this);
			f.add(txtSched); txtSched.addActionListener(this);
			
			
			
			f.add(btnCompute);btnCompute.addActionListener(this);
			f.add(btnClose);btnClose.addActionListener(this);
			
		
		
			
			f.getContentPane().setBackground(Color.white);
			f.getContentPane().setLayout(new FlowLayout());
			f.setSize(1300, height);
			f.setLocation(screenSize.width/2-f.getSize().width/2, screenSize.height/2-f.getSize().height/2);
			//centered
	       
			back.setBounds(10, 310, 80, 20);
			//back button
			
		label.setText("Branch:");
	       label.setBounds(100, 70, 300, 70);
	       label.setFont(fnt1);
	       
	       
	       label1.setText("Type of Load:");
	       label1.setBounds(450, 70, 300, 70);
	       label1.setFont(fnt1);
	       
	       
	       label3.setText("Type of Class:");
	       label3.setBounds(850, 70, 300, 70);
	       label3.setFont(fnt1);
	       
	       label4.setText("Semester:");
	       label4.setBounds(400, 177, 100, 40);
	       label4.setFont(fnt1);
	   
	       label5.setText("Day:");
	       label5.setBounds(250, 245, 100, 40);
	       label5.setFont(fnt1);
	       
	       label6.setText("Month of :");
	       label6.setBounds(700, 245, 100, 40);
	       label6.setFont(fnt1);
	       
	       label7.setText("Time of Arrival:");
	       label7.setBounds(200, 300, 100, 40);
	       label7.setFont(fnt1);
	       
	       label8.setText("Time of Departure:");
	       label8.setBounds(650, 300, 150, 40);
	       label8.setFont(fnt1);
	       
	       label9.setText("Course Code:");
	       label9.setBounds(250, 400, 100, 40);
	       label9.setFont(fnt1);
	       
	       label10.setText("Room:");
	       label10.setBounds(700, 400, 100, 40);
	       label10.setFont(fnt1);
	       
	       label11.setText("Schedule Name: ");
	       label11.setBounds(400, 500, 200, 40);
	       label11.setFont(fnt1);
	       
	       
	   
	       label2.setText("                             Schedule Portal");
	       label2.setBounds(0, 0, 1300, 70); //start,row,length,size
	       label2.setFont(fnt);
	       label2.setOpaque(true);
	       label2.setBackground(Color.LIGHT_GRAY); 
	       label2.setForeground(Color.white);
		    //   label2
	       
	       
	       comboBranch.setBounds(180,85,200, 40);
	       comboLoad.setBounds(560,85,200, 40);
	       comboTClass.setBounds(960,85,200, 40);
	       comboDay.setBounds(300,245,200, 40);
	       comboMonth.setBounds(800,245,200, 40);
	       comboTimein.setBounds(300,300,200, 40);
	       comboIn_Unit.setBounds(510,300,50, 40);
	       comboTimeOut.setBounds(800,300,200, 40);
	       comboOut_Unit.setBounds(1010,300,50, 40);
	      
	       
	       chk10.setBounds(500,177,100, 40); 
	       chk20.setBounds(640,177,100, 40);
	       chk30.setBounds(770,177,100, 40);
	       
	       txtCourse.setBounds(350, 400, 250, 40);
	       txtRoom.setBounds(770, 400, 250, 40);
	       txtSched.setBounds(550, 500, 250, 40);
	       
	       btnCompute.setBounds(330,600,200, 40); 
	       btnClose.setBounds(750,600,200, 40); 
	       

	       //button_locations
	       
	       f.add(label1);
	       f.add(label);
	       f.add(label3);
	       f.add(label2);
	       f.add(label4);
	       f.add(label5);
	       f.add(label6);
	       f.add(label7);
	       f.add(label8);
	       f.add(label9);
	       f.add(label10);
	       f.add(label11);
	       
	       
	       back.setBounds(600, 650, 80, 20);
	       f.add(back);
	       f.setLayout(null);    
	       f.setVisible(true);    
	       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	       //content
       
       
       
   back.addActionListener(new ActionListener() {
           
           @Override
           public void actionPerformed(ActionEvent y) {
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
               //   if(y.getSource()==back) {f.setVisible(false); new Printer_Test();}           
           }          
         });//back_button   
       
    
       
       }//constructor    
	
	
   public void itemStateChanged(ItemEvent z)
   {
   	int b = comboBranch.getSelectedIndex();
   	if(b==0)
   		remBranch="Paranaque Campus";
   	else if (b==1)
   		remBranch="Quezon Branch";
   	else if (b==2)
   		remBranch="San Juan Campus";
   	else if (b==3)
   		remBranch="Sta Mesa Campus";
   	else
   		remBranch="Taguig Branch";
   	
   	int c = comboLoad.getSelectedIndex();
   	if(c==0)
   		remLoad="Full Time";
   	else
   		remLoad="Part Time";
   	
   	if(z.getSource()==chk10)
   	{
   		if(z.getStateChange()==ItemEvent.SELECTED)
   			remSem="First Semester";
   	}
   	else if(z.getSource()==chk20)
   	{
   		if(z.getStateChange()==ItemEvent.SELECTED)
   			remSem="Second Semester";
   	}
   	else {
   			if(z.getStateChange()==ItemEvent.SELECTED)
   				remSem="Third Semester";
   	}
   
   	
   	
	int e = comboTClass.getSelectedIndex();
   	
   	if (e==0)
   		remClass = "2 Unit";
   	else if (e==1)
   		remClass = "3 Unit";
   	else
   	   	remClass = "4 Unit";
   	
   	int f =comboDay.getSelectedIndex();
   	
   	if (f==0)
   		remDay = "1";
   	else if (f==1)
   		remDay = "2";
   	else if (f==2)
   		remDay = "3";
   	else if (f==3)
   		remDay = "4";
   	else if (f==4)
   		remDay = "5";
   	else if (f==5)
   		remDay = "6";
   	else if (f==6)
   		remDay = "7";
   	else if (f==7)
   		remDay = "8";
   	else if (f==8)
   		remDay = "9";
   	else if (f==9)
   		remDay = "10";
   	else if (f==10)
   		remDay = "11";
   	else if (f==11)
   		remDay = "12";
   	else if (f==12)
   		remDay = "13";
   	else if (f==13)
   		remDay = "14";
   	else if (f==14)
   		remDay = "15";
   	else if (f==15)
   		remDay = "16";
   	else if (f==16)
   		remDay = "17";
   	else if (f==17)
   		remDay = "18";
   	else if (f==18)
   		remDay = "19";
   	else if (f==19)
   		remDay = "20";
   	else if (f==20)
   		remDay = "21";
   	else if (f==21)
   		remDay = "22";
   	else if (f==22)
   		remDay = "23";
   	else if (f==23)
   		remDay = "24";
   	else if (f==24)
   		remDay = "25";
   	else if (f==25)
   		remDay = "26";
   	else if (f==26)
   		remDay = "27";
   	else if (f==27)
   		remDay = "28";
   	else if (f==28)
   		remDay = "29";
   	else if (f==29)
   		remDay = "30";
   	else
   		remDay = "31";
   	
int d = comboMonth.getSelectedIndex();
   	
   	if (d==0)
   		remMonth = "January";
   	else if (d==1)
   		remMonth = "February";
   	else if (d==2)
   		remMonth = "March";
   	else if (d==3)
   		remMonth = "April";
   	else if (d==4)
   		remMonth = "May";
   	else if (d==5)
   		remMonth = "June";
   	else if (d==6)
   		remMonth = "July";
   	else if (d==7)
   		remMonth = "August";
   	else if (d==8)
   		remMonth = "September";
   	else if (d==9)
   		remMonth = "October";
   	else if (d==10)
   		remMonth = "November";
   	else
   		remMonth = "December";
   	
   	
int g = comboTimein.getSelectedIndex();
   	
   	if (g==0)
   		remTimein = "1";
   	else if (g==1)
   		remTimein = "2";
   	else if (g==2)
   		remTimein = "3";
   	else if (g==3)
   		remTimein = "4";
   	else if (g==4)
   		remTimein = "5";
   	else if (g==5)
   		remTimein = "6";
   	else if (g==6)
   		remTimein = "7";
   	else if (g==7)
   		remTimein = "8";
   	else if (g==8)
   		remTimein = "9";
   	else if (g==9)
   		remTimein = "10";
   	else if (g==10)
   		remTimein = "11";
   	else
   		remTimein = "12";
   	
   	
   	int h = comboIn_Unit.getSelectedIndex();
   	
   	if (h==0)
   		remIn = "am";
   	else
   		remIn = "pm";
   	
   	
int i = comboTimeOut.getSelectedIndex();
   	
   	if (i==0)
   		remTimeout = "1";
   	else if (i==1)
   		remTimeout = "2";
   	else if (i==2)
   		remTimeout = "3";
   	else if (i==3)
   		remTimeout = "4";
   	else if (i==4)
   		remTimeout = "5";
   	else if (i==5)
   		remTimeout = "6";
   	else if (i==6)
   		remTimeout = "7";
   	else if (i==7)
   		remTimeout = "8";
   	else if (i==8)
   		remTimeout = "9";
   	else if (i==9)
   		remTimeout = "10";
   	else if (i==10)
   		remTimeout = "11";
   	else
   		remTimeout = "12";
   	
   	
   	int j = comboOut_Unit.getSelectedIndex();
   	
   	if (j==0)
   		remOut = "am";
   	else
   		remOut = "pm";
   	
   	
   	
   	
   
   	
   }
   
   
   public void actionPerformed(ActionEvent c)
   {
   	if(c.getSource()==btnClose)
   		System.exit(0);
   	else
   		
   	txtBranch.setText(remBranch);
   	txtLoad.setText(remLoad);
	txtClass.setText(remClass);
	txtSem.setText(remSem);
	txtDay.setText(remDay);
	txtMonth.setText(remMonth);
	txtTimein.setText(remTimein);
	txtIn.setText(remIn);
	txtTimeout.setText(remTimeout);
	txtOut.setText(remOut);	
	/*File dir = new File("C:\\Users\\User\\Desktop\\dir\\dir1\\dir2);
dir.mkdirs();
File file = new File(dir, "filename.txt");
FileWriter archivo = new FileWriter(file);
archivo.write(String.format("%20s %20s", "column 1", "column 2 \r\n"));
archivo.write(String.format("%20s %20s", "data 1", "data 2"));*/
   	String filename = "test.txt";
   	FileWriter writer;
   	try {
   		writer = new FileWriter(filename);
   		writer.write("+--------------------------------------------------------------+");writer.write("\n");
   		writer.write("|                                    Daily Time Record                                                |");writer.write("\n");
   		writer.write("|                                                                                                              |\n");
   		writer.write("|                                                                                                              |\n");
   		writer.write("|                                             ");txtSched.write(writer);writer.write("                                                     |");writer.write("\n");
   		writer.write("|                        _____________________________________                               |\n");
   		writer.write("|\n");
   		writer.write("|                               branch: ");txtBranch.write(writer);writer.write("\n");writer.write("\n");
   	
   		
   		writer.write("|                            For the Month of: ");txtMonth.write(writer);writer.write(", ");txtDay.write(writer);writer.write(",2021");writer.write("\n");
   	
   	

   		writer.write("|                              Office hours for: ");txtLoad.write(writer);writer.write("\n");
   		writer.write("|                                     Arrival and departure ");writer.write("\n");
   		writer.write("+------------------------------+------------------------------+");writer.write("\n");
   		writer.write("|                              AM                  |                      PM");writer.write("\n");
   		writer.write("+------------------------------+------------------------------+");writer.write("\n");
   		
   		writer.write("|                           ");txtTimein.write(writer);writer.write(" ");
   		
   		txtIn.write(writer);writer.write("                  ");
   		
   		writer.write("                             ");txtTimeout.write(writer);writer.write(" ");
   		
   		txtOut.write(writer);	writer.write("\n");
   		writer.write("+--------------------------------------------------------------+\n");
   		writer.write("|          course:   ");txtCourse.write(writer);writer.write("\n");
 		writer.write("+--------------------------------------------------------------+\n");
   		writer.write("|           room: ");txtRoom.write(writer);writer.write("\n");
   		
 		writer.write("+--------------------------------------------------------------+\n");
   		writer.write("|           class: ");txtClass.write(writer);writer.write("\n");
 		writer.write("+--------------------------------------------------------------+\n");
   		writer.write("|           semester: ");txtSem.write(writer);writer.write("\n");
   		writer.write("+--------------------------------------------------------------+\n\n");
   		writer.write("           I certify on my honor that the above is a true and correct \n");
   		writer.write("           report of the hours of work performed, record of which was \n");
   		writer.write("           made daily at the time of arrival and departure from office.\n\n");

   		writer.write("                                        ");txtSched.write(writer);writer.write("\n");
   		writer.write("                       _____________________________________       \n");
   		writer.write("                   VERIFIED as to the prescribed office hours:\n\n");

writer.write("\n");writer.write("\n");
   		writer.write("                          Assoc. Prof. ZANDRO T. ESTELLA\n");
   		writer.write("                       _____________________________________       \n");
   		writer.write("	                                In Charge \n\n");
   		writer.write("/n");
   	
   		writer.write("	                        (SEE INSTRUCTION ON BACK)");
   		

   		writer.close();
   	} catch (IOException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   	}
   	
   	
   	
   }

   
       public static void main(String[] args) {  
       	  ArrayList<String> listFileContents = new ArrayList<String>();
             
             try {
                 // Get the latest file in folder,  Open the file:
                 FileInputStream fstream = new FileInputStream("test.txt");
                 
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
             } catch (Exception e) {
                 System.err.println("Error: " + e.getMessage());
                 JOptionPane.showMessageDialog(null, e.getMessage(), "File I/O Error", JOptionPane.ERROR_MESSAGE);
             }
             
      printToPrinter(listFileContents);
           new SchedulePortal();    
}//main
       
}//class