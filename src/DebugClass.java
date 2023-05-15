import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DebugClass {
    public static boolean canJump(int[] nums) {
        int len = nums.length;
        if (len > 1) {
            if(nums[0]==0){
                return false;
            }
            else {
                int length = len - 1;
                for (int i = 0; i < len; i++) {
                    if (nums[i] >= length && i == 0) {
                        return true;
                    }
                    if (nums[i] >= length && i > 0 && nums[i - 1] != 0 && length!=0) {
                        return true;
                    }
                    length--;
                }
                return false;
            }
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
//        int x = -32100;
//        boolean hasmI
//        String str = new String();
//        StringBuilder sb = new StringBuilder();
//        str=str+x;
//        String[] s = str.split("");
//        if(s[0].equals("-")){
//            str=str.replace("-","");
//        }
//        sb.append(str);
//        sb.reverse();
//        System.out.println(Integer.valueOf(sb.toString()));
//        int[] nums = new int[]{3,0,8,2,0,0,1};
//        System.out.println(canJump(nums));
            List<String> list = new ArrayList<>(Arrays.asList("Sarthak", "Raj", "Ramesh", "Chhavi"));
            Collections.sort(list,new ComparatorImplementation());
            System.out.println(list);
    }
}

