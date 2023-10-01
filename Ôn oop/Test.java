class Test { 
    public static void increaseAge(Person p) { 
        p.setAge(p.getAge() + 1); 
    } 
    public static void swap(Person p1, Person p2) { Person tmp = p1; 
    p1 = p2; 
    p2 = tmp; 
    } 
    public static void main(String[] args) { 
    Person p1 = new Person(15); 
    Person p2 = new Person(20); 
    increaseAge(p1); 
    swap(p1, p2); 
    System.out.print(p1.getAge() + " "+p2.getAge() + " "); 
    } 
    } 
    