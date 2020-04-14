/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextday;

import java.io.File;
import java.io.FileInputStream;
import static nextday.NextDay.addOneDayCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahsan Jamshaid
 * 		   Usama Yasin
 * 		   Jerrold Sigamony
 */
public class NextDayIT {
    
    public NextDayIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of addOneDayCalendar method, of class NextDay.
     */
    @Test
    public void testAddOneDayCalendar() throws Exception {
        /*--------------------Input from file--------------------*/
        File file = new File("expected.txt");
       FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[10];
        StringBuilder sb = new StringBuilder();
        while (fis.read(buffer) != -1) {
                sb.append(new String(buffer));
                buffer = new byte[10];
        }
        fis.close();
        String content = sb.toString();
        /*--------------------Input from file--------------------*/
        String []year = {"1999", "2000","2001","2010","2019","2020","2021"};
        String []month = {"00","01","02","06","11","12","13"};
        String []day = {"00","01","02","16","30","31","32"};
        String []actual = new String[344];
        int count=0;
        String []expected = content.split(" ");
        String date=new String();
        //input into the function
         for(int i=0;i<year.length;i++)
        {
            for(int j=0;j<month.length;j++)
            {
                for(int k=0;k<day.length;k++)
                {
                    date = year[i]+"-"+month[j]+"-"+day[k]; 
                    actual[count++] = addOneDayCalendar(date);
                }
            }
        }
         Assert.assertArrayEquals(expected, actual);
    }
    
}
