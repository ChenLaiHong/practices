import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/13.
 * 例：输入一组数据：1 2 3 4 5
 *     输出：10 14
 *     即：2+3+4+5
 *         1+3+4+5
 *         1+2+4+5
 *         1+2+3+5
 *         1+2+3+4
 *     的和进行排序，输出最小和最大
 */
public class Third {
    static void miniMaxSum(int[] arr) {
        long[] sums = new long[arr.length];
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j ==i){
                    continue;
                }
                sum += arr[j];
            }
            sums[i]=sum;
            sum =0;
        }
        Arrays.sort(sums);
        System.out.print(sums[0]+" "+sums[arr.length-1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();

    }
}
