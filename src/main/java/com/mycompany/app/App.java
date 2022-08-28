package com.mycompany.app;
import org.apache.commons.codec.digest.DigestUtils;
/**
 * Hello world!
 *
 */

public class App {

    public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);  // Create a Scanner object

		
		
        System.out.println("Welcome to my maven simple project !! \n");
        	
        System.out.println("***Welcome to Real Madrid's players names app*** \n");
        System.out.println("   To show list of goal keepers  ==> press G");
        System.out.println("   To show list of defenders     ==> press D");
        System.out.println("   To show list of midfielders   ==> press M");
        System.out.println("   To show list of strikers      ==> press S");
        
        String position = scanner.next();
        
        switch(position) {
        case "G":
          // code block
            System.out.println("***This is the complete list of goalkeepers*** \n");
            
            System.out.println("   * Thibaut Courtois -goalkeeper");
            System.out.println("   * Luis Lopez -goalkeeper");
            System.out.println("   * Andriy Lunin -goalkeeper");

        	
          break;
        case "D":
          // code block
            System.out.println("***This is the complete list of defenders*** \n");
            
            System.out.println("   Alvaro Odriozola -defender");
            System.out.println("   Antonio Ruediger -defender");
            System.out.println("   Daniel Carvajal -defender");
            System.out.println("   David Alaba -defender");
            System.out.println("   Eder Militao -defender");
            System.out.println("   Ferland Mendy -defender");
            System.out.println("   Jesus Vallejo -defender");
            System.out.println("   Nacho -defender");

          break;
        case "M":
            // code block
            System.out.println("***This is the complete list of midfielders*** \n");
            
            System.out.println("   Luka Modric -midfielder");
            System.out.println("   Toni Kroos -midfielder");
            System.out.println("   Eden Hazard -midfielder");
            System.out.println("   Lucas Vazquez -midfielder");
            System.out.println("   Marco Ascensio -midfielder");
            System.out.println("   Federico Valverde -midfielder");
            System.out.println("   Eduardo Camavinga -midfielder");
            System.out.println("   Dani Ceballos -midfielder");
            System.out.println("   Aurelien Tchouameni -midfielder");

            break;
        case "S":
            // code block
            System.out.println("***This is the complete list of strikers*** \n");
            
            System.out.println("   Karim Benzema -forward");
            System.out.println("   Mariano -forward");
            System.out.println("   Vinicius Junior -forward");
            break;
        default:
          // code block
      }


    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
