public class MinCharAppendedAtFirstToMakeStrPalindrome {
    public static void main(String[] args) {
        String str = "aacecaaa";
        int n = str.length();
        int i=0, j= str.length()-1, k=0;
        int count=0;
        while(i< j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                count++;
                k++;
                j= n - 1 -  k;
                i = 0;
            }
        }
        System.out.println(count);
    }
}
