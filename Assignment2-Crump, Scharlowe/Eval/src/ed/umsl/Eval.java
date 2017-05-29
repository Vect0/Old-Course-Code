
package ed.umsl;



import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.*;
import javax.swing.*;
import javax.swing.event.*;
import org.apache.derby.jdbc.*;
import sun.jdbc.odbc.JdbcOdbcDriver;


public class Eval extends JFrame implements ActionListener, ItemListener, ChangeListener, FocusListener
{
    //DECLARE THE ELEMENTS OR OBJECTS THAT YOU WILL PUT IN YOUR FRAME
    //NOTICE HOW A PANEL IS CREATED FOR EACH ONE THIS WILL MAKE IT EASIER BUILD
  
    public JLabel teamLabel;
    private JComboBox teamComboBox;
    public JComboBox imagesComboBox;
    private JPanel teamPanel;
    private JPanel buttonPanel;
    private JPanel sliderPanel;
    private JPanel textPanel;
    private JPanel avgPanel;
    private JButton submitButton;
    private JButton clearButton;
    private JButton avgButton;
    private JSlider slider1, slider2, slider3, slider4;
    private JTextArea textArea;
    private JTextArea avgTextArea;
    private JFormattedTextField t;
    private JRadioButton plainButton;
    private JRadioButton boldButton;
    private JRadioButton italicButton;
    private JRadioButton boldItalicButton;
    private JTextField field;
    private Font plainFont, boldFont, italicFont, boldItalicFont;
    private ButtonGroup radioGroup;
   
   //these are fields that will be used to hold the values pulled from the interface
    String teamname;
    String boo = " ";
    int q1;
    int q2;
    int q3;
    int q4;
    String comments;
    double teamavg;
    boolean b=false;
    String m;
   
   
   
    // instance variables used to manipulate database
   private Connection myConnection;
   private Statement myStatement;
   private ResultSet myResultSet;
         
  
 
   //MAIN METHOD: NOTICE WE TAKE IN THE ARGUMENTS THAT ARE
   //PASSED IN AND INSTANTIATE OUR CLASS WITH THEM
    public static void main(String args[])
    {
        // check command-line arguments
      //if ( args.length == 2 )
      //{
         // get command-line arguments
        String databaseDriver = "org.apache.derby.jdbc.ClientDriver";
        //String databaseDriver = "sun.jdbc.odbc.JdbcOdbcDriver";
        String databaseURL = "jdbc:derby://localhost:1527/Eval;create=true";   //change this to alter which db to connect to

         // create new Eval
         Eval eval = new Eval( databaseDriver, databaseURL );
         eval.createUserInterface();
//         eval.updateTeams();
         eval.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
      //}
      //else // invalid command-line arguments
      //{
      //   System.out.println( "Usage: java EVAL needs databaseDriver databaseURL" );
      //}
    }
  
    //CONSTRUCTOR: WE SET UP OUR DATABASE HERE THEN MAKE A CALL
    //TO A FUNCTION CALLED CREATEUSERINTERFACE TO BUILD OUR GUI
    
    public Eval(String databaseDriver, String databaseURL)
    {
        // establish connection to database
      try
      {
         // load Sun driver
         //Class.forName( databaseDriver );
         DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
         // connect to database
//         databaseURL = "jdbc:derby://localhost:1527/Eval;create=true";
         myConnection = DriverManager.getConnection( databaseURL );
         System.out.println("CONNECTED TO DATABASE");

         // create Statement for executing SQL
         myStatement = myConnection.createStatement();
      }
      catch ( SQLException exception )
      {
         exception.printStackTrace();
      }
      //catch ( ClassNotFoundException exception )
     // {
      //   exception.printStackTrace();
      //}
        // set up accountNumberJComboBox
    
      
     // createUserInterface(); // set up GUI
    
    

    
    }
    
  

