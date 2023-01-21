import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int girilen, a, b, toplm = 0;
        out.print("Basamak sayılarının toplanacağı sayıyı yazınız lütfen : ");
        girilen = input.nextInt();
        a = girilen;
        b = a;
        while (b != 0) {
            b = a % 10;
            toplm += b;
            a = a / 10;
        }
        out.print(girilen + " Sayısının basamak sayılarının toplamı : " + toplm);

    }
}
