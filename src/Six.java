import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/14.
 * 如果等级与下一个5的倍数之差小于3，则将等级向上舍入到下一个5的倍数。
 如果等级值小于38，则不进行舍入，因为结果仍然是失败的等级。
 Sample Input 0

 4
 73
 67
 38
 33

 Sample Output 0

 75
 67
 40
 33

 */
public class Six {

    static int[] solve(int[] grades){
        int[] result = new int[grades.length];
        for(int i=0;i<grades.length;i++){
            if(grades[i]<38){
                result[i]=grades[i];
            }else {
                if((5-(grades[i]%5))<3){
                    result[i]=grades[i]+(5-(grades[i]%5));
                }else {
                    result[i]=grades[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
