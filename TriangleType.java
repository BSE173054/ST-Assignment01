/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletype;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

/**
 *
 * @author Ahsan Jamshaid
			Usama Yasin
			Jerrold Sigamony
 */
public class TriangleTypeIT {
    
    public TriangleTypeIT() {
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
     * Test of Detect method, of class TriangleType.
     */
    @Test
    public void testDetect() throws FileNotFoundException,IOException{
      /*--------------------Input from file--------------------*/
       File file = new File("result.txt");
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
        int []arr1={0,1,2,50,99,100,101};
        int []arr2={0,1,2,50,99,100,101};
        int []arr3={0,1,2,50,99,100,101};
        int count = 0;
        String []actual = new String[344];
        String []expected =  content.split(" ");//expected result
        expected[343] = null;
        TriangleType tt = new TriangleType();
        /**Loops iterating sides**/
        for (int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                for (int k=0;k<arr3.length;k++){
                    int a = arr1[i], b = arr2[j], c = arr3[k];
                    actual[count++] = tt.Detect(a, b, c);
                }
            }
        }
        assertArrayEquals(expected,actual);//checking array
    }
    
}
