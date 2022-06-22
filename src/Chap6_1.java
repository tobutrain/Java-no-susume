import java.util.Scanner;

public class Chap6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Remaind remaind = new Remaind();
        System.out.print("数値を入力してください: ");
        int in = scanner.nextInt();
        if(remaind.remaind2(in)==0){
            System.out.println(in+"は偶数です。");
        } else {
            System.out.println(in+"は奇数です。");
        }
    }
}

class Remaind{
    Integer remaind2(int in){
        int res = in % 2;
        return res;
    }

    Integer remaind3(int in){
        int res = in % 3;
        return res;
    }
}

