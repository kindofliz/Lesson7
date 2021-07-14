import java.sql.SQLOutput;
import java.util.Scanner;

public class Practise {
    public static void main(String [] args) {

//        //Using SWITCH operator
//        String officeDay = "Working day";
//
//
//        switch (officeDay) {
//            case "Working day":
//                System.out.println("You must wear high heels");
//                break;
//            case "Casual friday":
//                System.out.println("You can wear flats");
//                break;
//            case "Halloween":
//                System.out.println("You can wear any costume");
//                break;
//            case "Holydays":
//                System.out.println("You can stay at home");
//                break;
//            default:
//                System.out.println("No such day");
//
//        }
//
//        // Intervals of ages IF ELSE approach
//        //Calculating a price for a museum ticket
//        // 0-7 years - free
//        // 8-12 years - 1eur
//        // 13-18 years - 2eur
//        // 18-64 years - 5eur
//        // 65-120 years - free
//
//        short age = 31;
//        if ((age>=0 && age<8) || (age >= 64 && age<120)) {
//            System.out.println("You can go for free");
//        } else if (age >= 8 && age<12) {
//            System.out.println("The price is 1 eur");
//        } else if (age >= 12 && age < 18) {
//            System.out.println("Price is 2 eur");
//        } else if (age >= 18 && age<64) {
//            System.out.println("The price is 5 eur");
//        }  else {
//            System.out.println("Seems that your age is incorrect");
//        }

        //Task 1
        //Option 1

//        short day;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the day number: ");
//        day = scanner.nextShort();
//
//        System.out.println("The day number is: ");
//
//
//        if (day<0) {
//            System.out.println("The day cannot be negative");
//        } else if (day>365) {
//            System.out.println("The day cannot be that large");
//        } else {
//            short month = (short)(Math.ceil(day/30) + 1);
//            switch (month) {
//                case 1:
//                    System.out.println("It is: January");
//                    break;
//                case 2:
//                    System.out.println("It is: February");
//                    break;
//                case 3:
//                    System.out.println("It is: March");
//                    break;
//                case 4:
//                    System.out.println("It is: April");
//                    break;
//                case 5:
//                    System.out.println("It is: May");
//                    break;
//                case 6:
//                    System.out.println("It is: June");
//                    break;
//                case 7:
//                    System.out.println("It is: July");
//                    break;
//                case 8:
//                    System.out.println("It is: August");
//                    break;
//                case 9:
//                    System.out.println("It is: September");
//                    break;
//                case 10:
//                    System.out.println("It is: October");
//                    break;
//                case 11:
//                    System.out.println("It is: November");
//                    break;
//                case 12:
//                    System.out.println("It is: December");
//                    break;
//
//
//            }
//
//        }


        // Option 2

        int dayNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day number: ");
        dayNumber = scanner.nextInt();
        System.out.println("The day number is: " + dayNumber);


        if (dayNumber<0) {
            System.out.println("The day number cannot be negative.");
        } else if (dayNumber>7) {
            System.out.println("Your number is too large, there are only 7 days in a week.");
        } else {

            switch (dayNumber) {
                case 1:
                    System.out.println("It is a working day!");
                    break;
                case 2:
                    System.out.println("It is a working day!");
                    break;
                case 3:
                    System.out.println("It is a working day!");
                    break;
                case 4:
                    System.out.println("It is a working day!");
                    break;
                case 5:
                    System.out.println("It is a working day!");
                    break;
                case 6:
                    System.out.println("It is a holiday!");
                    break;
                case 7:
                    System.out.println("It is a holiday!");
                    break;
                default:
                    System.out.println("Day value is input incorrectly");
                    break;
            }
        }
    }
}
