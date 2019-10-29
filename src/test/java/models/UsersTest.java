package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void getNameReturnsCorrectName() {
        Users testUsers = setupusers();
        assertEquals("agile", testUsers.getName());
    }
    @Test
    public  void setName() {
        Users testUsers = setupusers();
        assertNotEquals("mary", testUsers.getName());
    }

    @Test
    public void getRoleReturnsRole() {
        Users testUsers= setupusers();
        assertEquals("coding", testUsers.getRole());
    }

    @Test
    public void setRole() {
        Users testUsers= setupusers();
        testUsers.setRole("coding");
        assertNotEquals("office work", testUsers.getRole());
    }
     public void getPositionReturnsPosition() {
        Users testUSers = setupusers();
        assertEquals("developer", testUSers.getPosition());
     }


    public void setPosition() {
        Users testUsers = setupusers();
        testUsers.setPosition( "developer");
        assertNotEquals("accountant" , testUsers.getPosition());


    }

    @Test
    public void getIdReturnsId() {
    }

    @Test
    public void setId() {
    }

    public  Users setupusers(){
        return new Users("agile","coding","developer",1);
    }



}