/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * 
 */
public class NextDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        String date;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date in \" yyyy-mm-dd \" format : ");
        date = sc.next();
     System.out.println("Incremented Date : "+addOneDayCalendar(date));
    }
    public static String addOneDayCalendar(String date) throws ParseException
  {
  
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar c = Calendar.getInstance();
    c.setTime(sdf.parse(date));
    c.add(Calendar.DATE, 1);
    return sdf.format(c.getTime());
}
}
