//Acedimic_course is sub class of Courses
public class Academic_Course extends Courses //developing sub class Courses
{
    private String lecturer_name;      
    private String level;
    private String Starting_date;
    private String credits;
    private String Completion_date;
    private int Numberof_assessments;
    private boolean isRegistered;    // attribute of class Academic_Course 
    
    public Academic_Course(String course_name, String course_ID, int course_duration, String level,String credits,int Numberof_assessments )
    {
        super(course_name,course_ID,course_duration); //calling super class Course
        lecturer_name = "";
        this.level = level;
        this.Numberof_assessments = Numberof_assessments;
        this.credits = credits;
        Starting_date = "";
        Completion_date = "";
        isRegistered = false;     // constructor parameters
        
    }
    
    public String getlecturer_name()
    {
        return lecturer_name;
    }//this method gets name of lecturer and return to the constructor.
    
    public String getlevel()
    {
        return level;
    }//this method gets level and return to the constructor.
    
    public String getStarting_date()
    {
        return Starting_date;
    }//this method gets starting date and return to the constructor.
    
    public String getcredits()
    {
        return credits;
    }//this method gets credits and return to the constructor.
    
    public int getNumberof_assessments()
    {
        return Numberof_assessments;
    }//this methord gets total number of assessments and return to the constructor.
    
    
    public boolean getisRegistered()
    {
        return isRegistered ;
    }//this methord gets value in boolean either true and flase and return to the constructor.
    
    public String getCompletion_date()
    {
        return Completion_date;
    }//this methord gets date of Completion and return to the constructor.
    
    public void setlecturer_name(String lecturer_name)
    {
        this.lecturer_name = lecturer_name;
    }//The method accepts a new lecturer name as a parameter and assigns the new value to the lecturer name.

    public void setNumberof_assessments(int Numberof_assessments)
    {
        this.Numberof_assessments = Numberof_assessments;
    }//The method accepts a new number of assessments as a parameter and assigns the new value to the number of assessments attribute.

    public void register(String lecturer_name,String Starting_date, String Completion_date, String course_leader)
    {  
        if (isRegistered == true)
        {
            System.out.println("Acedimic course is alredy registerd");
            System.out.println("Name of lecturer is :" + lecturer_name);
            System.out.println("Your course starts from :" + Starting_date);
            System.out.println("you will complete your course on :" + Completion_date);
        }
        else
        {
            super.setcourse_leader(course_leader); 
            this.lecturer_name = lecturer_name;
            this.Starting_date = Starting_date;
            this.Completion_date = Completion_date;
            isRegistered = true;
        }
        
    }
    
    
    public void display()
    {
        super.display();
        if(isRegistered == true) 
        {
            System.out.println("Name of lecturer : "+ lecturer_name);
            System.out.println(" your level is : " + level);
            System.out.println("your cradits is:" + credits);
            System.out.println("Starts on :" + Starting_date);
            System.out.println("ends on :" + Completion_date);
            System.out.println("number of assessments :" + Numberof_assessments);
        }
        
    }
}
