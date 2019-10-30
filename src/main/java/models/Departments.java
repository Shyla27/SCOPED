package models;

 import java.util.Objects;

 public class Departments {
    private String name;
    private String description;
    private int  workers;
    private String email;
    private String website;
    private int id;

    public Departments(String name, String description, Integer workers) {
        this.name = name;
        this.description = description;
        this.workers = workers;
        this.email = email;
        this.website = website;
    }


        public String getName() {
             return name;
        }
        public String getDescription() {
        return description;
        }
        public double getWorkers() {
        return workers;
        }
        public  String getEmail() {
         return email;
    }
        public String getWebsite() {
         return website;
     }
        public int getId() { return id; }

     public void setName(String name) {
         this.name = name;
     }
     public void  setDescription(String description) {
        this.description = description;
     }
    // public void setWorkers(Int workers) {
      //  this.workers = workers;
     //}
     public void setEmail(String email) {
        this.email = email;
     }
     public void setWebsite(String website) {
        this.email = email;
     }
     public void setId(int id) {
         this.id = id;
     }

     @Override
     public boolean equals (Object o) {
        if (this == o)  return  true;
        if (o ==null || getClass() !=o.getClass()) return false;
        Departments that = (Departments) o;
         return workers == that.workers &&
                id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description);
     }
 }

