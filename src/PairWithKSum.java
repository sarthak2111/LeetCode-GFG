import java.util.Arrays;

public class PairWithKSum {
    public static void main(String[] args) {
        int[] inputList = new int[]{5,4,2,1};
        int sumK = 0;
        int n = inputList.length;
        Arrays.sort(inputList);
        sumK = inputList[0]+inputList[n-1];
        int printValue = getEff(inputList, sumK);
        System.out.println(printValue);
        System.out.println("$"+Integer.MAX_VALUE+" only for this");
    }

    private static int getEff(int[] inputList, int sumK) {
        int j = inputList.length-1;
        int returnValue = 0;
        for(int i = 0 ; i < (inputList.length/2) ; i++,j--){
            if(inputList[i]+inputList[j] == sumK){
                returnValue = returnValue + (inputList[i]*inputList[j]);
            }
            else{
                System.out.println(inputList[i]+ "  :  "+inputList[j]);
                return -1;
            }
        }
        return returnValue;
    }
}
