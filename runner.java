//ACTIVITY 1
class Circle {
    private int radius;

    public Circle() {
        radius = 7;
    }

    public Circle(int r) {
        radius = r;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void display() {
        System.out.println("radius = " + radius);
    }

    // Corrected: circumference = 2 * pi * r
    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }
}

public class Runner {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("Circumference of Circle 1 is: " + c1.calculateCircumference());

        int r = c1.getRadius();
        Circle c2 = new Circle(r);
        c2.setRadius(5);
        System.out.println("Circumference of Circle 2 is: " + c2.calculateCircumference());
    }
}


//ACTIVITY 2
class Rectangle {
    private int length, width;

    public Rectangle() {
        length = 5;
        width = 2;
    }

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void setLength(int l) {
        length = l;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return length * width;
    }
}

public class Runner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is: " + rect.area());
        System.out.println("Width of Rectangle is: " + rect.getWidth());
    }
}


//ACTIVITY 3
class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("x coordinate = " + x + " y coordinate = " + y);
    }

    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
    }
}

public class Runner {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(7);
        p1.display();

        Point p2 = new Point(10, 11);
        p2.movePoint(2, 3);
        p2.display();
    }
}


//LAB TASK 1
class Marks {
    private int mark1;
    private int mark2;
    private int mark3;

    // Setter methods
    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    // Getter methods
    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }
}

public class Runner {
    public static void main(String[] args) {
        Marks m = new Marks();

        // Set marks
        m.setMark1(85);
        m.setMark2(90);
        m.setMark3(78);

        // Get and display marks
        System.out.println("Mark 1: " + m.getMark1());
        System.out.println("Mark 2: " + m.getMark2());
        System.out.println("Mark 3: " + m.getMark3());
    }
}


//LAB TASK 2
class Account {
    private double balance;

    // Default constructor
    public Account() {
        balance = 0;
    }

    // Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

public class Runner {
    public static void main(String[] args) {
        // Create first account using default constructor
        Account acc1 = new Account();
        acc1.deposit(1000); // deposit some amount
        System.out.println("Account 1 balance: " + acc1.getBalance());

        // Create second account with the same balance as first account
        Account acc2 = new Account(acc1.getBalance());
        System.out.println("Account 2 balance (same as Account 1): " + acc2.getBalance());

        // Test withdraw and deposit on second account
        acc2.withdraw(200);
        System.out.println("Account 2 balance after withdrawing 200: " + acc2.getBalance());

        acc2.deposit(500);
        System.out.println("Account 2 balance after depositing 500: " + acc2.getBalance());
    }
}



//LAB TASK 3
class Student {
    private String name;
    private int[] result_array; // stores marks for 5 subjects

    // Argument constructor
    public Student(String name, int[] result_array) {
        this.name = name;
        // Copy array to preserve encapsulation (avoid aliasing)
        this.result_array = new int[result_array.length];
        for (int i = 0; i < result_array.length; i++) {
            this.result_array[i] = result_array[i];
        }
    }

    // Calculates and returns average of marks
    public double average() {
        int sum = 0;
        for (int i = 0; i < result_array.length; i++) {
            sum += result_array[i];
        }
        return (double) sum / result_array.length;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for result array (returns a copy for encapsulation)
    public int[] getResultArray() {
        int[] copy = new int[result_array.length];
        for (int i = 0; i < result_array.length; i++) {
            copy[i] = result_array[i];
        }
        return copy;
    }
}

public class Runner {
    public static void main(String[] args) {
        int[] marks1 = {80, 75, 90, 85, 70};
        int[] marks2 = {88, 92, 79, 95, 81};

        // Create two Student objects
        Student s1 = new Student("Ali", marks1);
        Student s2 = new Student("Sara", marks2);

        // Call Average method
        double avg1 = s1.average();
        double avg2 = s2.average();

        System.out.println(s1.getName() + "'s Average: " + avg1);
        System.out.println(s2.getName() + "'s Average: " + avg2);

        // Compare averages
        if (avg1 > avg2) {
            System.out.println(s1.getName() + " has the higher average.");
        } else if (avg2 > avg1) {
            System.out.println(s2.getName() + " has the higher average.");
        } else {
            System.out.println("Both students have the same average.");
        }

        // Create third student: name from s1, result array from s2
        Student s3 = new Student(s1.getName(), s2.getResultArray());
        System.out.println("Third Student: " + s3.getName()
                + " | Average: " + s3.average());
    }
}



//LAB TASK 4
class HotDogStand {
    private int idNumber;
    private int hotDogsSold;

    // Constructor to initialize both values
    public HotDogStand(int idNumber, int hotDogsSold) {
        this.idNumber = idNumber;
        this.hotDogsSold = hotDogsSold;
    }

    // Increments hot dogs sold by one
    public void justSold() {
        hotDogsSold++;
    }

    // Getter for ID number
    public int getIdNumber() {
        return idNumber;
    }

    // Getter for hot dogs sold
    public int getHotDogsSold() {
        return hotDogsSold;
    }
}

public class Runner {
    public static void main(String[] args) {
        // Create three hot dog stands
        HotDogStand stand1 = new HotDogStand(101, 0);
        HotDogStand stand2 = new HotDogStand(102, 5);
        HotDogStand stand3 = new HotDogStand(103, 10);

        // Stand 1 sells 4 hot dogs
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();

        // Stand 2 sells 3 hot dogs
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();

        // Stand 3 sells 2 hot dogs
        stand3.justSold();
        stand3.justSold();

        // Display hot dogs sold for each stand
        System.out.println("Stand ID: " + stand1.getIdNumber()
                + " | Hot Dogs Sold: " + stand1.getHotDogsSold());
        System.out.println("Stand ID: " + stand2.getIdNumber()
                + " | Hot Dogs Sold: " + stand2.getHotDogsSold());
        System.out.println("Stand ID: " + stand3.getIdNumber()
                + " | Hot Dogs Sold: " + stand3.getHotDogsSold());
    }
}