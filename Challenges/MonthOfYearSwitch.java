import java.util.Scanner;

public class MonthOfYearSwitch {
    public static void main(String[] args) {
        System.out.println("Months of the year \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int num = input.nextInt();
            switch (num) {
                case 1 :
                    System.out.println("Janauary");
                    break;
                case 2 :
                    System.out.println("Febrauary");
                    break;
                case 3 :
                    System.out.println("March");
                    break;
                case 4 :
                    System.out.println("April");
                    break;
                case 5 :
                    System.out.println("May");
                    break;
                case 6 :
                    System.out.println("June");
                    break;
                case 7 :
                    System.out.println("July");
                    break;
                case 8 :
                    System.out.println("August");
                    break;
                case 9 :
                    System.out.println("September");
                    break;
                case 10 :
                    System.out.println("October");
                    break;
                case 11 :
                    System.out.println("November");
                    break;
                case 12 :
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Only 12 Months are in the year");

            }
        }
    }

