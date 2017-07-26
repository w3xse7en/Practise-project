package Fibonacci;

/**
 * Created by Mew on 2017/7/26.
 */
public class JumpFloorII {
    public int JumpFloorII(int target) {
        if(target==1){
            return 1;
        }
        else {
            int temp=1,oldsum=0,sum=1;
            for(int i=1;i<target;i++){
                sum*=2;
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        System.out.println(new JumpFloorII().JumpFloorII(5));
    }
}
