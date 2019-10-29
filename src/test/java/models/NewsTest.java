package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

 public class NewsTest {

     private News setupnews() {
     // method
         return null;
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