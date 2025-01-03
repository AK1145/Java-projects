import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        System.out.println("Simple calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        float num1 = sc.nextFloat();
        System.out.println("Enter num2");
        float num2 = sc.nextFloat();
        System.out.println("Choose your operator");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int options = sc.nextInt();
        Float operation ;
        switch(options){
            case 1:
            operation = num1 + num2;
            System.out.println("1.Addition : "+operation);
            break;
            case 2:
            operation = num1 - num2;
            System.out.println("2.Subtraction : "+operation);
            break;
            case 3:
            operation = num1 * num2;
            System.out.println("3.Multiplication : "+operation);
            break;
            case 4:
            operation = num1 / num2;
            System.out.println("4.Division : "+operation);
            break;
        }
        sc.close();

    }
}