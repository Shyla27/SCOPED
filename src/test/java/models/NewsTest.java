package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

 public class NewsTest {
     @Test
     public void getNameReturnsCorrectName() {
         News testNews = setupnews();
         assertEquals("agile", testNews.getName());
     }

     private News setupnews() {
     // method
         return null;
     }

     @Test
     public  void setName() {
      News  testNews = setupnews();
         assertNotEquals("mary", testNews.getName());
     }

     @Test
     public void getContentReturnCorrectContent() {
         News testNews = setupnews();
         assertEquals("bugubaga", testNews.getContent());
     }
     @Test
     public void  getAuthorReturnCorrectAuthor() {
         News testNews = setupnews();
         assertEquals("mikey", testNews.getAuthor());
     }
 }