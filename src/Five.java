import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/13.
 */
public class Five {
    static String timeConversion(String s) {
        String a = s.substring(8,10);
        String num = "00";
        if(a.equals("AM")){
            if(Integer.parseInt(s.substring(0,2))==12){
                return num+s.substring(2,8);
            }else {
                return s.substring(0, 8);
            }
        }else{
            if(Integer.parseInt(s.substring(0,2))==12){
                return s.substring(0, 8);
            }else {
                num = Integer.parseInt(s.substring(0, 2)) + 12 + "";
                return num + s.substring(2, 8);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
