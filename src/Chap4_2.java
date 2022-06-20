import java.util.Scanner;

public class Chap4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("年齢を入力してください。" );
        int age = scanner.nextInt();
        if(age >= 20) {
            if(age>=65){
                System.out.println("あなたは高齢者です。");
            } else {
                System.out.println("あなたは成人です。");
            }
        } else {
            System.out.println("あなたは未成年です。");
        }
    }
}
