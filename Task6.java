import java.util.Scanner;

public class Task6 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
        do{
            System.out.print("Enter a text: ");
            String input
            char[] chars = input.toCharArray();

            if (chars.length==0) {
                System.out.println("Text can't be empty.");
                continue;
            }
            int wordCount=1;
            for (int i=0; i< chars.length;i++){
                if(chars[i]>128){
                    System.out.println("Only ASCII codes are supported");
                    continue loop;
                }
                if(chars[i]==' '){
                    wordCount++;
                }

        }

        String[] words = new String[wordCount];

        for (int i = 0; i < chars.length; i++) {
            
        }

        }while(true);

        
    }
    
}
