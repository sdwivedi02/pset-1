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
         var area = (8.5*11)*645.16;
         System.out.println("\n"+area+" square millimeters.");



        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
         var perimeter = ((2*8.5)+(2*11))*2.54;
         System.out.println("\n"+perimeter+" centimeters.");


        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
         var diagonal = Math.sqrt((8.5*8.5)+(11*11));
         System.out.println("\n"+diagonal+" inches.");


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

        var homeworkAverage = ((weightedhomework1+weightedhomework2+weightedhomework3)/3);
        var quizAverage = ((weightedquiz1+weightedquiz2+weightedquiz3)/3);
        var testAverage = ((weightedtest1+weightedtest2+weightedtest3)/3);

        var grade = homeworkAverage+quizAverage+testAverage;

        System.out.println("\n"+grade);




        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         var hourlyWage = 12.50;

         var monday = hourlyWage*7.5;
         var tuesday = hourlyWage*8;
         var wednesday = hourlyWage*10.5;
         var thursday = hourlyWage*9.5;
         var friday = hourlyWage*6;
         var saturday = hourlyWage*11.5;
         var sunday = hourlyWage*0;

         var total = monday+tuesday+wednesday+thursday+friday+saturday+sunday;

         System.out.println("\n"+ total);



        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         var salary = 117000/24;
         var federalIncomeTaxRate = 0.24;
         var stateIncomeTaxRate = 0.0637;
         var pretaxContributionRate = 0.07;

         var pretaxContribution = salary * pretaxContributionRate;
         var federalContribution = pretaxContribution * federalIncomeTaxRate;
         var stateContribution = pretaxContribution * stateIncomeTaxRate;

         var takeHomePay = salary-(pretaxContribution+federalContribution+stateContribution);

         System.out.println("\n"+takeHomePay);


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */



        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}
