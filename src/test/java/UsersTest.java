package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsersTest {

    @Test
    public void getNameReturnsCorrectName() {
        Departments testDepartments = setupDepartments();
        assertEquals("agile", testDepartments.getName());
    }






}