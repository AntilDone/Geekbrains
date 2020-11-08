package lesson_1;

public class FirstClass {
    public static void main(String[] args) {

        Versions();

        float calculate = isCalculate(1.5f,5.6f,9.65f,15.3f);
        System.out.println("Answer a * ( b + (c / d )) = " + calculate);

        boolean border = isBorder(12,5);
        System.out.println("Answer Sum = " + border);

        isEven(2);

        boolean negative = isNegative(-3);
        System.out.println("Number is Negative = " + negative);

        isName("Andrey");

        isLeapYear(2020);


    }

    public static void Versions() {

        System.out.println("Task №2");
        byte by = -15;
        short sh = 1567;
        int in = 33000;
        long lo = 140000L;
        float fl = 14.5f;
        double dob = -95.5;
        char ch = 'x';
        boolean bol = true;

        System.out.println("byte = " + by);
        System.out.println("short = " + sh);
        System.out.println("int = " + in);
        System.out.println("long = " + lo);
        System.out.println("float = " + fl);
        System.out.println("double = " + dob);
        System.out.println("char = " + ch);
        System.out.println("boolean = " +bol);
    }


    public static float isCalculate(float a, float b, float c, float d){
        System.out.println("Task №3");
        return a * ( b + (c / d));
    }

    public static boolean isBorder(int x1, int x2){
        System.out.println("Task №4");
        int sum = x1+x2;

        return sum >= 10 && sum <= 20;
    }

    public static void isEven(int e) {
        System.out.println("Task №5");
        if (e>=0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }

    public static boolean isNegative(int neg) {
        System.out.println("Task №6");
        return neg <= 0;
    }

    public static void isName(String name) {
        System.out.println("Task №7");
        System.out.println("Hi, " + name + "!");
    }

    public static void isLeapYear (int year) {
        System.out.println("Task №8");
        if ((year % 4 == 0) || (!(year % 100 == 0) && (year % 400 == 0))) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }
    }
}