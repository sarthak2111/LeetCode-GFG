public class MergeTwoArray {
    public static void main(String[] args) {
        long arr2[] = new long[]{1,3,5,7};
        long arr1[] = new long[]{0,2,6,8,9};
        int m=5,n=4;
//        long a[] = new long[m+n];
//        int k=0,b=0;
//        boolean f1=true, f2=true;
//
//        for(int i=0;i<(m+n);i++){
//            if(f1 && f2 && arr1[k]<=arr2[b]){
//                a[i]=arr1[k];
//                if(k==m-1){
//                   f1=false;
//                }
//                else{
//                    k++;
//                }
//            }
//            else if(f2 && f1 && arr2[b]<arr1[k]){
//                a[i]=arr2[b];
//                if(b==n-1){
//                    f2=false;
//                }
//                else{
//                    b++;
//                }
//            }
//            else if(!f1 && f2){
//                a[i]=arr2[b];
//            }
//            else{
//                a[i]=arr1[k];
//            }
//        }
//        b=0;
//        k=0;
//        for(int i=0;i<(m+n);i++){
//            if(k<m){
//                arr1[k]=a[i];
//                k++;
//            }
//            else{
//                arr2[b]=a[i];
//                b++;
//            }
//        }
        long a[] = new long[m+n];
        int k=0,b=0;
        boolean f1=true, f2=true;

        for(int i=0;i<(m+n);i++){
            if(f1 && f2 && arr1[k]<=arr2[b]){
                a[i]=arr1[k];
                if(k==m-1){
                    f1=false;
                }
                else{
                    k++;
                }
            }
            else if(f2 && f1 && arr2[b]<=arr1[k]){
                a[i]=arr2[b];
                if(b==n-1){
                    f2=false;
                }
                else{
                    b++;
                }
            }
            else if(!f1 && f2){
                a[i]=arr2[b];
            }
            else{
                a[i]=arr1[k];
            }
        }
        b=0;
        k=0;
        for(int i=0;i<(m+n);i++){
            if(m>=n){
                if(k<m){
                    arr1[k]=a[i];
                    k++;
                }
                else{
                    arr2[b]=a[i];
                    b++;
                }
            }
            else{
                if(b<n){
                    arr2[b]=a[i];
                    b++;
                }
                else{
                    arr1[k]=a[i];
                    k++;
                }
            }
        }
    }
}
