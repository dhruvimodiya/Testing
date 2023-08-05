/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Dhruvi Modiya
 */
public class ProjectTest {
    
    public ProjectTest() {
    }

    /**
     * Test of main method, of class Project.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
      
    }
    @Test
    public void testAdd(){
        System.out.println("Add");
        Project pt = new Project();
        int result = pt.add(10, 10);
        int expected = 20;
        assertEquals(expected,result);
    }
    @Test
    public void testmul()
    {
        System.out.println("multiply");
        Project pt = new Project();
        int result = pt.multiply(1, 2, 2);
        int expected = 4;
        assertEquals(expected,result);
    }
   @Test
   public void testcheck()
   {
       System.out.println("check");
       String a = "dhruvi";
       String b = "dhruvi modiya";
       Project pt = new Project();
       boolean expResult = false;
       boolean result = pt.comapare(a,b);
       assertEquals(expResult,result);
   }
    
}
