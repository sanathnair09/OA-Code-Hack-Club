class Main {
    public static void main(String[] args) {

        // Slide 1: Main method, System.out.println()
        // Comments
        System.out.println("Hello world!");

        // Slide 2: Data Types & Variables
        // The green lines just mean that we haven't used the variable
        int age = 16;
        System.out.println(age);

        double height = 66;
        System.out.println(height);

        boolean filledAttendance = true;
        System.out.println(filledAttendance);

        char firstInital = 's';
        System.out.println(firstInital);

        String name = "Bob";
        System.out.println(name);

        // BONUS!
        System.out.println(name + " is " + age + " years old and is " + height + " inches tall.");

        // Slide 3: Operators
        /*
         * Basic: +, -, *, / Comparison: >, <, >=, <= --> result is always a boolean
         * Logical: &&, ||, ==, != --> both sides must be a boolean
         */

        int x = 10;
        int y = 5;

        int sum = x + y;
        System.out.println(sum); // expected result is _
        int difference = x - y;
        System.out.println(difference); // expected result is _
        int product = x * y;
        System.out.println(product); // expected result is _
        int quotient = x / y;
        System.out.println(quotient); // expected result is _

        boolean greater = x > y;
        System.out.println(greater); // expected result is _

        // Slide 4: Conditional Statements

        int magicNum = 10;

        if (magicNum == 10) {
            System.out.println("The magic number is: " + magicNum);
        } else {
            System.out.println("Error! Wrong magic number.");
        }

        if (age > 13 && age < 19) {
            System.out.println("You are a teen");
        } else if (age > 19) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }

        // Slide 5: Control Flows

        for (int counter = 0; counter <= 9; counter++) {
            System.out.print(counter + ", ");
        }
    }
}
