package models.dao;
import models.News;
import java.util.List;


public  interface NewsDao {
    // create
    void add (News news);

    //read
    List<News> getAll();
    List<News> getAllNewsByDepartments(int departmentid);


    void deleteById(int id);
    void clearAll();
}
