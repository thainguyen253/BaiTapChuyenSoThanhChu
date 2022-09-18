
import java.util.Scanner;

public class DocSoNguyen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguyen < 100_000");
        int n = in.nextInt();
        if (n < 0 || n > 99_999) {
            System.out.println("Số to quá a Lộc ơi huhu");
        } else {
            int u = n % 10;
            int tt = n / 10;
            int t = tt % 10;
            int hh = n / 100;
            int h = hh % 10;
            int gg = n / 1000;
            int g = gg % 10;
            int zz = n /10000;
            int z = zz % 10;
           // int h = n % 10;
           // int gg = n % 1000;
           // int g = gg / 10;
           // int zz = n % 10000;
           // int z = zz / 10;
            String uw[] = {"Không","Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"};
            String tw[] = {"Không", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi"};
            String hw = " Trăm ";
            String gw = " Nghìn ";


           if (n<11)
                System.out.println(uw[n]);
           else if (n < 100) {
                System.out.println(tw[t] + uw[u]);
            } else if (n < 1_000) {
                System.out.println(uw[h]+ hw + tw[t] + uw[u]);
            } else if (n < 10_000) {
                System.out.println(uw[g] + gw + uw[h] + hw + tw[t] + uw[u]);
            } else {
                System.out.println(tw[z]+ uw[g] + gw + uw[h] + hw + tw[t] + uw[u]);
            }
        }
    }
}

