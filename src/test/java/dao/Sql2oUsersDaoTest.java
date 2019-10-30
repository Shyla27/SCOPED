package dao;


import models.Departments;
import models.Users;
import org.junit.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oUsersDaoTest {
    private static Connection conn;
    private static Sql2oUsersDao usersDao;
    private static Sql2oDepartmentsDao departmentDao;
    private static Sql2oNewsDao newsDao;


    @BeforeClass
    public static void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/organisational_test";
        Sql2o sql2o = new Sql2o(connectionString, "shyla", "740902027");
        departmentDao = new Sql2oDepartmentsDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);
        usersDao = new Sql2oUsersDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown()  {
        departmentDao.clearAll();
        usersDao.clearAll();
        newsDao.clearAll();
        System.out.println("clearing database");
    }
    @AfterClass
    public static void shutDown() throws Exception{ //changed to static
        conn.close();
        System.out.println("connection closed");
    }
    @Test
    public void addingUsersSetsId() throws Exception {
        Users testUser = setupNewUsers();
        int originalUsersId = testUser.getId();
        usersDao.add(testUser);

        assertEquals(originalUsersId,testUser.getId());
    }
//    @Test
//    public void clearAll() throws Exception {
//        Users testUsers = setupUsers();
//        Users otherUsers = setupUsers();
//        usersDao.clearAll();
//        assertEquals(0, usersDao.getAll().size());
//    }

    //helper
    public Users setupNewUsers() {
        return new Users("Agile", "coding", "senior", 2);

    }

    public Users setupUsers() {
        Users users =new Users("Agile", "coding", "senior", 2);
        usersDao.add(users);
        return users;
    }

    public Users setupUsersForDepartment(Departments department) {
        Users users =new Users("Agile", "coding", "senior" , department.getId());
        usersDao.add(users);
        return users;
    }

    public Departments setupDepartment() {
        Departments department = new Departments("agile", "developer", 1);
        departmentDao.add(department);
        return department;
    }

}