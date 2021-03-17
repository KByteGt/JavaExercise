import java.time.LocalDateTime;
import java.util.*;

public class Test {
    LocalDateTime date = LocalDateTime.now();

    public static void main(String[] args){
        System.out.println("Java Week 1");

        Test test = new Test();

        System.out.println(" | Test No2:");
        System.out.println(test.getSecondsLeft());
        System.out.println("\n | Test No3:");
        System.out.println(test.getPercentOfDay());
        System.out.println("\n | Test No4:");
        System.out.println("The Hypotenuse is: "+test.getHypotenuse(3,5));
    }

    public String getSecondsLeft(){
        long seconds = 0;

        
        seconds = date.toLocalTime().toSecondOfDay();

        return " > Seconds lefto to end the day are: " + seconds;
    }

    public String getPercentOfDay(){

        int percent = 100 - ((date.getHour() +1) * 24)/100;

        return " > Percent of the they that had pased is: " + percent + "%";
    }

    public double getHypotenuse(int a, int b){
        return Math.sqrt( a*a+b*b);
    }
}

