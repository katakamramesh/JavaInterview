import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    int id;
    String name;
    String address;

    public static void main(String[] args) {
        //compare(), custom sorting
        Employee employee1 = new Employee();
        employee1.setName("qwe");
        employee1.setAddress("add");
        employee1.setId(1);
        Employee employee2 = new Employee();
        employee2.setName("asd");
        employee2.setAddress("asd");
        employee2.setId(2);
        Employee employee3 = new Employee();
        employee3.setName("zxc");
        employee3.setId(3);
        employee3.setAddress("sfa");

        List<Employee> l = new ArrayList<>();
        l.add(employee1);
        l.add(employee2);
        l.add(employee3);

        Collections.sort(l, new CustomSortingComparator());
        System.out.println("args = " + l);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
