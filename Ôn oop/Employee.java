class Employee extends Person{ 
    public Employee() { 
    } 
    public Employee(int age, String name) { super(age, name); 
    } 
    public static void main(String[] args) { Employee e1 = new Employee(); 
    Employee e2 = new Employee(16, "Huy");
     System.out.print(e2.age + " " + e2.name); } 
    } 
    