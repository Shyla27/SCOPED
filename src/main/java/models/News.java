package  models;

import java.util.Objects;

 public  class News {
  private String content;
  private  String author;
  private  int id;
  private  int departmentId;
     private Object news;

     public News ( String content, String author , int departmentId ) {
    this.content = content;
    this.author = author;
    this.departmentId = departmentId;

  }

  public String getAuthor() { return author;}

  public String getContent() { return content;}
  public int getDepartmentId() { return departmentId; }
  public int getId() { return  id; }

    public void setDepartmentId( int departmentId) { this.departmentId= departmentId ;}
  public void  setAuthor(String author) { this.author = author; }
  public void setContent(String content) { this.content = content;}
  public void setId(int id) { this.id= id; }




     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         News news1 = (News) o;
         return departmentId == news1.departmentId &&
                 id == news1.id &&
                 Objects.equals(news, news1.news);
     }



 }