package lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov", "Ivan", "Senior Engineer", "ivanivanov@gmail.com", 210000, 34);
        persArray[1] = new Person("Sidorov", "Petr", "Engineer", "sidorovpetr@gmail.com", 69000, 44);
        persArray[2] = new Person("Efremov", "Aleksey", "Manager", "efremovaleksey@gmail.com", 73000, 44);
        persArray[3] = new Person("Pupkin", "Vasilii", "Top manager", "pupkinvasilii@gmail.com", 210000, 56);
        persArray[4] = new Person("Semenov", "Semen", "Cleaner", "semenovssemen@gmail.com", 25000, 18);

        for (Person e : persArray) if (e.getAge() > 40) e.getFullInfo();
    }
}

class Person {
    String firstname, name, position, email;
    int salary, age;

    Person(String firstname,
             String name,
             String position,
             String email,
             int salary,
             int age) {
        this.firstname = firstname;
        this.name = name;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    void getFullInfo() {
        System.out.println("firstname: " + firstname + " | name: " + name
                + " | position: " + position
                + " | email: " + email + " | salary: " + salary + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }
}

