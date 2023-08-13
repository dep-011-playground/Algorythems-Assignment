import java.util.Scanner;

public class Task1{
private static final Scanner Scanner = new Scanner(System.in);
public static void main(String[] args) {
    int number = 0;
    do{
    do{
        System.out.print("Enter a number: ");
        number = Scanner.nextInt();
        Scanner.nextLine();
        if (number<0) System.out.println("please enter a positive number");

    }while(number<0);

    System.out.println("Febonacci series upto "+ number);
    int first =0; int second =1;
    System.out.print(first+","+second);
    
    int next;
    for(next=0;next<number; ){
        next = (first+second);
        first = second; second = next;
        if (second > number) break;
        System.out.print(","+ next );
        next++;
    }
    System.out.print("\n");
    }while(true);

}
}