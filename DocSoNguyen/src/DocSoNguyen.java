
import java.util.Scanner;

public class DocSoNguyen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nguyen < 1_000_000");
        int n = in.nextInt();
      //  if (n == 0)
       //     System.out.println("Không");
         if (n<0 || n > 999_999) {
            System.out.println("Số to quá a Lộc ơi huhu");
        } else {
             // hang don vi
            int u = n % 10;
            // hang chuc
            int tt = n / 10;
            int t = tt % 10;
            //hang tram
            int hh = n / 100;
            int h = hh % 10;
            //hang nghin
            int gg = n / 1000;
            int g = gg % 10;
            //hang van
            int zz = n /10000;
            int z = zz % 10;
            // hang 10 van
            int jj = n /100000;
            int j = jj % 10;
           // int h = n % 10;
           // int gg = n % 1000;
           // int g = gg / 10;
           // int zz = n % 10000;
           // int z = zz / 10;
            String uw[] = {"Không","Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"};
            String tw[] = {"Không", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi"};
            String hw = " Trăm ";
            String gw = " Nghìn ";
           // String lingw = " Linh ";


           if (n<11)
                System.out.println(uw[n]);
           else if (n < 100) {
                System.out.println(tw[t] + uw[u]);
            } //else if (n < 110) {
           //System.out.println(uw[h]+hw+ lingw + uw[u]);
            else if (n < 1_000) {
                System.out.println(uw[h]+ hw + tw[t] + uw[u]);
            }
            //else if (n <1_010) {
              // System.out.println(uw[g] + gw + uw[h]+ hw + lingw + uw[u]);
           else if (n < 10_000) {
                System.out.println(uw[g] + gw + uw[h] + hw + tw[t] + uw[u]);
            } else if (n <100_000) {
                System.out.println(tw[z]+ uw[g] + gw + uw[h] + hw + tw[t] + uw[u]);
            } else {
               System.out.println(uw[j]+hw+tw[z]+ uw[g] + gw + uw[h] + hw + tw[t] + uw[u]);
           }
        }
    }
}

