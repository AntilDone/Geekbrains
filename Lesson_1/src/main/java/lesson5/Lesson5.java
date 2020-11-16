package lesson5;

class Employee {
    String firstname, name, middlename, position, email;
    int salary, age;

    Employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.middlename = middlename;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("firstname: " + firstname + " | name: " + name
                + " | middlename: " + middlename + " | position: " + position
                + " | email: " + email + " | salary: " + salary + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }
}

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Top manager", "ivanovii@mail.ru", 150000, 45);
        employees[1] = new Employee("Aleksandrov", "Aleksandr", "Aleksandrovich", "manager",
                "aleksandrovaa@mail.ru", 45000, 31);
        employees[2] = new Employee("Sidorov", "Petr", "Petrovich",
                "manager", "sidorovpp@mail.ru", 25000, 23);
        employees[3] = new Employee("Pupkin", "Vasilii", "Ivanovich",
                "manager", "pupkinvi@mail.ru", 21000, 41);
        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "manager", "semenovss@mail.ru", 35000, 23);

        for (Employee e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}