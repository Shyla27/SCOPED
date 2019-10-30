package dao;



import models.Departments;
import models.News;
import org.junit.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Sql2oDepartmentsDaoTest {

    private static Connection conn;
    private static Sql2oDepartmentsDao departmentDao;
    private static Sql2oNewsDao newsDao;
    private static Sql2oUsersDao usersDao;


    @Rule
    public DatabaseRule database = new DatabaseRule();


    @BeforeClass
    public static void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/organisational_test";
        Sql2o sql2o = new Sql2o(connectionString, "shyla", "740902027");
        departmentDao = new Sql2oDepartmentsDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);
        usersDao = new Sql2oUsersDao(sql2o);
//        conn = sql2o.open();
    }

    @Test
    public void add() {
        Departments testDepartment = setupDepartment();
        int originalDepartmentId = testDepartment.getId();
        departmentDao.add(testDepartment);
        assertNotEquals(originalDepartmentId, testDepartment.getId());

    }
//
//
    @Test
    public void addedDepartmentAreReturnedFromGetAll()  {
        Departments testDepartment = setupDepartment();
        assertEquals(1, departmentDao.getAll().size());
    }

    @Test
    public void noDepartmentReturnsEmptyList() {
        assertEquals(0, departmentDao.getAll().size());
    }
//
    @Test
    public void findByIdReturnsCorrectDepartment()  {
        Departments testDepartment = setupDepartment();
        Departments otherDepartment = setupDepartment();
        assertEquals(testDepartment, departmentDao.findById(testDepartment.getId()));
    }

    @Test
    public void deleteByIdDeletesCorrectDepartments()  {
        Departments testDepartment = setupDepartment();
//        Department otherDepartment = setupDepartment();
        departmentDao.deleteById(testDepartment.getId());
        assertEquals(1, departmentDao.getAll().size());
    }
//
    @Test
    public void clearAll() {
        Departments testDepartment = setupDepartment();
        Departments otherDepartment = setupDepartment();
        departmentDao.clearAll();
        assertEquals(0, departmentDao.getAll().size());
    }
//
    public Departments setupDepartment (){
        Departments department = new Departments("agile","accounting",6);
        departmentDao.add(department);
        return department;
    }

    public Departments setupAltDepartment (){
        Departments department = new Departments("agile", "developer", 12);
        departmentDao.add(department);
        return department;
    }
}