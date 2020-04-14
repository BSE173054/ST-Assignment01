/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangletype;
import java.util.Scanner;
import java.io.*;
/**
 *
 * 
 */
public class TriangleType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        
        TriangleType t = new TriangleType();
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter length of first side : ");
        a = sc.nextInt();
        System.out.println("please Enter length of second side : ");
        b = sc.nextInt();
        System.out.println("please Enter length of third side : ");
        c = sc.nextInt();
        String result = t.Detect(a, b, c);
        System.out.println("result : "+result);
         
    }
    String Detect(int a, int b, int c)
    {
        int sideA = a;
        int sideB = b;
        int sideC = c;
        if (a <= 0 || b <= 0 || c <= 0) 
            return "INVALID"; // added test
        if (a == b && b == c) 
            return "EQUILATERAL";
        if (a >= b+c || c >= b+a || b >= a+c) 
            return "INVALID";
        if (b==c || a==b || c==a) 
        return "ISOSCELES";
    return "SCALENE";
    }
}
