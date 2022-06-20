import java.util.Scanner;

public class Chap5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int in = scanner.nextInt();
        for(int cnt=0;cnt<=in;cnt++){
            System.out.print(cnt+" ");
        }
    }
}

