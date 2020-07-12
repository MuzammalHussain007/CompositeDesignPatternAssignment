import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
    private int id;
    private String desciption;
    private String name;
    private List<Employee> employeeList;

    public Employee(int id, String desciption, String name) {
        this.id = id;
        this.desciption = desciption;
        this.name = name;
        employeeList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getDesciption() {
        return desciption;
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    public void getChild(int i) {
        employeeList.get(i);
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void print() {
        System.out.println("ID  " + getId());
        System.out.println("Name  " + getName());
        System.out.println("Designation  " + getDesciption());

        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            employee.print();
        }
    }

}
