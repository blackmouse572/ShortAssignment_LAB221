// Name: Pham Ngoc Nhan
// Class : SE1603

package J1.S.P0008;

import static J1.S.P0008.CountLetterChar.countChar;
import static J1.S.P0008.CountLetterChar.countWord;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        // str test: "hello, Pikachu will: what you want;;; world hello World1234"
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want: ");
        str = sc.nextLine();
        
        System.out.println("");
        
        // Count words
        countWord(str);
        
        System.out.println("");
        System.out.println("This is char count:");
        
        // Count char
        countChar(str);
    }
}
