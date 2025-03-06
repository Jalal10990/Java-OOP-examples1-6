import java.lang.reflect.Method;

public class Date {

    private int day;
    private int month;
    private int year;

    // constructor to initialize date 
    // parametrize constractor 

    Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        
    }
    // getter method 
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    // setter method 
public void setDay(int day){
    this.day = day;
}
public void setMonth(int Month){
    this.month = month;
}
public void setYear(int year){
    this.year = year;
}
// / Method to display the date in DD/MM/YYYY format 

public void displayDate(){
    System.out.println(day +"/" +month + "/" + year);
}
    public static void main(String[] args) {
        Date date1 = new Date(04,03,2025);
        Date date2 = new Date(05,03,2025);
System.out.println("Date 1: ");
date1.displayDate(); 
System.out.println("Date 2: ");
date2.displayDate();
    }
}
