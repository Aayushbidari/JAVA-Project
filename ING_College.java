import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class ING_College
{
    JFrame frame;JMenuBar mb; JPanel Acedimic;JPanel NonAcedimic;JPanel Nav;Font FTA; Font lbl;JLabel welcome;
    ArrayList <Courses> acedemicCourseList;ArrayList <Courses> nonacedimicCourseList;  Courses NAC;
    
    //content of JPanel Nagivation
    JButton acedimic; JButton Non_Acedimic; JButton Exit; JButton Home;
    //content of menu
    JMenu More; JMenuItem Help; JMenuItem Contact;
    //content of JPanel Acedimic 
    JLabel AcedimicCourse;JLabel lblCourseID; JTextField txtCourseID;JLabel lblCourseName;JTextField txtCourseName;JLabel lblDuration;
    JTextField txtDuration;JLabel lblLecturerName;JTextField txtLecturerName;JLabel lblCourseLeader;JTextField txtCourseLeader;
    JLabel lblLevel;JTextField txtLevel;JLabel lblCredit;JTextField txtCerdit;JLabel lblStarting_date;JTextField txtStarting_date;
    JLabel lblCompletion_date; JTextField txtCompletion_date;JLabel lblNumberof_assessments; JTextField txtNumberof_assessments;
    JLabel lblCourseID3; JTextField txtCourseID3;
    //content of JPane nonacedimic
    JLabel NonAcedimicCourse;JLabel lblCourseID1; JTextField txtCourseID1;JLabel lblCourseName1;JTextField txtCourseName1;JLabel lblDuration1;JTextField txtDuration1;
    JLabel lblInstructorName;JTextField txtInstructorName;JLabel lblCourseLeader1;JTextField txtCourseLeader1;JLabel lblExamDate;JTextField txtExamDate;
    JLabel lblprerequisite ; JTextField txtprerequisite ;JLabel lblStart_date;JTextField txtStart_date;JLabel lblCompletion_date1; JTextField txtCompletion_date1;
    JLabel lblCourseID2;JTextField txtCourseID2;
    
    //Buttons used in Acedimic pannel
    JButton ADD;JButton Register;JButton Display;JButton Clear;
    //Buttons used in Non Acedimic pannel
    JButton ADD1;JButton Register1;JButton Display1;JButton Clear1;JButton Remove;
    

    

    
    public ING_College()
    {

        
        
        acedemicCourseList = new ArrayList <Courses>();
        nonacedimicCourseList = new ArrayList <Courses>();
        
        
        
        //....creating frame....//
        frame = new JFrame("Course Registration");
        FTA = new Font("Calibri",Font.PLAIN,40);
        lbl = new Font("Calibri",Font.BOLD,18);
        
        welcome = new JLabel("....Welcome To Course Registion System....");
        welcome.setForeground(Color.white);
        welcome.setBackground(Color.black);
        welcome.setBounds(250,200,750,60);
        welcome.setOpaque(true);
        welcome.setFont(FTA);
        frame.add(welcome);
        
        
        
        //...creating meanu
        mb = new JMenuBar();
        More=new JMenu("More");
        Help=new JMenuItem("Help");    
        Contact=new JMenuItem("Contact");
        More.add(Help);
        More.add(Contact);
        mb.add(More);
        frame.setJMenuBar(mb);
        
        //....creating Jpanel Nagivation....//
        Nav = new JPanel();
        
       //...Home Button of Nav...//
        Home = new JButton("Home");
        Home.setBounds(15,80,170,50);
        Nav.add(Home);
        
        //...acedimic Button of Nav...//
        acedimic = new JButton("Acedimic");
        acedimic.setBounds(15,150,170,50);
        Nav.add(acedimic);
         
        //...Non_Acedimic Button of Nav...//
        Non_Acedimic = new JButton("Non_Acedimic");
        Non_Acedimic.setBounds(15,220,170,50);
        Nav.add(Non_Acedimic);
        
        //...Exit Button of Nav...//
        Exit = new JButton("Exit");
        Exit.setBounds(15,290,170,50);
        Nav.add(Exit);
        
        Nav.setBounds(0,20,200,500);
        Nav.setBackground(Color.gray);
        Nav.setLayout(null);
        frame.add(Nav);
        //........................///
        
        //... creating panel Acedimic
        Acedimic = new JPanel();
        
        //Jlabel Acedimic course//
        AcedimicCourse = new JLabel("Acedimic Course");
        AcedimicCourse.setBounds(300,20,400,40);
        AcedimicCourse.setFont(FTA);
        Acedimic.add(AcedimicCourse);
        //.......................//
        
        //label and textfeild of course ID.
        lblCourseID = new JLabel("CourseID:");
        lblCourseID.setBounds(40,80,120,25);
        lblCourseID.setFont(lbl);
        Acedimic.add(lblCourseID);
        
        txtCourseID = new JTextField();
        txtCourseID.setBounds(150,80,170,25);
        Acedimic.add(txtCourseID);
        //.........................//
        //label and textfeild of course ID.
        lblCourseName = new JLabel("Course Name:");
        lblCourseName.setBounds(450,80,120,25);
        lblCourseName.setFont(lbl);
        Acedimic.add(lblCourseName);
        
        txtCourseName = new JTextField();
        txtCourseName.setBounds(570,80,170,25);
        Acedimic.add(txtCourseName);
        //...................//
        //FOR DURATION
        lblDuration = new JLabel("Duration:");
        lblDuration.setBounds(40,120,120,25);
        lblDuration.setFont(lbl);
        Acedimic.add(lblDuration);
        
        txtDuration = new JTextField();
        txtDuration.setBounds(150,120,170,25);
        Acedimic.add(txtDuration);
        
        
        //...............//
        JLabel lblLevel = new JLabel("Level:");
        lblLevel.setBounds(40,150,100,25);
        lblLevel.setFont(lbl);
        Acedimic.add(lblLevel);
        
        JTextField txtLevel = new JTextField();
        txtLevel.setBounds(150,150,170,25);
        Acedimic.add(txtLevel);         
         
        //..........................//
        
        JLabel lblCredit = new JLabel("Credit:");
        lblCredit.setBounds(460,120,100,25);
        lblCredit.setFont(lbl);
        Acedimic.add(lblCredit);
        
        JTextField txtCerdit = new JTextField();
        txtCerdit.setBounds(570,120,170,25);
        Acedimic.add(txtCerdit);
        //...............//
        //...................//
        JLabel lblNumberof_assessments= new JLabel("Numberof_assessments:");
        lblNumberof_assessments.setBounds(30,180,190,25);
        lblNumberof_assessments.setFont(lbl);
        Acedimic.add(lblNumberof_assessments);
        
        JTextField txtNumberof_assessments = new JTextField();
        txtNumberof_assessments.setBounds(230,180,170,25);
        Acedimic.add(txtNumberof_assessments);
        //...................//

        
        //.ADD BUTTON.//
        
        ADD = new JButton("Add");
        ADD.setBounds(450,190,170,25);
        Acedimic.add(ADD);
        
        
        //....................//
        lblCourseID3 = new JLabel("Course ID:");
        lblCourseID3.setBounds(30,250,120,25);
        lblCourseID3.setFont(lbl);
        Acedimic.add(lblCourseID3);
        
        txtCourseID3 = new JTextField();
        txtCourseID3.setBounds(150,250,170,25);
        Acedimic.add(txtCourseID3);
        //....................//
        
        //..FOR LECTURE NAME........//
        lblLecturerName = new JLabel("Lecturer Name:");
        lblLecturerName.setBounds(30,280,120,25);
        lblLecturerName.setFont(lbl);
        Acedimic.add(lblLecturerName);
        
        txtLecturerName = new JTextField();
        txtLecturerName.setBounds(150,280,170,25);
        Acedimic.add(txtLecturerName);
        
        //..for course leader..//
        
        lblCourseLeader = new JLabel("Course Leader:");
        lblCourseLeader.setBounds(450,250,120,25);
        lblCourseLeader.setFont(lbl);
        Acedimic.add(lblCourseLeader);
        
        txtCourseLeader = new JTextField();
        txtCourseLeader.setBounds(570,250,170,25);
        Acedimic.add(txtCourseLeader);
        
        //..........................//
        


        //..............//
        lblStarting_date = new JLabel("Starting_date:");
        lblStarting_date.setBounds(20,310,120,25);
        lblStarting_date.setFont(lbl);
        Acedimic.add(lblStarting_date);
        
        txtStarting_date = new JTextField();
        txtStarting_date.setBounds(150,310,170,25);
        Acedimic.add(txtStarting_date);
        
        //..................//
        lblCompletion_date = new JLabel("Completion_date:");
        lblCompletion_date.setBounds(430,280,140,25);
        lblCompletion_date.setFont(lbl);
        Acedimic.add(lblCompletion_date);
        
        txtCompletion_date = new JTextField();
        txtCompletion_date.setBounds(570,280,170,25);
        Acedimic.add(txtCompletion_date);
        

        Register = new JButton("Rigester");
        Register.setBounds(550,340,170,25);
        Acedimic.add(Register);
        
        Display = new JButton("Display");
        Display.setBounds(200,400,170,25);
        Acedimic.add(Display);
        
        Clear = new JButton("Clear");
        Clear.setBounds(400,400,170,25);
        Acedimic.add(Clear);
        
        
        
        Acedimic.setBounds(220,50,800,450);
        Acedimic.setBackground(Color.green);
        Acedimic.setLayout(null);
        
        
        //... creating panel NonAcedimic...//
        NonAcedimic = new JPanel();
        
        //Jlabel Acedimic course//
        NonAcedimicCourse = new JLabel("Non Acedimic Course");
        NonAcedimicCourse.setBounds(300,20,400,40);
        NonAcedimicCourse.setFont(FTA);
        NonAcedimic.add(NonAcedimicCourse);
        //.......................//
        
        //label and textfeild of course ID.
        lblCourseID1 = new JLabel("CourseID:");
        lblCourseID1.setBounds(40,80,120,25);
        lblCourseID1.setFont(lbl);
        NonAcedimic.add(lblCourseID1);
        
        txtCourseID1 = new JTextField();
        txtCourseID1.setBounds(150,80,170,25);
        NonAcedimic.add(txtCourseID1);
        //.........................//
        //label and textfeild of course ID.
        lblCourseName1 = new JLabel("Course Name:");
        lblCourseName1.setBounds(450,80,120,25);
        lblCourseName1.setFont(lbl);
        NonAcedimic.add(lblCourseName1);
        
        txtCourseName1 = new JTextField();
        txtCourseName1.setBounds(570,80,170,25);
        NonAcedimic.add(txtCourseName1);
        //...................//
       //FOR DURATION
        lblDuration1 = new JLabel("Duration:");
        lblDuration1.setBounds(40,120,120,25);
        lblDuration1.setFont(lbl);
        NonAcedimic.add(lblDuration1);
        
        txtDuration1 = new JTextField();
        txtDuration1.setBounds(150,120,170,25);
        NonAcedimic.add(txtDuration1);
        
        
        //..........................//
        
        lblprerequisite  = new JLabel("prerequisite ");
        lblprerequisite.setBounds(460,120,100,25);
        lblprerequisite.setFont(lbl);
        NonAcedimic.add(lblprerequisite);
        
        txtprerequisite = new JTextField();
        txtprerequisite.setBounds(570,120,170,25);
        NonAcedimic.add(txtprerequisite); 
        
        //................//
        
        //.ADD BUTTON.//
        
        ADD1 = new JButton("Add");
        ADD1.setBounds(350,160,170,25);
        NonAcedimic.add(ADD1);
        //..................//
        //For Course Leader//
        lblCourseID2= new JLabel("Course ID:");
        lblCourseID2.setBounds(40,200,140,25);
        lblCourseID2.setFont(lbl);
        NonAcedimic.add(lblCourseID2);
        
        txtCourseID2 = new JTextField();
        txtCourseID2.setBounds(150,200,170,25);
        NonAcedimic.add(txtCourseID2);
        //................//
       //For INSTRUCTOR NAME//
        lblInstructorName= new JLabel("Instructor Name:");
        lblInstructorName.setBounds(30,240,140,25);
        lblInstructorName.setFont(lbl);
        NonAcedimic.add(lblInstructorName);
        
        txtInstructorName = new JTextField();
        txtInstructorName.setBounds(160,240,170,25);
        NonAcedimic.add(txtInstructorName);
        //................//
        //For Course Leader//
        lblCourseLeader1= new JLabel("Course Leader:");
        lblCourseLeader1.setBounds(450,200,140,25);
        lblCourseLeader1.setFont(lbl);
        NonAcedimic.add(lblCourseLeader1);
        
        txtCourseLeader1 = new JTextField();
        txtCourseLeader1.setBounds(570,200,170,25);
        NonAcedimic.add(txtCourseLeader1);
        //................//
        
        lblExamDate = new JLabel("Exam Date:");
        lblExamDate.setBounds(450,240,100,25);
        lblExamDate.setFont(lbl);
        NonAcedimic.add(lblExamDate);
        
        txtExamDate = new JTextField();
        txtExamDate.setBounds(570,240,170,25);
        NonAcedimic.add(txtExamDate);         
         

        lblStart_date = new JLabel("Start_date:");
        lblStart_date.setBounds(30,280,140,25);
        lblStart_date.setFont(lbl);
        NonAcedimic.add(lblStart_date);
        
        txtStart_date = new JTextField();
        txtStart_date.setBounds(150,280,170,25);;
        NonAcedimic.add(txtStart_date);
        
        //..................//
        lblCompletion_date1 = new JLabel("Completion_date:");
        lblCompletion_date1.setBounds(430,280,140,25);;
        lblCompletion_date1.setFont(lbl);
        NonAcedimic.add(lblCompletion_date1);
        
        txtCompletion_date1 = new JTextField();
        txtCompletion_date1.setBounds(570,280,170,25);
        NonAcedimic.add(txtCompletion_date1);
        //................//
        
        //.................//
        Register1 = new JButton("Rigester");
        Register1.setBounds(550,340,170,25);
        NonAcedimic.add(Register1);
        
        Display1 = new JButton("Display");
        Display1.setBounds(200,400,170,25);
        NonAcedimic.add(Display1);
        
        Clear1 = new JButton("Clear");
        Clear1.setBounds(400,400,170,25);
        NonAcedimic.add(Clear1); 
        
        Remove = new JButton("Remove");
        Remove.setBounds(100,340,150,25);
        NonAcedimic.add(Remove);
        
        NonAcedimic.setBounds(220,50,800,450);
        NonAcedimic.setBackground(Color.green);
        NonAcedimic.setLayout(null);
        
        
        

        Help.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   JOptionPane.showMessageDialog(frame, "You can register your Acedimic and Nonacedimic Course... For futher query plz contact us.");
                 
                }
            });
            
        Contact.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                   JOptionPane.showMessageDialog(frame, "E-mail = lol12@gmail.com \\\\\\ phone=989878985820");
                    
                }
            });

        
        acedimic.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                  frame.remove(welcome);
                  frame.remove(NonAcedimic);
                  frame.add(Acedimic);
                }
            });
            
        Non_Acedimic.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    frame.remove(welcome);
                    frame.remove(Acedimic);
                    frame.add(NonAcedimic);
                }
                
            });  
        Home.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    frame.remove(Acedimic);
                    frame.remove(NonAcedimic);
                    frame.add(welcome);
                }
                
            });
        Exit.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    frame.dispose();
                }
                
            }); 
            
        
        ///Buttons of Acedimic panel.
        
        ADD.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(txtCourseID.getText().isEmpty() || txtCourseName.getText().isEmpty() ||
                    txtDuration.getText().isEmpty() || txtNumberof_assessments.getText().isEmpty() || txtCerdit.getText().isEmpty() || txtLevel.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "All the feilds are required. ");
                            return;
                    }
                    
                    int NumberOfAssesment;
                    int duration;
                    try{
                          NumberOfAssesment = Integer.parseInt(txtNumberof_assessments.getText());
                          duration = Integer.parseInt(txtDuration.getText());
                    }

                    catch(Exception E)
                    {
                        JOptionPane.showMessageDialog(frame, ".Invalid Input.");
                        return;
                    }
                    String ID = txtCourseID.getText();
                        for (Courses AC : acedemicCourseList)
                        {
                            if (AC.getcourse_ID().equals(ID))
                            {
                               JOptionPane.showMessageDialog(frame,"The ID alredy exist."); 
                               return;
                            }
                        }

                    String name = txtCourseName.getText();
                    String level = txtLevel.getText();
                    String cerdit = txtCerdit.getText();

                    

                    
                        
                    Courses AC = new Academic_Course(name,ID,duration,level,cerdit,NumberOfAssesment);
                    acedemicCourseList.add(AC);
                    
                    if(acedemicCourseList.add(AC)== true)
                    {
                        JOptionPane.showMessageDialog(frame, "Course is added Sucessfully.");
                        
                    }

                }
            });
            
        Register.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                     if(txtCourseID3.getText().isEmpty() || txtCourseLeader.getText().isEmpty() || txtStarting_date.getText().isEmpty() ||
                        txtLecturerName.getText().isEmpty() ||  txtCompletion_date.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "All the feilds are required. ");
                            return;
                    }

                    String ID = txtCourseID3.getText();
                    for(int i = 0; i<acedemicCourseList.size();i++)
                    {
                        if((acedemicCourseList.get(i).getcourse_ID()).equals(ID))
                            {
                                Academic_Course AC = (Academic_Course)(acedemicCourseList.get(i));
                                if(!AC.getisRegistered())
                                {
                                    AC.register(txtLecturerName.getText(),txtStarting_date.getText(),txtCompletion_date.getText(),txtCourseLeader.getText());
                                    JOptionPane.showMessageDialog(frame, ".All the feilds are registerd. ");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(frame, ".Alredy registerd. "); 
                                    return;
                                }
                            }
                        
                        else
                            {
                                JOptionPane.showMessageDialog(frame, "...Invalid Course_ID.....");
                            }

                            
                    }
                    
                    
                }
            });
 
            
        Display.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    
                    
                    for(int i = 0; i < acedemicCourseList.size();i++)
                        {
                        String courseID = acedemicCourseList.get(i).getcourse_ID();
                        String coursename = acedemicCourseList.get(i).getcourse_name();
                        Academic_Course AC = (Academic_Course)(acedemicCourseList.get(i));
                        int duration = AC.getcourse_duration();
                        int Numberof_assessments = AC.getNumberof_assessments();
                        String lecturer_name = AC.getlecturer_name();
                        String StartingDate = AC.getStarting_date();
                        String Completion_date = AC.getCompletion_date();
                        String credits = AC.getcredits();
                        String level = AC.getlevel();
                        
                        String emptyStr = "";
                        
                        //if (AC.getisRegistered())
                        {
                            String display = emptyStr.concat("CourseID: "+courseID + "\n" + "Course Name: "+coursename
                            + "\n" + "Duration: "+duration+"\n" + "Numberof_assessments: "+Numberof_assessments
                            +"\n" + "Lecturer Name: " +lecturer_name +"\n" + "Starting Date: " +StartingDate +
                            "\n" +"Completion Date: " + Completion_date +  "\n" + "credits: " + credits +  "\n" + "level: "+level);
                            
                            
                            JOptionPane.showMessageDialog(frame,display);
                        }
                        //else
                        {
                            JOptionPane.showMessageDialog(frame,"Please register course for more details on course");
                        }
                       
                    }
                    

                    /*
                    if(acedemicCourseList.size()==0)
                    {
                         JOptionPane.showMessageDialog(frame, "The list is empty");
                    }
                    for(int i =0; i<acedemicCourseList.size();i++)
                    {
                        Academic_Course AC = (Academic_Course)(acedemicCourseList.get(i));
                        
                        
                        AC.display();
                    }
                    */
                       
                    

                    

                }
            });

            
        Clear.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txtCourseID.setText("");
                    txtCourseName.setText("");
                    txtDuration.setText("");
                    txtNumberof_assessments.setText("");
                    txtCerdit.setText("");
                    txtLevel.setText("");
                    txtCourseID3.setText("");
                    txtCourseLeader.setText("");
                    txtStarting_date.setText("");
                    txtCompletion_date.setText("");
                    txtLecturerName.setText("");
                }
            });
            
        ///Buttons of Acedimic panel.
        ADD1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(txtCourseID1.getText().isEmpty() || txtCourseName1.getText().isEmpty() ||
                    txtDuration1.getText().isEmpty() || txtprerequisite.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "All the feilds are required. ");
                            return;
                    }
                    int Duration = 0;
                    try{
                     Duration = Integer.parseInt(txtDuration1.getText());
                    }
                    catch(Exception a)
                    {
                        JOptionPane.showMessageDialog(frame, ".Invalid Input."); 
                        return;
                    }
                    String id = txtCourseID1.getText();
                        for (Courses NAC : nonacedimicCourseList)
                        {
                            if (NAC.getcourse_ID().equals(id))
                            {
                               JOptionPane.showMessageDialog(frame,"The ID alredy exist."); 
                               return;
                            }
                        }
                    String Name = txtCourseName1.getText();
                    String Prerequisite =  txtprerequisite.getText();

                    
                        
                    Courses NAC = new Non_Academic_course(Name,id,Duration,Prerequisite);
                    nonacedimicCourseList.add(NAC);
                    if(nonacedimicCourseList.add(NAC)== true)
                    {
                        JOptionPane.showMessageDialog(frame, ".course added.");
                    }

                }
            });

        Register1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(txtCourseID2.getText().isEmpty() || txtCourseLeader1.getText().isEmpty() ||
                    txtInstructorName.getText().isEmpty() || txtExamDate.getText().isEmpty() || txtCompletion_date1.getText().isEmpty() || txtStart_date.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "All the feilds are required. ");
                            return;
                    }
                    String ID = txtCourseID2.getText();
                    for(int i = 0; i<nonacedimicCourseList.size();i++)
                    {
                        if((nonacedimicCourseList.get(i).getcourse_ID()).equals(ID))
                            {
                                Non_Academic_course NAC = (Non_Academic_course)(nonacedimicCourseList.get(i));
                                if(!NAC.getisRegistered())
                                {
                                    NAC.register(txtCourseLeader1.getText(),txtInstructorName.getText(),txtExamDate.getText(),txtStart_date.getText(),txtCompletion_date1.getText());
                                    JOptionPane.showMessageDialog(frame, ".All the feilds are registerd. ");
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(frame, ".Alredy registerd. "); 
                                    return;
                                }

                            }
                        
                        else
                            {
                                JOptionPane.showMessageDialog(frame, "...Invalid Course_ID.....");
                            }

                            
                    }
                    
                }
            });

        Display1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(nonacedimicCourseList.isEmpty())
                    {
                       JOptionPane.showMessageDialog(frame, "...Nothing Added....."); 
                    }

                    for(int i = 0; i < nonacedimicCourseList.size();i++)
                    {
                        String courseID = nonacedimicCourseList.get(i).getcourse_ID();
                        String coursename = nonacedimicCourseList.get(i).getcourse_name();
                        Non_Academic_course NAC = (Non_Academic_course)(nonacedimicCourseList.get(i));
                        int duration = NAC.getcourse_duration();
                         String Prerequisite = NAC.getPrerequisite();
                        String Instructor_name = NAC.getInstructor_name();
                        String StartDate = NAC.getStart_date();
                        String Completion_date = NAC.getcompletion_date();
                        String ExamDate = NAC.getExam_date();
                       
                        
                        String emptyStr = "";
                        
                        //if (NAC.getisRegistered())
                        {
                            String display = emptyStr.concat("CourseID: "+courseID + "\n" + "Course Name: "+coursename
                            + "\n" + "Duration: "+duration+"\n" + "Prerequisite: " +Prerequisite
                            +"\n" + "Instructor Name: " +Instructor_name +"\n" + "Start Date: " +StartDate +
                            "\n" +"Completion Date: " + Completion_date +  "\n" + "Exam Date: " + ExamDate);
                            
                            
                            JOptionPane.showMessageDialog(frame,display);
                        }
                       //else
                       
                        {
                            JOptionPane.showMessageDialog(frame,"Please register course for more details on course");
                        }
                    }
                }
            });


  
            
            Remove.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    if(txtCourseID2.getText().isEmpty())
                    {
                        JOptionPane.showMessageDialog(frame, "please enter the Course ID below ADD button");
                            return;
                    }
                    //String ID = txtCourseID2.getText();
                    for(int i = 0; i<nonacedimicCourseList.size();i++)
                    {
                        if((nonacedimicCourseList.get(i).getcourse_ID()).equals(txtCourseID2.getText()))
                            {
                                Non_Academic_course NAC = (Non_Academic_course)(nonacedimicCourseList.get(i));
                                if(!NAC.getisRemoved())
                                {
                                    NAC.Remove();
                                    JOptionPane.showMessageDialog(frame, ".All the feilds are removed. ");
                                    return;
                                }

                            }
                                
                        
                        
                                                       
                        
                            
                    }
                     JOptionPane.showMessageDialog(frame,"CourseID did not exits, or may have been removed alredy");
                }
                });
        Clear1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    txtCourseID1.setText("");
                    txtCourseName1.setText("");
                    txtDuration1.setText("");
                    txtInstructorName.setText("");
                    txtCourseLeader1.setText("");
                    txtExamDate.setText("");
                    txtprerequisite.setText("");
                    txtStart_date.setText("");
                    txtCompletion_date1.setText("");
                    txtCourseID2.setText("");
                }
            }); 
        
        frame.setLayout(null);
        frame.setSize(1100,600);
        frame.repaint();
        frame.setResizable(false);
        frame.setVisible(true);
        
    }
    
    
    public static void main(String [] args)
    {
        new ING_College();
        
        
    }
}