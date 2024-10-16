public class EmployeeInfo {
    static Employee[] employeeData = new Employee[8];

    public static void main(String[] args) {
        Employee employee1 = new Employee("Meghana", "Manager", 101, 75000);
        Employee employee2 = new Employee("Harshitha", "Developer", 102, 65000);
        Employee employee3 = new Employee("Ananya", "Designer", 103, 60000);
        Employee employee4 = new Employee("Hema", "Analyst", 104, 70000);
        Employee employee5 = new Employee("Niharika", "Sales", 105, 55000);
        Employee employee6 = new Employee("Indu", "HR", 106, 60000);
        Employee employee7 = new Employee("Anusha", "Support", 107, 50000);
        Employee employee8 = new Employee("Sanjana", "Marketing", 108, 58000);

        saveEmployee(employee1);
        saveEmployee(employee2);
        saveEmployee(employee3);
        saveEmployee(employee4);
        saveEmployee(employee5);
        saveEmployee(employee6);
        saveEmployee(employee7);
        saveEmployee(employee8);

        for (int i = 0; i < employeeData.length; i++) {
            if (employeeData[i] != null) {
                employeeData[i].displayEmployeeInfo();
            }
        }
    }

    public static boolean saveEmployee(Employee employee) {
        for (int i = 0; i < employeeData.length; i++) {
            if (employeeData[i] == null) {
                employeeData[i] = employee;
                System.out.println("Employee is saved");
                return true;
            }
        }
        System.out.println("No space in the array");
        return false;
    }
}