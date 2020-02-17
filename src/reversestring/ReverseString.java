/*Read a word (String) from the command line and then output the word in reverse order.
 *Use a for loop to 'walk through' the String.
 *Include a data validation that ensures the String is at least five characters.
 *If it's not, provide a suitable error message back to the user and conclude the program.
 *If it is valid input, proceed with the loop.
 */

//For example, if the user enters "IST140", the program should output "041TSI".

package reversestring;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String userChar;
        int charLength = 0;
        int i = 0;
        
        System.out.print("Please enter your characters: ");
        Scanner userInput = new Scanner(System.in);
        
        userChar = userInput.next();
        charLength = userChar.length();
        
        if(charLength < 5){
            System.out.println("Please enter at least 5 characters.");
            return;}
        for(i = 0; i < userChar.length(); ++i){
            System.out.print(userChar.charAt(userChar.length() -i -1));}
        System.out.println();
        }
    }
