import java.util.Scanner;

class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class marriageSystem {
    public static void main(String[] args) {
        System.out.println("Enter Your age:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            if (x < 18) {
                throw new MyException("You are not eligible for marriage");
            } else {
                System.out.println("You are eligible for marriage");
            }
        } catch (MyException m) {
            System.out.println(m.getMessage());
        }
    }
}


