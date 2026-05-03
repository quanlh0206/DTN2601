package entity;

public class Department {
   private int departmentId;
   private String departmentName;

   public Department() {

   }

   public Department(String name) {
       this.departmentId = 0;
       this.departmentName = name;
   }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
