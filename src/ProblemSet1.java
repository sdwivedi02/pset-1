/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
         double area = (8.5*11)*645.16;
         String areaRounded = String.format("%,.2f", area);

         System.out.println("\n"+areaRounded+" square millimeters.");



        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         double perimeter = ((2*8.5)+(2*11))*2.54;
         System.out.println("\n"+perimeter+" centimeters.");


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
         double diagonal = Math.sqrt((8.5*8.5)+(11*11));
         String diagonalRounded = String.format("%.2f", diagonal);
         System.out.println("\n"+diagonalRounded+" inches.");


        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

        final double HOMEWORK = 0.15;
        final double QUIZ = 0.35;
        final double TEST = 0.5;

        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;

        double weightedhomework1 = homework1 * HOMEWORK;
        double weightedhomework2 = homework2 * HOMEWORK;
        double weightedhomework3 = homework3 * HOMEWORK;
        double weightedquiz1 = quiz1 * QUIZ;
        double weightedquiz2 = quiz2 * QUIZ;
        double weightedquiz3 = quiz3 * QUIZ;
        double weightedtest1 = test1 * TEST;
        double weightedtest2 = test2 * TEST;
        double weightedtest3 = test3 * TEST;

        double homeworkAverage = ((weightedhomework1+weightedhomework2+weightedhomework3)/3);
        double quizAverage = ((weightedquiz1+weightedquiz2+weightedquiz3)/3);
        double testAverage = ((weightedtest1+weightedtest2+weightedtest3)/3);

        double grade = homeworkAverage+quizAverage+testAverage;
        String gradeRounded = String.format("%,.2f%%", grade);

        System.out.println("\n"+gradeRounded+".");




        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         double hourlyWage = 12.50;

         double monday = hourlyWage*7.5;
         double tuesday = hourlyWage*8;
         double wednesday = hourlyWage*10.5;
         double thursday = hourlyWage*9.5;
         double friday = hourlyWage*6;
         double saturday = hourlyWage*11.5;
         double sunday = hourlyWage*0;

         double total = monday+tuesday+wednesday+thursday+friday+saturday+sunday;
         String totalRounded = String.format("$%.2f", total);

         System.out.println("\n"+ totalRounded + ".");



        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         double salary = 117000/24;
         double federalIncomeTaxRate = 0.24;
         double stateIncomeTaxRate = 0.0637;
         double pretaxContributionRate = 0.07;

         double pretaxContribution = salary * pretaxContributionRate;
         double federalContribution = pretaxContribution * federalIncomeTaxRate;
         double stateContribution = pretaxContribution * stateIncomeTaxRate;

         double takeHomePay = salary-(pretaxContribution+federalContribution+stateContribution);
         String takeHomePayRounded = String.format("$%,.2f", takeHomePay);

         System.out.println("\n"+takeHomePayRounded + ".");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         int students = 273;
         int teachers = 28;
         int busCapacity = 54;

         int numberOfBuses = (students+teachers) / busCapacity + 1;
         int peopleOnLastBus = (students + teachers) % busCapacity;

         System.out.println("\n"+numberOfBuses+" buses are needed, with "+ peopleOnLastBus + " passengers on the last bus.");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         int boardLength = 48;
         int boardWidth = 24;
         int holeDiameter = 6;
         int holeRadius = holeDiameter/2;

         int boardArea = boardLength * boardWidth;
         double holeArea = Math.PI*(holeRadius*holeRadius);

         double totalArea = boardArea-holeArea;
         String totalAreaRounded = String.format("%,.2f", totalArea);

         System.out.println("\n"+totalAreaRounded+" square inches.");

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         int year = 0;
         boolean isLeapYear = false;

         year = 2020;
         isLeapYear=((year % 4)=0)&&(((year % 100)!=0) || ((year % 400)=0));

         System.out.println("\n" + year + " is a leap year..." + isLeapYear);

         year = 2100;
         isLeapYear=((year % 4)=0)&&(((year % 100)!=0) || ((year % 400)=0));

         System.out.println("\n" + year + " is a leap year..." + isLeapYear);

         year = 2400;
         isLeapYear = (year % 4=0)&&((year % 100!=0) || (year % 400=0));

         System.out.println("\n" + year + " is a leap year..." + isLeapYear);

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         int temperature = 38;
         int windSpeed = 14;

         double windChill = (35.74+ (0.6215*temperature))+((0.4275*temperature)-35.75) * Math.pow(windSpeed, 0.16);
         String windChillRounded = String.format("%.1f", windChill);

         System.out.println("\n"+ windChillRounded + " degrees. \n");


    }
}
