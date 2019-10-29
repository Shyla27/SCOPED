package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsTest {

    @Test
    public void getNameReturnsCorrectName() {
        Departments testDepartments = setupDepartments();
        assertEquals("agile", testDepartments.getName());
    }

    private Departments setupDepartments() {

        return null;
    }
    @Test
    public void getDescriptionReturnsCorrectDescription()  {
        Departments testDepartments = setupDepartments();
        assertEquals("Accounting" , testDepartments.getDescription());
    }
    @Test
    public void getWebsiteReturnsWebsite() {
        Departments testDepartments =setupDepartments();
        assertEquals("" , testDepartments.getWebsite());
    }
    @Test
    public void getEmailReturnEmail() {
        Departments testDepartments =setupDepartments();
        assertEquals("steak@steakhouse.com", testDepartments.getEmail());
    }
    @Test
    public void setEmailSetsCorrectEmail()  {
        Departments testDepartments = setupDepartments();
        testDepartments.setEmail("steak@steakhouse.com");
        assertNotEquals("hellofishy@fishwitch.com", testDepartments.getEmail());
    }
    @Test
    public void setEmailSetsCorrectWebsite()  {
        Departments testDepartments = setupDepartments();
        testDepartments.setWebsite("steak@steakhouse.com");
        assertNotEquals("hellofishy@fishwitch.com", testDepartments.getWebsite());
    }
    @Test
    public void getDescriptionReturnsCorrectWorkers() {
        Departments testDepartments = setupDepartments();
        assertEquals(6  , testDepartments.getWorkers());
    }
}