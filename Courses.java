 
public class Courses      //developing class Courses
{
    private String course_name;     //attribute course name
    private String course_ID;       //attribute course ID
    private String course_leader;   //attribute course leader
    private int course_duration;   //attribute course duration

    public Courses (String course_name, String course_ID, int course_duration) // developing constructor
    {
        this.course_name = course_name;
        this.course_ID = course_ID;
        this.course_duration = course_duration;
        this.course_leader =""; // constructor paramaters
    }
    
    public String getcourse_ID()
    {
        return this.course_ID;
    }//this method gets course id and return to the constructor.

    public String getcourse_name()
    {
        return this.course_name;
    }//this method gets course name and return to the constructor.
   
    public int getcourse_duration()
    {
        return this.course_duration;
    }//this method gets course duration and return to the constructor.
    
    public void setcourse_leader(String course_leader)
    {
        this.course_leader = course_leader;
    }//this methord will set the courseLeader to a new name by accepting the new name of the course leader as a parameter.

    
    public void display()
    {
        System.out.println("Course ID :" + course_ID);
        System.out.println("Course NAME :" + course_name);
        System.out.println("course DURATION :" + course_duration);  //suitably annotated values will be displayed
        
        if (course_leader != "")//if course leader is not empty it will display name of course leader.
        {
            System.out.print("course LEADER" + course_leader);
        }
    }
}
    

