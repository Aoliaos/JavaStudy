package dong2;

import java.util.Scanner;
import java.util.Date;

/**
 * @PackageName:dong2
 * @ClassName: Scanner1
 * @Description:
 * @author:Dong
 * @data 7月28-028 9:54
 */
public class Scanner1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //输入，输出
        int foot;
        double inch;
        //System.out.println(1.2-1.1);
        Scanner in = new Scanner(System.in);
        System.out.println(new Date());
        foot = in.nextInt();
        inch = in.nextInt();
        System.out.println("foot="+foot+",inch="+inch);
        System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");

    }
}
