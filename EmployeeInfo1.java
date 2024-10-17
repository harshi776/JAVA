public class EmployeeInfo1 {
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

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < employeeData.length; i++) {
            if (employeeData[i] != null) {
                employeeData[i].displayEmployeeInfo();
            }
        }

        Employee foundByName = findEmployeeByName("Ananya");
        if (foundByName != null) {
            foundByName.displayEmployeeInfo();
        } else {
            System.out.println("Employee not found by name.");
        }

        Employee foundById = findEmployeeById(106);
        if (foundById != null) {
            foundById.displayEmployeeInfo();
        } else {
            System.out.println("Employee not found by ID.");
        }

        boolean updated = updateEmployeeById(102, "Harshitha", "Senior Developer", 70000);
        System.out.println(updated ? "Employee updated successfully." : "Update failed.");

        foundById = findEmployeeById(102);
        if (foundById != null) {
            foundById.displayEmployeeInfo();
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

    public static Employee findEmployeeByName(String name) {
        for (Employee employee : employeeData) {
            if (employee != null && employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee findEmployeeById(int id) {
        for (Employee employee : employeeData) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public static boolean updateEmployeeById(int id, String name, String designation, double salary) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.setName(name);
            employee.setDesignation(designation);
            employee.setSalary(salary);
            return true;
        }
        return false;
    }
}
