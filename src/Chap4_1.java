import java.util.Scanner;

public class Chap4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age >= 20) {
            System.out.println("あなたは成人です。");
        }
    }
}
