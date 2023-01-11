package Library_Management;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        // initialisation of library instance
        Library_Management_System library = new Library_Management_System;
        String T ="";

        //start listening to the user commands
        while(T !="exit"){
            System.out.println("-------------List of commands---------------");
            System.out.println("1- to register a new user tape: r");
            System.out.println("2- to create a new book tape: b");
            System.out.println("3- to show all avaliable books tape: books");
            System.out.println("4- to close tape: exit");

            Scanner TappedValue =new Scanner(System.in);//create a scanner
            String value = TappedValue.nextLine();//read user input

            switch (value){
                case "r":
                    //create a new user block
                    System.out.println("enter username");
                    String username =TappedValue.nextLine();

                    System.out.println("enter password");
                    String password =TappedValue.nextLine();
                    //call registration method to register the new user
                    library.Register(username,password);
                    break;

                    case "b":
                        //create a new book block
                        System.out.println("create a new book");
                        library.show_all_books();
                    break;
                    case "books":
                        //show all books
                        System.out.println("show all books");
                        library.show_all_books();
                    break;
                    case "users":
                        //show all users
                        System.out.println("show all users");
                        library.show_all_users();
                    break;
                    case "exit":
                        //close
                        System.out.println("closing ...");

                    break;
                    default :
                        System.out.println("error: invalid command try again")
                    break;



            }
            System.out.println("--------------------------------------------------");
        }
    }
}