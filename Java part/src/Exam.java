import java.util.*;
public class Exam {
    public static void main(String[] args) {

        double [] marks = {19, 28, 45, 49, 12, 32, 18, 41, 49, 30, 17, 44, 42, 45, 14, 30, 39, 36, 29, 24 };
       
        double avg=cal(marks);
        System.out.println("Average marks in the Mathematics class (out of 50 are): "+ avg);
        }
    
    public static double cal(double marks[])
    {
    	 double total = 0;
         double average = 0;
         for (int i = 0; i < marks.length; i++) {
          System.out.println(marks[i] + " ");
         }
         for( int i=0;i<marks.length;i++) {
          total+=marks[i];
         }
         average=total/(marks.length);
         return average;
}
}
