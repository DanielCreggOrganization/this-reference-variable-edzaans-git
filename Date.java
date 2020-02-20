/**
 * Date
 */
public class Date {
    
    // Instance Variables
    int day;
    int month;
    int year;

    String event;

    // Default Constructor (No Parameters)
    public Date(){
        //Your code here
        //default values = 0, can be changed if needed
        day = 1;
        month = 1;
        year = 1;
        event = "Nothing on today";
        
    }

    // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year){
        
     this(day, month);
      this.year = year;
    }
    
    // Parameterized constructor (2 Parameters)
    public Date(int day, int month){
        // Your code here.
      this(day);
      this.month = month;
    }
    // Your code here.
    
    // Parameterized constructor (1 Parameter)
       public Date(int day){
        // Your code here.
       this.day = day;
       //year = 2000;
    // Your code here.
       }
       
           // Parameterized constructor (3 Parameters)
    public Date(int day, int month, int year, String event){
        this(day, month, year);
        this.event = event;
     
    }

    // A simple print method
    public void printDate(){

        System.out.println(this.day+ "/" +this.month+ "/" +this.year);
        // Print the date like this: day/month/year
        // Your code here
    }

}
