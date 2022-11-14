public class Main {
    public static Employee[] employees;
    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Nurlan", "Utegali", "Daulet-Kerey uly", 1, 10);
        employees[1] = new Employee("Armat", "Samat", "Jumash uly", 2, 9);
        employees[2] = new Employee("Samat", "Quanish", "Muqagali uly", 3, 8);
        employees[3] = new Employee("Erlan", "Serik", "Jan-Qozha uly", 4, 7);
        employees[4] = new Employee("Janat", "Damir", "Aman-Keldi uly", 5, 6);
        employees[5] = new Employee("Serik", "Aysultan", "Asu uly", 6, 5);
        employees[6] = new Employee("Kerey", "Musagali", "Muhtar uly", 7, 4);
        employees[7] = new Employee("Qasim-Jomart", "Azamat", "Naurizbay uly", 1, 3);
        employees[8] = new Employee("Ergali", "Almazbek", "Baqitgali uly", 2, 2);
        employees[9] = new Employee("Qoblandi", "Aytore", "Ernazar uly", 3, 1);

        soutString();
        System.out.println(sumSalary());
        minSalary();
        maxSalary();
        System.out.println(middleSalary());
        Names();


    }

    public static void soutString() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }
    public static int minSalary() {
        int min = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            int currentValue = employees[i].getSalary();
            if (min > currentValue) {
                min = currentValue;
            }
        }
        return min;
    }
    public static int maxSalary() {
        int max = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            int currentValue = employees[i].getSalary();
            if (max < currentValue) {
                max = currentValue;
            }
        }
        return max;
    }
    public static int middleSalary() {
        int r = 0;
        for (int i = 0; i < employees.length; i++) {
            r++;
        }
        return sumSalary() / r;
    }

    public static void Names() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFirstName() + " " + employees[i].getSecondName() + " " + employees[i].getPatronymic());
        }
    }
}