    private void createUserInterface()
    {
      // get content pane for attaching GUI components
      Container contentPane = getContentPane();
      
      contentPane.setLayout( null );
     
      // INSTRUCTOR COMBO BOX SET UP!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      // set up Instructor Panel
     
      // enable explicit positioning of GUI components
     
      teamPanel = new JPanel();         //                 111111   May need to change each panel to a unique field
      teamPanel.setBounds(40, 20, 276, 48 );
      teamPanel.setBorder( BorderFactory.createEtchedBorder() );
      teamPanel.setLayout( null );
      contentPane.add( teamPanel );

      // set up Instructor Label
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Teams:" );
      teamPanel.add( teamLabel );

      // set up accountNumberJComboBox
      teamComboBox = new JComboBox();
      teamComboBox.setBounds( 150, 15, 96, 25 );
      teamComboBox.addItem( "" );
      teamComboBox.setSelectedIndex( 0 );
      teamPanel.add( teamComboBox );
//      teamComboBox.addActionListener(this);
      
      
     
      sliderPanel = new JPanel();    //                         222222
      sliderPanel.setBounds(40, 90, 276, 75);
      sliderPanel.setBorder( BorderFactory.createEtchedBorder() );
      contentPane.add(sliderPanel);
      
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Q1: Technical:" );
      sliderPanel.add( teamLabel );
      
      slider1 = new JSlider(JSlider.HORIZONTAL,1,8,1);//Q1
      slider1.setMajorTickSpacing(1);  //set to 7 if you just want "1-8"
      slider1.setMinorTickSpacing(1);
      slider1.setPaintTicks(true);
      slider1.setPaintLabels(true);
      sliderPanel.add(slider1);
      slider1.addChangeListener(this);
//      q1 = slider1.getValue();
      
      
      
      sliderPanel = new JPanel();    //                             33333
      sliderPanel.setBounds(40, 165, 276, 75);
      sliderPanel.setBorder( BorderFactory.createEtchedBorder() );
      contentPane.add(sliderPanel);
      
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Q2: Usefulness:" );
      sliderPanel.add( teamLabel );
      
      slider2 = new JSlider(JSlider.HORIZONTAL,1,8,1);//Q2
      slider2.setMajorTickSpacing(1);  //set to 7 if you just want "1-8"
      slider2.setMinorTickSpacing(1);
      slider2.setPaintTicks(true);
      slider2.setPaintLabels(true);
      slider2.getValue();
      sliderPanel.add(slider2);
      slider2.addChangeListener(this);
      
      
      
      sliderPanel = new JPanel();    //                                 4444
      sliderPanel.setBounds(40, 240, 276, 75);
      sliderPanel.setBorder( BorderFactory.createEtchedBorder() );
      contentPane.add(sliderPanel);
      
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Q3: Clarity:  " );
      sliderPanel.add( teamLabel );
      
      slider3 = new JSlider(JSlider.HORIZONTAL,1,8,1);//Q3
      slider3.setMajorTickSpacing(1);  //set to 7 if you just want "1-8"
      slider3.setMinorTickSpacing(1);
      slider3.setPaintTicks(true);
      slider3.setPaintLabels(true);
      slider3.getValue();
      sliderPanel.add(slider3);
      slider3.addChangeListener(this);
      
      
      
      sliderPanel = new JPanel();    //                                 5555
      sliderPanel.setBounds(40, 315, 276, 75);
      sliderPanel.setBorder( BorderFactory.createEtchedBorder() );
      contentPane.add(sliderPanel);
      
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Q4: Overall:" );
      sliderPanel.add( teamLabel );
      
      slider4 = new JSlider(JSlider.HORIZONTAL,1,8,1);//Q4
      slider4.setMajorTickSpacing(1);  //set to 7 if you just want "1-8"
      slider4.setMinorTickSpacing(1);
      slider4.setPaintTicks(true);
      slider4.setPaintLabels(true);
      slider4.getValue();
      sliderPanel.add(slider4);
      slider4.addChangeListener(this);
      
      
      
      textPanel = new JPanel();    //                                   6666
      textPanel.setBounds(40, 390, 276, 75);
      textPanel.setBorder( BorderFactory.createEtchedBorder() );
      contentPane.add(textPanel);
      
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Comments:" );
      textPanel.add( teamLabel );
      
      textArea = new JTextArea( 3,15);
//      textArea.setBounds(10,10,10,10);
      textPanel.add(textArea);
//      textArea.addFocusListener(this);
      
      
      
      avgPanel = new JPanel();    //                                    7777
      avgPanel.setBounds(40, 465, 276, 75);
      avgPanel.setBorder( BorderFactory.createEtchedBorder() );
      contentPane.add(avgPanel);
      
      teamLabel = new JLabel();   
      teamLabel.setBounds( 25, 15, 100, 20 );
      teamLabel.setText( "Average:" );
      avgPanel.add( teamLabel );
      
      
      
      
      avgButton = new JButton("Calc. Avg.");
      avgButton.setBounds(50, 15, 78, 40);
      avgPanel.add(avgButton);
      avgButton.addActionListener(new ActionListener()
      {
          
   @Override
   public void actionPerformed(ActionEvent event)  //happens when submit is clicked
    {
       teamavg = (slider1.getValue()+slider2.getValue()+slider3.getValue()+slider4.getValue())/4;
       System.out.println(teamavg);
       
       
//       int n =5;
//       b=false;
       submitButton.setEnabled(true);
       
       String m = Double.toString(teamavg);
       avgTextArea.setText(m);
       
   
   
   }});
      
//      String m = String.valueOf(teamavg);
      avgTextArea = new JTextArea( 3,6);
      avgPanel.add(avgTextArea);
      avgTextArea.addFocusListener(this);
//      avgTextArea.setText(m);
      
      
      
      
      
      buttonPanel = new JPanel();    //                                  LAST
      buttonPanel.setBounds(40,600, 276, 60);
      buttonPanel.setBorder( BorderFactory.createEtchedBorder() );
      buttonPanel.setLayout(null);
      
      
      
      
      submitButton = new JButton("Submit");   //NEED TO MAKE THIS GREYED OUT, UNTIL CALC. AVG. IS CLICKED
      submitButton.setBounds(50, 15, 78, 40);
      buttonPanel.add(submitButton);
      contentPane.add(buttonPanel); 
      submitButton.setEnabled(false);
      submitButton.addActionListener(new ActionListener()    //INFO FOR FINAL:
      {                                                     //previously said "this"
          
   @Override
   public void actionPerformed(ActionEvent event)  //happens when submit is clicked
    {
       
       teamname = teamComboBox.getSelectedItem().toString();
       comments = textArea.getText();
       q1 = slider1.getValue();
       q2 = slider2.getValue();
       q3 = slider3.getValue();
       q4 = slider4.getValue();
        
//        int level = slider.getValue();
//        
//        JOptionPane.showMessageDialog(slider,
//        "You Pressed ",
//        "Level " + level,
//        JOptionPane.INFORMATION_MESSAGE);
       System.out.println("Q1 is set to: " +q1 + q2 + q3 + q4); 
       

       
       System.out.println(teamavg);
       System.out.println(comments);
       updateTeams();
       
//        JOptionPane.showMessageDialog( null, "You pressed: " + 
//                teamComboBox.getSelectedItem().toString() );
        //Object obj = teamComboBox.g
        //teamname = teamComboBox.getSelectedItem().toString();
        //int x = teamComboBox.getSelectedIndex();
       // q1 = 5;
        //q2 = 3;
        //updateTeams();
        //System.out.println(teamComboBox.getSelectedIndex() + "     " + (String)teamComboBox.getSelectedItem());

    }}); 
      
      
      
      
      
      //teamComboBox.addItemListener(this);
      
      clearButton = new JButton("Clear");
      clearButton.setBounds(160, 15, 78, 40);
      buttonPanel.add(clearButton);
      contentPane.add(buttonPanel);
      clearButton.addActionListener(new ActionListener()
      {
          
   @Override
   public void actionPerformed(ActionEvent event)  //CLEAR BUTTON
    {
      slider1.setValue(1);
      slider2.setValue(1);
      slider3.setValue(1);
      slider4.setValue(1);
      textArea.setText(" ");
      avgTextArea.setText(" ");
      submitButton.setEnabled(false);
   
   }});
      
      
      
      loadTeams();
     
     
      setTitle( "EVAL" );   // set title bar string
      setSize( 375, 750 ); // set window size   width, length
      setVisible( true );  // display window
    }
    
    
    
     

    
  
