import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/12.
 *
 * 比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，“100000”读作“shi wan”而不是“yi shi wan”，
 * “2000”读作“er qian”而不是“liang qian”。
 * 比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，“100000”读作“shi wan”而不是“yi shi wan”，
 * “2000”读作“er qian”而不是“liang qian”。
 * 输入：1234567009
 * 输出：shi er yi san qian si bai wu shi liu wan qi qian ling jiu
 * */
public class First {

    static void check(int input){
        String a[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String b[] = {"shi","bai","qian","wan","shi wan","bai wan","qian wan","yi","shi yi"};
        Integer s = input;
        int length = s.toString().length();
        if(length>1){
            StringBuilder output  = new StringBuilder();
            for(int i=length;i>0;i--){
                for(int k=0;k<a.length;k++){
                    if(input/i == k){
                        output.append(a[k]+" ");
                    }
                }

            }
        }else{
            for(int i=0;i<a.length;i++){
                if(input == i){
                    System.out.print(a[i]);
                }
            }
        }
    }
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        check(input);

    }

}
