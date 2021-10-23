package Lesson5;

public class Employee {

    private int Id;
    private String Name;
    private String Role;
    private String Salary;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = Id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        this.Role = role;


    }
    public String getSalary() {
        return Salary;
    }
    public void setSalary(String salary) {
        this.Salary = salary;
    }

    @Override
    public String toString(){
        return "\n " + getId() + "    " + getName() + "  " + getRole() + "  " + getSalary();
    }
}


