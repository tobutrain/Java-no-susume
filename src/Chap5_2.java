import java.util.Scanner;

public class Chap5_2 {
    public static void main(String[] args) {
        int cnt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("整数を入力してください: ");
        int in = scanner.nextInt();
        while(cnt<=in){
            System.out.print(cnt+" ");
            cnt++;
        }
    }
}