    private void loadTeams()
    {
         // get all account numbers from database
      try
      {
       
          myResultSet = myStatement.executeQuery( "SELECT DISTINCT TEAMNAME FROM APP.TEAMEVAL order by TEAMNAME asc"); //table named teameval
                //THE SQL STATEMENT
         while ( myResultSet.next() )
         {
               teamComboBox.addItem(myResultSet.getString( "TEAMNAME" ) );
         }

         myResultSet.close(); // close myResultSet
       

      } // end try

      catch ( SQLException exception )
      {
         exception.printStackTrace();
      }
    }
    
//     public void buttonOKClick()    //slider output
//{
// int level = slider.getValue();
// JOptionPane.showMessageDialog(slider,
//  "Remember, this is for posterity.\n"
//   + "Tell me...how do you feel?",
//  "Level " + level,
//  JOptionPane.INFORMATION_MESSAGE);
//}
    
    @Override
    public void focusGained(FocusEvent e)
    {
//        comments = textArea.getText();
//        System.out.println(comments);
    
    };
    
    @Override
    public void focusLost(FocusEvent e)
    {
//        comments = textArea.getText();
//        System.out.println(comments);
        
    };
    
    @Override
    public void stateChanged(ChangeEvent event)
    {
//        q1 = slider1.getValue();
//        q2 = slider2.getValue();
//        q3 = slider3.getValue();
//        q4 = slider4.getValue();
        
        
//        System.out.println(q1);
    
    };
    

   
  
