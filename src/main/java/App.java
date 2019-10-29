
import com.google.gson.Gson;
import dao.Sql2oUsersDao;
import dao.Sql2oDepartmentsDao;
import models.Departments;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.*;

public class App {
    public  static void main(String[] args) {
        Sql2oUsersDao usersDao;
        Sql2oDepartmentsDao departmentsDao;
        Sql2oNewsDao newsDao;
         Connection conn;
         Gson gson = new Gson();

    }
}
