public class Employee {
    private String firstName;
    private String secondName;
    private String patronymic;
    private int department;
    private int salary;
    public static int count = 0;
    private int id;


    public Employee(String firstName, String secondName, String patronymic, int department, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        id = count;
        count++;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return department + " " +  secondName + " " + firstName + " " +  patronymic + " " + salary;
    }
}
