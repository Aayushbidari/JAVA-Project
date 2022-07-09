public class Non_Academic_course extends Courses
{
    // class Attributes
   String  Instructor_name;
   String Start_date;
   String Completion_date;
   String Exam_date;
   String Prerequisite;
   boolean isRegistered;
   boolean isRemoved;
   public Non_Academic_course(String course_name, String course_ID, int course_duration,String Prerequisite)
   {
       //constructor parameters
       super(course_name,course_ID,course_duration);
       Instructor_name = Instructor_name;
       Prerequisite = Prerequisite;
       this.Start_date = "";
       this.Completion_date = "";
       this.Exam_date = "";
       this.isRegistered = false;
       this.isRemoved = false;
       
    }
    //accessor methords for each attributes
    public String getInstructor_name()
    {
        return Instructor_name;
    }
    public String getStart_date()
    {
        return Start_date;
    }
    public String getExam_date()
    {
        return Exam_date;
    }
    public String getcompletion_date()
    {
        return Completion_date;
    }
    public String getPrerequisite()
    {
        return Prerequisite;
    }
    

    public boolean getisRegistered()
    {
        return isRegistered;
    }
    public boolean getisRemoved()
    {
        return isRemoved;
    }
    
    
    public void setInstructor_name(String Instructor_name)
    {
       if(isRegistered == false) 
       {
            this.Instructor_name = Instructor_name;
        }
        else{
            System.out.println("Instructor Name can't be changed");
        }
    }
    
    public void register(String course_leader, String Instructor_name,String Exam_date,String Start_date,String Completion_date)
    {
        if (isRegistered == false)
        {
            setInstructor_name(Instructor_name);
            isRegistered = true;
            this.Start_date = Start_date;
            this.Exam_date = Exam_date;
            this.Completion_date = Completion_date;
        }
        else{
            System.out.println("the course which you are trying to register is alredy REGISTERD.");
        }
    }
    
    public void Remove()
    {
        if(isRegistered = true)
        {
            System.out.println("course is REMOVED.");
        }
        else{
           super.setcourse_leader("");
           Instructor_name = Instructor_name; 
           Start_date = ""; 
           Exam_date = "";
           Completion_date = "";
           isRegistered = false;
           isRemoved = true;
        }
    }
    
    public void display()
    {
        System.out.println("COURSE ID : " + super.getcourse_ID());
        System.out.println("COURSE NAME : " + super.getcourse_name());
        System.out.println("COURSE DURATION :" + super.getcourse_duration());
        
        if(isRegistered == true)
        {
            System.out.println("Name of Instructor is : " + Instructor_name);
            System.out.println("Starting DATE : " + Start_date);
            System.out.println("Completion DATE : " + Completion_date);
            System.out.println("Exam Date : " + Exam_date);
        }
    }
    
}