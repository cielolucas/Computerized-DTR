package dtr;
import javax.swing.*;

import javax.swing.table.*;
import java.awt.*;

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calendar{
	static JLabel label2 = new JLabel(); 
    static Font fnt = new Font("Arial",Font.BOLD,40);
	static JLabel lblMonth, lblYear;
	static JButton btnPrev, btnNext;
	static JTable tblCalendar;
	static JComboBox<String> cmbYear;
	static JFrame frmMain;
	static Container pane;
	static DefaultTableModel mtblCalendar; //Table model
	static JScrollPane stblCalendar; //The scrollpane
	static JPanel pnlCalendar;
	static int realYear, realMonth, realDay, currentYear, currentMonth;

	calendar(){
		
		
		//Look and feel
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		catch (ClassNotFoundException e) {}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
		catch (UnsupportedLookAndFeelException e) {}

		//Prepare frame
		frmMain = new JFrame ("Calendar"); //Create frame
		frmMain.setSize(1280, 800); //Set size to 400x400 pixels
		//pnlCalendar.setSize(800, 400);
		pane = frmMain.getContentPane(); //Get content pane
		pane.setLayout(null); //Apply null layout
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close when X is clicked
		
		Font fnt = new Font("Times New Roman",Font.BOLD,40);
	   	Font fnt2 = new Font("Times New Roman",Font.BOLD,60);
	   	Font fnt1 = new Font("Arial",Font.PLAIN,15);
	   	Font fnt3 = new Font("Arial",Font.PLAIN,40);

		//Create controls
		lblMonth = new JLabel ("January");
		lblYear = new JLabel ("Year:");
		cmbYear = new JComboBox<String>();
		btnPrev = new JButton ("<<");
		btnNext = new JButton (">>");
		mtblCalendar = new DefaultTableModel(){
			
			private static final long serialVersionUID = 1L;

		public boolean isCellEditable(int rowIndex, int mColIndex){return false;}};
		tblCalendar = new JTable(mtblCalendar);
		stblCalendar = new JScrollPane(tblCalendar);
		pnlCalendar = new JPanel(null);

		//Set border
		//pnlCalendar.setBorder(BorderFactory.createTitledBorder("Calendar"));
		frmMain.getContentPane().setBackground(Color.white);
		//pnlCalendar.setBackground(Color.white);
		//Register action listeners
		btnPrev.addActionListener(new btnPrev_Action());
		btnNext.addActionListener(new btnNext_Action());
		cmbYear.addActionListener(new cmbYear_Action());
		
		//Add controls to pane
		pane.add(pnlCalendar);
		pnlCalendar.add(lblMonth);
		pnlCalendar.add(lblYear);
		pnlCalendar.add(cmbYear);
		pnlCalendar.add(btnPrev);
		pnlCalendar.add(btnNext);
		pnlCalendar.add(stblCalendar);
		
		JPanel panel=new JPanel(); 
	 	   
	 	   JPanel panel6=new JPanel();
	 	   //JPanel panel7=new JPanel();
	 	   JPanel panel8=new JPanel();
	 	   JPanel panel9=new JPanel();
	 	   JPanel panel10=new JPanel();
	 	   JPanel panel11=new JPanel();
	 	   JPanel panel12=new JPanel();
		
	 	  
		   JButton logout = new JButton();
		   JButton about = new JButton();
		   JButton schedportal = new JButton();
		   JButton help = new JButton();
		   JButton contact = new JButton();

       	frmMain.add(panel6);
       	frmMain.add(panel8);
       	frmMain.add(panel9);
       	frmMain.add(panel10);
       	frmMain.add(panel11);
       	frmMain.add(panel12);

		logout = new JButton("Logout");
 		logout.setBackground(new Color(100,120,153));
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
 		help.setBounds(0,0,100,70);
 		panel9.setLayout(null);
 		panel9.setBounds(945,0,120,70);
 		panel9.setBackground(Color.white);
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
    	 
    	frmMain.getContentPane().setBackground(Color.white);
	     
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
		
		//label2
		label2.setText("                                                CALENDAR");
	    label2.setBounds(0, 70, 1300, 70); //start,row,length,size
	    label2.setFont(fnt3);
	    label2.setOpaque(true);
	    label2.setBackground(new Color(128,0,128)); 
	    label2.setForeground(Color.white);
	    frmMain.add(label2);
		//Set bounds
		pnlCalendar.setBounds(60, 140, 1150, 550);
	//	lblMonth.setBounds(100-lblMonth.getPreferredSize().width/2, 50, 100, 50);
		lblYear.setBounds(955, 470, 90, 20);
		cmbYear.setBounds(1000, 470, 90, 20);
		btnPrev.setBounds(320, 30, 50, 25);
		btnNext.setBounds(800, 30, 50, 25);
		stblCalendar.setBounds(50, 80, 1050, 380);
		 schedportal.addActionListener(new ActionListener() {
	          	@Override
	          	public void actionPerformed(ActionEvent ae) 
	          	{pnlCalendar.setVisible(false); new Mainscreen();}
	  				});
	   	  about.addActionListener(new ActionListener() {
	           	@Override
	           	public void actionPerformed(ActionEvent ae)
	           	{pnlCalendar.setVisible(false); new about();}
	           	});
	   	 
	   	   logout.addActionListener(new ActionListener() {
	              
	          	  @Override
	                public void actionPerformed(ActionEvent ae) 
	                {pnlCalendar.setVisible(false); new login();}
	                    }); 
	       help.addActionListener(new ActionListener() {
	           
	       	  @Override
	             public void actionPerformed(ActionEvent ae) 
	             {pnlCalendar.setVisible(false); new help();}
	                 });  
		//Make frame visible
		frmMain.setResizable(false);
		frmMain.setVisible(true);
		frmMain.setResizable(false);
		//Get real month/year
		GregorianCalendar cal = new GregorianCalendar(); //Create calendar
		realDay = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
		realMonth = cal.get(GregorianCalendar.MONTH); //Get month
		realYear = cal.get(GregorianCalendar.YEAR); //Get year
		currentMonth = realMonth; //Match month and year
		currentYear = realYear;
		
		//Add headers
		String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
		for (int i=0; i<7; i++){
			mtblCalendar.addColumn(headers[i]);//header
		}
		
		tblCalendar.getParent().setBackground(tblCalendar.getBackground()); //Set background

		//No resize/reorder
		tblCalendar.getTableHeader().setResizingAllowed(false);
		tblCalendar.getTableHeader().setReorderingAllowed(false);

		//Single cell selection
		tblCalendar.setColumnSelectionAllowed(true);
		tblCalendar.setRowSelectionAllowed(true);
		tblCalendar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		//Set row/column count
		tblCalendar.setRowHeight(60);
		mtblCalendar.setColumnCount(7);
		mtblCalendar.setRowCount(6);
		//Set row/column count
		
		
		
		//Populate table
		for (int i=realYear-100; i<=realYear+100; i++){
			cmbYear.addItem(String.valueOf(i));
		}
		
		//Refresh calendar
		refreshCalendar (realMonth, realYear); //Refresh calendar
	}
	public static void main (String args[]){
		new calendar();  
	}
	
	public static void refreshCalendar(int month, int year){
		//Variables
		String[] months =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int nod, som; //Number Of Days, Start Of Month
			
		//Allow/disallow buttons
		btnPrev.setEnabled(true);
		btnNext.setEnabled(true);
		if (month == 0 && year <= realYear-10){btnPrev.setEnabled(false);} //Too early
		if (month == 11 && year >= realYear+100){btnNext.setEnabled(false);} //Too late
		lblMonth.setText(months[month]); //Refresh the month label (at the top)
	//	lblMonth.setBounds(500-lblMonth.getPreferredSize().width/2, 30, 180, 50); //Re-align label with calendar
		lblMonth.setFont(fnt);
		lblMonth.setBounds(580-lblMonth.getPreferredSize().width/2, 6, 300, 80); //Re-align label with calendar
		cmbYear.setSelectedItem(String.valueOf(year)); //Select the correct year in the combo box
		
		//Clear table
		for (int i=0; i<6; i++){
			for (int j=0; j<7; j++){
				mtblCalendar.setValueAt(null, i, j);
			}
		}
		
		//Get first day of month and number of days
		GregorianCalendar cal = new GregorianCalendar(year, month, 1);
		nod = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		som = cal.get(GregorianCalendar.DAY_OF_WEEK);
		
		//Draw calendar
		for (int i=1; i<=nod; i++){
			int row = (i+som-2)/7;
			int column  =  (i+som-2)%7;
			mtblCalendar.setValueAt(i, row, column);
		}

		//Apply renderers
		tblCalendar.setDefaultRenderer(tblCalendar.getColumnClass(0), new tblCalendarRenderer());
	}

	static class tblCalendarRenderer extends DefaultTableCellRenderer{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent (JTable table, Object value, boolean selected, boolean focused, int row, int column){
			super.getTableCellRendererComponent(table, value, selected, focused, row, column);
			if (column == 0 || column == 6){ //Week-end
				setBackground(new Color(255, 255, 255));
			}
			else{ //Week
				setBackground(new Color(255, 255, 255));
			}
			if (value != null){
				if (Integer.parseInt(value.toString()) == realDay && currentMonth == realMonth && currentYear == realYear){ //Today
					setBackground(new Color(225, 220, 255));
				}
			}
			setBorder(null);
			setForeground(Color.black);
			return this;  
		}
	}

	static class btnPrev_Action implements ActionListener{
		public void actionPerformed (ActionEvent e){
			if (currentMonth == 0){ //Back one year
				currentMonth = 11;
				currentYear -= 1;
			}
			else{ //Back one month
				currentMonth -= 1;
			}
			refreshCalendar(currentMonth, currentYear);
		}
	}
	static class btnNext_Action implements ActionListener{
		public void actionPerformed (ActionEvent e){
			if (currentMonth == 11){ //Foward one year
				currentMonth = 0;
				currentYear += 1;
			}
			else{ //Foward one month
				currentMonth += 1;
			}
			refreshCalendar(currentMonth, currentYear);
		}
	}
	static class cmbYear_Action implements ActionListener{
		public void actionPerformed (ActionEvent e){
			if (cmbYear.getSelectedItem() != null){
				String b = cmbYear.getSelectedItem().toString();
				currentYear = Integer.parseInt(b);
				refreshCalendar(currentMonth, currentYear);
			}
		}
	}
	
}