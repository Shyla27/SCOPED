package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

 public class NewsTest {
     @Test
     public void getNameReturnsCorrectName() {
         Departments testDepartments = setupDepartments();
         assertEquals("agile", testDepartments.getName());
     }
     @Test
     public void getContentReturnCorrectContent() {
         Departments testDepartments = setupDepartments();
         assertEquals("bugubaga", testDepartments.getContent());
     }
     @Test
     public void  getAuthorReturnCorrectAuthor() {
         Departments testDepartments = setupDepartments();
         assertEquals("mikey", testDepartments.getAuthor());
     }
 }