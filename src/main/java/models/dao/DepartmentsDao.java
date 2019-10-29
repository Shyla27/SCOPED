package models.dao;

import models.Departments;

import java.util.List;

public interface DepartmentsDao {
     // create
    void add (Departments departments);

    //read
    List<Departments> getAll();
    Departments findById(int id);

    // update
    void update (int id, String name, String description,int workers,String website, String email );

        void deleteById(int id);
         void clearAll();


}