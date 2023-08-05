/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project;

/**
 *
 * @author Dhruvi Modiya
 */
public class Project {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    int add (int a , int b)
    {
        return a + b;
    }
    
    int multiply (int a, int b, int c)
    {
        return a * b * c;
    }
    
    public boolean comapare(String a ,String b)
    {
        boolean f = false;
        int aname = a.length();
        int bname = b.length();
        if(a.equals(b))
        {
            f = true;
        }
        return f;
    }
}