   // @Override
   /* public void itemStateChanged(ItemEvent event)
    {
      
        if ( event.getSource() == rb1 && event.getStateChange() == ItemEvent.SELECTED)
        {
            q1 = Integer.parseInt(rb1.getText());
        }
        else if (event.getSource() == rb2 && event.getStateChange() == ItemEvent.SELECTED)
        {
            q1 = Integer.parseInt(rb2.getText());
        }
        else if (event.getSource() == rb3 && event.getStateChange() == ItemEvent.SELECTED)
        {
           q1 = Integer.parseInt(rb3.getText());
        }
        else if( event.getSource() == rb1 && event.getStateChange() == ItemEvent.DESELECTED)
        {
            JOptionPane.showMessageDialog(null, "Eggs are not supposed to be green.");
        }
    }*/

    private void updateTeams()   //SQL STATEMENT THAT UPDATES DATABASE WITH ALL THE INPUTS
   {
      // update balance in database
      try
      {
      
          
          
          String sql = "UPDATE APP.TEAMEVAL SET Q1 = " + q1 +  ", Q2 = " + q2 
                  +  ", Q3 = "+ q3 + ", Q4 = " + q4 +  ", COMMENT =" + "'" +
                  comments + "'" + ", AVGSCORE = " + teamavg 
//                +  "COMMENTS = " + "'" + comments + "'" 
                  + " WHERE " + "TEAMNAME = " + "'" + teamname + "'";  //TICKMARKS BECAUSE TEAMNAME IS A VARCHAR, Q1 IS  NOT
          
          //String sql2 =  "UPDATE APP.TEAMEVAL" + " SET q2 = " + q2 + " WHERE " +
          //             "TEAMNAME = '" + myteamname + "'" + "and course = '" + courseName + "'";
          
          myStatement.executeUpdate(sql);   //DO 6 updates for each input
          //myStatement.executeUpdate(sql2);
        
      }
      catch ( SQLException exception )
      {
         exception.printStackTrace();
      }
   }

    @Override
   public void itemStateChanged( ItemEvent event )
   {
//        if ( event.getStateChange() == ItemEvent.SELECTED )
//        {
//                int x = teamComboBox.getSelectedIndex();
//        }
   }
   
    @Override
   public void actionPerformed(ActionEvent e){};

//    @Override
//    public void actionPerformed(ActionEvent ae) {
//         //To change body of generated methods, choose Tools | Templates.
//    }


   
   
  

   
}