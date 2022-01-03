package utils;

import java.util.Scanner;

public class TestScaner {

	public static void main(String[] args) {

		

        try ( Scanner scanner = new Scanner( System.in ) ) {
            
            while( true ) {
                System.out.print( "Enter your login: " );
                String login = scanner.nextLine();
                
                System.out.print( "Enter your password: " );
                String password = scanner.nextLine();
                
                if ( login.equals( "Bond" ) && password.equals( "007" ) ) {
                    break;
                }
            }
            
            System.out.println( "Welcome James" );
            
            System.out.print( "How many spies are you killed: " );
            int count = scanner.nextInt();
            if ( count > 100 ) System.out.println( "You are a great spy!!!" );
        }

	}
}
