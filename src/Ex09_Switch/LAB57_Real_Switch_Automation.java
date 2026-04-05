package Ex09_Switch;

import java.util.Scanner;

public class LAB57_Real_Switch_Automation {
    public static void main(String[] args) {
       //Web Automation
        // I will ask the user to give me the input from browser which he wants to
        //use to i will start the automation in that browser.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the browser ");
        String browser = scanner.next();
        browser = browser.toLowerCase();


        switch (browser) {
            case "chrome":
                System.out.println("Starting the Chrome");
                System.out.println("......");
                System.out.println("Welcome to the Chrome Browser");
                System.out.print("Enter the URL ");
                break;
                case "firefox":
                    System.out.println("Starting the Firefox");
                    System.out.println("......");
                    System.out.println("Welcome to the Firefox");
                    System.out.print("Enter the URL ");
                    break;
                    default:
                        System.out.println("No idea about the browser");
                        break;

        }


    }
}
