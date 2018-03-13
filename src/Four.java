import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/13.
 * Sample Input
 4
 3 2 1 3

 Sample Output
 2

 Explanation 0
 We have one candle of height1, one candle of height2, and two candles of height3. Your niece only blows out the tallest
 candles, meaning the candles where height=3. Because there are 2 such candles, we print 2 on a new line.
 */
public class Four {
    static int birthdayCakeCandles(int n, int[] ar) {
        int max = ar[n-1];
        int result = 0;
        for(int i=0;i<n;i++){
            max = max>ar[i] ? max:ar[i];
        }
        for(int i=0;i<n;i++){
            if(ar[i] == max){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);

    }
}
